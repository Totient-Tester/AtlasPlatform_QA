import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import sun.swing.FilePane.SortableListModel as SortableListModel
import org.eclipse.persistence.internal.oxm.record.json.JSONParser.pair_return as pair_return
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.io.File as File
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Enumeration as Enumeration
import java.util.Properties as Properties
import java.util.concurrent.TimeUnit as TimeUnit
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import java.util.ArrayList as ArrayList
import java.util.Collections as Collections
import java.util.List as List
import java.util.regex.Pattern as Pattern

WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Roles Navigation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> RolesPages

List<WebElement> Roles = new ArrayList<String>()

List<WebElement> Roles_des = new ArrayList<String>()

List<WebElement> Roles_d = new ArrayList<String>()

page = WebUI.getText(findTestObject('ROLES/Roles_page/Pagination/label_of 10'))

page_nos = page.substring(3)

println(page_nos)

int n_pages = Integer.parseInt(page_nos)

for (int i = 1; i <= n_pages; i++) {
    RolesPages = WebUiCommonHelper.findWebElements(findTestObject('ROLES/Roles_page/RoleListingGrid/Role_name'), 30)

    //	 Roles = new ArrayList<String>()
    for (WebElement a : RolesPages) {
        String role = a.getText()

        Roles.add(role)

        Roles_des.add(role)
    }
    
    WebUI.click(findTestObject('ROLES/Roles_page/Pagination/front_navigation'))
}

println(Roles.size())

//println(Roles)
Collections.sort(Roles)

//println(Roles_asc)
Collections.sort(Roles_des, Collections.reverseOrder())

//println(Roles_des)
WebUI.click(findTestObject('ROLES/Roles_page/User_module'))

WebUI.click(findTestObject('ROLES/Roles_page/Roles_module'))

WebUI.click(findTestObject('ROLES/Roles_page/RoleListingGrid/Role_header'))

for (int i = 1; i <= n_pages; i++) {
    RolesPages = WebUiCommonHelper.findWebElements(findTestObject('ROLES/Roles_page/RoleListingGrid/Role_name'), 30)

    //	 Roles = new ArrayList<String>()
    for (WebElement a : RolesPages) {
        String role_d = a.getText()

        Roles_d.add(role_d)
    }
    
    WebUI.click(findTestObject('ROLES/Roles_page/Pagination/front_navigation'))
}

println(Roles_des)

println(Roles_d)

not_run: WebUI.verifyNotEqual(Roles_des, Roles_d)

WebUI.verifyEqual(Roles_des, Roles_d)


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

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/Default Logins/Default_Login_as_Root Admin'), 
    [('Email') : findTestData('AMP_Y').getValue(1, 1), ('Password') : findTestData('AMP_Y').getValue(2, 1), ('dashboard_exp_title') : ''], 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('ROLES/Role_Navigation/a_ADMIN'))

WebDriver driver = DriverFactory.getWebDriver()

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Search text field/input_All Roles (1842)_form-control'), 
    Search_placeholder, 'Search', 30)

GlobalVariable.ROLENAME1 = findTestData('Roles').getValue(3, 1)

WebUI.click(findTestObject('ROLES/Roles_page/Create Role_button'))

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), GlobalVariable.ROLENAME1)

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/textarea_Role Description_description'), findTestData('Roles').getValue(
        4, 1))

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/div_Create'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Search_placeholder'), GlobalVariable.ROLENAME1 + Keys.ENTER)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('ROLES/Roles_page/role name'), GlobalVariable.ROLENAME1)

WebUI.click(findTestObject('ROLES/Roles_page/Search text field/clear button'))

GlobalVariable.RoleNotCreated = findTestData('Roles').getValue(3, 3)

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Search_placeholder'), GlobalVariable.RoleNotCreated + Keys.ENTER)

WebUI.delay(1)

//WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Search text field/NoRecordsFound'))
WebUI.click(findTestObject('ROLES/Roles_page/Search text field/clear button'))

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Search_placeholder'), Role)

List<WebElement> AllAutoSug = new ArrayList<String>()

List<WebElement> autoSug = WebUiCommonHelper.findWebElements(findTestObject('ROLES/Roles_page/Search text field/autosuggestion_Roles'), 
    2)

autoSugCount1 = autoSug.size()

autoSugCount2 = 0

for (WebElement a : autoSug) {
    a1 = a.getText()

    if (a1.contains('role')) {
        autoSugCount2++
    } else if (a1.contains(Role)) {
        autoSugCount2++
    }
}

WebUI.verifyEqual(autoSugCount1, autoSugCount2)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/Clear_button'))


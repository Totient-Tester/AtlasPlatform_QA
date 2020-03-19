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

WebDriver driver = DriverFactory.getWebDriver()

not_run: WebUI.click(findTestObject('ROLES/Role_Navigation/a_ADMIN'))

noOfPages_text = WebUI.getText(findTestObject('ROLES/Roles_page/Pagination/label_of 10'))

int noOfPages = Integer.parseInt(noOfPages_text.substring(3))

println(noOfPages)

for (j = 1; j < 3; j++) {
    WebUI.click(findTestObject('ROLES/Roles_page/sorting/No.Users_header'))

    List<WebElement> NoOfUsers

    List<WebElement> AllNoOfUsers = new ArrayList<String>()

    for (int i = 1; i <= noOfPages; i++) {
        NoOfUsers = WebUiCommonHelper.findWebElements(findTestObject('ROLES/Roles_page/sorting/No.Users'), 2)

        for (WebElement a : NoOfUsers) {
            AllNoOfUsers.add(a.getText().toLowerCase())
        }
        
        WebUI.click(findTestObject('ROLES/Roles_page/Pagination/front_navigation'))
    }
    
    if (j == 1) {
        boolean isSorted = CustomKeywords.'web.CustomKeyword.checkListDescending'(AllNoOfUsers)

        println(AllNoOfUsers.size())

        println(AllNoOfUsers)

        WebUI.verifyEqual(isSorted, true)

        WebUI.clearText(findTestObject('Object Repository/ROLES/Roles_page/Pagination/input_Page_form-control'))

        WebUI.setText(findTestObject('Object Repository/ROLES/Roles_page/Pagination/input_Page_form-control'), ((Keys.BACK_SPACE + 
            Keys.BACK_SPACE) + '1') + Keys.ENTER)
    }
    
    if (j == 2) {
        boolean isSorted = CustomKeywords.'web.CustomKeyword.checkListAscendingOrder'(AllNoOfUsers)

        println(AllNoOfUsers.size())

        println(AllNoOfUsers)

        WebUI.verifyEqual(isSorted, true)
    }
}


WebUI.clearText(findTestObject('Object Repository/ROLES/Roles_page/Pagination/input_Page_form-control'))

WebUI.setText(findTestObject('Object Repository/ROLES/Roles_page/Pagination/input_Page_form-control'), ((Keys.BACK_SPACE +
	Keys.BACK_SPACE) + '1') + Keys.ENTER)


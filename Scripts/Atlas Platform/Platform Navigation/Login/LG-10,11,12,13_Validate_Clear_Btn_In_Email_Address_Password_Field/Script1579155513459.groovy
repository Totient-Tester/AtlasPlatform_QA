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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Login_Page/Page_/email address placeholder'), email, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Email Address_clear_svg-icon'), 0)

'Verify availability of "Cancel" button in "Email Address" field'
WebUI.click(findTestObject('Login_Page/Page_/Email Address_clear_svg-icon'), FailureHandling.CONTINUE_ON_FAILURE)

getEmail = WebUI.getText(findTestObject('Login_Page/Page_/email address placeholder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/email address placeholder'), '', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Login_Page/Page_/Password placeholder'), password, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Password_clear_svg-icon'), 0)

'Verify availability of "Cancel" button in "Password" field'
WebUI.click(findTestObject('Login_Page/Page_/Password_clear_svg-icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Error Message_Password-Required field'), 0)

String getPassword = WebUI.getText(findTestObject('Login_Page/Page_/Password placeholder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/Password placeholder'), '', FailureHandling.CONTINUE_ON_FAILURE)


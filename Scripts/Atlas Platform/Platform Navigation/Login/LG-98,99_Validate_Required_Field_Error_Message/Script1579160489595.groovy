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
import groovy.json.internal.Exceptions as Exceptions
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Login_Page/Page_/Log In button'))

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Error Message_Email Address-Required Field'), 30)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/Error Message_Email Address-Required Field'), findTestData('Login page CSS').getValue(
        3, 17), FailureHandling.CONTINUE_ON_FAILURE)

String email_clr_act = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Error Message_Email Address-Required Field'), 
    findTestData('Login page CSS').getValue(4, 1))

WebUI.verifyEqual(email_clr_act, findTestData('Login page CSS').getValue(4, 17), FailureHandling.CONTINUE_ON_FAILURE)

//>>>>>>> 04a6398fb4e214a4c7cb9fceb064be1469783ad6
String email_err_font_size = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Error Message_Email Address-Required Field'), 
    findTestData('Login page CSS').getValue(5, 1))

WebUI.verifyEqual(email_err_font_size, findTestData('Login page CSS').getValue(5, 18), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/email address user svg icon'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Error Message_Password-Required field'), 30)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/Error Message_Password-Required field'), findTestData('Login page CSS').getValue(
        3, 18), FailureHandling.CONTINUE_ON_FAILURE)

String email_clr_act2 = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Error Message_Password-Required field'), findTestData(
        'Login page CSS').getValue(4, 1))

WebUI.verifyEqual(email_clr_act2, findTestData('Login page CSS').getValue(4, 17), FailureHandling.CONTINUE_ON_FAILURE)

//>>>>>>> 04a6398fb4e214a4c7cb9fceb064be1469783ad6
String email_err_font_size2 = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Error Message_Password-Required field'), 
    findTestData('Login page CSS').getValue(5, 1))

WebUI.verifyEqual(email_err_font_size2, findTestData('Login page CSS').getValue(5, 18), FailureHandling.CONTINUE_ON_FAILURE)


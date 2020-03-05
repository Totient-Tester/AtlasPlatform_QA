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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://dqfn4clx0bazt.cloudfront.net/')

not_run: WebUI.setText(findTestObject('Login_Page/Page_/email address placeholder'), Email)

not_run: WebUI.setText(findTestObject('Login_Page/Page_/Password placeholder'), Password)

not_run: WebUI.click(findTestObject('Login_Page/Page_/Log In button'))

WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/Default Logins/Default_Login_as_Root Admin'), 
    [('Email') : findTestData('AMP_Y').getValue(1, 1), ('Password') : findTestData('AMP_Y').getValue(2, 1), ('dashboard_exp_title') : ''], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/div_Invalid Email Format'), 30)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/div_Invalid Email Format'), findTestData('AMP').getValue(6, 1), 
    FailureHandling.CONTINUE_ON_FAILURE)

String email_clr_act = WebUI.getCSSValue(findTestObject('Login_Page/Page_/div_Invalid Email Format'), findTestData('AMP').getValue(
        5, 2))

WebUI.verifyEqual(email_clr_act, findTestData('AMP').getValue(6, 2), FailureHandling.CONTINUE_ON_FAILURE)

//>>>>>>> 04a6398fb4e214a4c7cb9fceb064be1469783ad6
String email_err_font_size = WebUI.getCSSValue(findTestObject('Login_Page/Page_/div_Invalid Email Format'), findTestData(
        'Login page CSS').getValue(4, 1))

WebUI.verifyEqual(email_err_font_size, findTestData('AMP').getValue(6, 3), FailureHandling.CONTINUE_ON_FAILURE)

//>>>>>>> 04a6398fb4e214a4c7cb9fceb064be1469783ad6
println(email_clr_act)

println(email_err_font_size)

println(email_err_font_fmly)


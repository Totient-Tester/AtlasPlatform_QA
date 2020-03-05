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

WebUI.navigateToUrl('http://dqfn4clx0bazt.cloudfront.net')

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Email Address heading'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/Email Address heading'), findTestData('Login page CSS').getValue(
        3, 3), FailureHandling.CONTINUE_ON_FAILURE)

clr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Email Address heading'), findTestData('Login page CSS').getValue(
        4, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(clr, findTestData('Login page CSS').getValue(4, 3), FailureHandling.CONTINUE_ON_FAILURE)

fontSize = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Email Address heading'), findTestData('Login page CSS').getValue(
        5, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(fontSize, findTestData('Login page CSS').getValue(5, 3), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/email address text box'), 0, FailureHandling.CONTINUE_ON_FAILURE)

bgclr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/email address text box'), findTestData('Login page CSS').getValue(
        6, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(bgclr, findTestData('Login page CSS').getValue(6, 4), FailureHandling.CONTINUE_ON_FAILURE)

width = WebUI.getCSSValue(findTestObject('Login_Page/Page_/email address text box'), findTestData('Login page CSS').getValue(
        7, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(width, findTestData('Login page CSS').getValue(7, 4), FailureHandling.CONTINUE_ON_FAILURE)

height = WebUI.getCSSValue(findTestObject('Login_Page/Page_/email address text box'), findTestData('Login page CSS').getValue(
        8, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(height, findTestData('Login page CSS').getValue(8, 4), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/email address placeholder'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Login_Page/Page_/email address placeholder'), 'placeholder', findTestData(
        'Login page CSS').getValue(3, 5), 0, FailureHandling.CONTINUE_ON_FAILURE)

clr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/email address placeholder'), findTestData('Login page CSS').getValue(
        4, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(clr, findTestData('Login page CSS').getValue(4, 5), FailureHandling.CONTINUE_ON_FAILURE)

fontSize = WebUI.getCSSValue(findTestObject('Login_Page/Page_/email address placeholder'), findTestData('Login page CSS').getValue(
        5, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(fontSize, findTestData('Login page CSS').getValue(5, 5), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Email Address_clear_svg-icon'), 0, FailureHandling.CONTINUE_ON_FAILURE)

svg = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Email Address_clear_svg-icon'), findTestData('Login page CSS').getValue(
        9, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(svg, findTestData('Login page CSS').getValue(9, 6), FailureHandling.CONTINUE_ON_FAILURE)

svg = WebUI.getCSSValue(findTestObject('Login_Page/Page_/email address user svg icon'), findTestData('Login page CSS').getValue(
        9, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(svg, findTestData('Login page CSS').getValue(9, 7), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Password heading'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/Password heading'), findTestData('Login page CSS').getValue(3, 
        8), FailureHandling.CONTINUE_ON_FAILURE)

clr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Password heading'), findTestData('Login page CSS').getValue(4, 
        1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(clr, findTestData('Login page CSS').getValue(4, 8), FailureHandling.CONTINUE_ON_FAILURE)

fontSize = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Password heading'), findTestData('Login page CSS').getValue(
        5, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(fontSize, findTestData('Login page CSS').getValue(5, 8), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Password textbox'), 0, FailureHandling.CONTINUE_ON_FAILURE)

bgclr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Password textbox'), findTestData('Login page CSS').getValue(6, 
        1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(bgclr, findTestData('Login page CSS').getValue(6, 9), FailureHandling.CONTINUE_ON_FAILURE)

width = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Password textbox'), findTestData('Login page CSS').getValue(7, 
        1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(width, findTestData('Login page CSS').getValue(7, 9), FailureHandling.CONTINUE_ON_FAILURE)

height = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Password textbox'), findTestData('Login page CSS').getValue(
        8, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(height, findTestData('Login page CSS').getValue(8, 9), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Password placeholder'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Login_Page/Page_/Password placeholder'), 'placeholder', findTestData('Login page CSS').getValue(
        3, 10), 0, FailureHandling.CONTINUE_ON_FAILURE)

clr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Password placeholder'), findTestData('Login page CSS').getValue(
        4, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(clr, findTestData('Login page CSS').getValue(4, 10), FailureHandling.CONTINUE_ON_FAILURE)

fontSize = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Password placeholder'), findTestData('Login page CSS').getValue(
        5, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(fontSize, findTestData('Login page CSS').getValue(5, 10), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Password_clear_svg-icon'), 0, FailureHandling.CONTINUE_ON_FAILURE)

svg = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Password_clear_svg-icon'), findTestData('Login page CSS').getValue(
        9, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(svg, findTestData('Login page CSS').getValue(9, 11), FailureHandling.CONTINUE_ON_FAILURE)

svg = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Password lock svg icon'), findTestData('Login page CSS').getValue(
        9, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(svg, findTestData('Login page CSS').getValue(9, 12), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Log In button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/Log In button'), findTestData('Login page CSS').getValue(3, 13), 
    FailureHandling.CONTINUE_ON_FAILURE)

clr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Log In button'), findTestData('Login page CSS').getValue(4, 1), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(clr, findTestData('Login page CSS').getValue(4, 13), FailureHandling.CONTINUE_ON_FAILURE)

fontSize = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Log In button'), findTestData('Login page CSS').getValue(5, 
        1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(fontSize, findTestData('Login page CSS').getValue(5, 13), FailureHandling.CONTINUE_ON_FAILURE)

bgclr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Log In button'), findTestData('Login page CSS').getValue(6, 1), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(bgclr, findTestData('Login page CSS').getValue(6, 13), FailureHandling.CONTINUE_ON_FAILURE)

width = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Log In button'), findTestData('Login page CSS').getValue(7, 1), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(width, findTestData('Login page CSS').getValue(7, 13), FailureHandling.CONTINUE_ON_FAILURE)

height = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Log In button'), findTestData('Login page CSS').getValue(8, 
        1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(height, findTestData('Login page CSS').getValue(8, 13), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Forgot Password'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/Forgot Password'), findTestData('Login page CSS').getValue(3, 14), 
    FailureHandling.CONTINUE_ON_FAILURE)

clr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Forgot Password'), findTestData('Login page CSS').getValue(4, 1), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(clr, findTestData('Login page CSS').getValue(4, 14), FailureHandling.CONTINUE_ON_FAILURE)

fontSize = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Forgot Password'), findTestData('Login page CSS').getValue(
        5, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(fontSize, findTestData('Login page CSS').getValue(5, 14), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Footer Contact'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/Footer Contact'), findTestData('Login page CSS').getValue(3, 16), 
    FailureHandling.CONTINUE_ON_FAILURE)

clr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Footer Contact'), findTestData('Login page CSS').getValue(4, 1), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(clr, findTestData('Login page CSS').getValue(4, 16), FailureHandling.CONTINUE_ON_FAILURE)

fontSize = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Footer Contact'), findTestData('Login page CSS').getValue(
        5, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(fontSize, findTestData('Login page CSS').getValue(5, 16), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Footer 2019 GS Marketing All Rights Reserved'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/Footer 2019 GS Marketing All Rights Reserved'), findTestData('Login page CSS').getValue(
        3, 15), FailureHandling.CONTINUE_ON_FAILURE)

clr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Footer 2019 GS Marketing All Rights Reserved'), findTestData('Login page CSS').getValue(
        4, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(clr, findTestData('Login page CSS').getValue(4, 15), FailureHandling.CONTINUE_ON_FAILURE)

fontSize = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Footer 2019 GS Marketing All Rights Reserved'), findTestData(
        'Login page CSS').getValue(5, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(fontSize, findTestData('Login page CSS').getValue(5, 15), FailureHandling.CONTINUE_ON_FAILURE)


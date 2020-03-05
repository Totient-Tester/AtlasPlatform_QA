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

WebUI.verifyElementPresent(findTestObject('Login_Page/Page_/Footer 2019 GS Marketing All Rights Reserved'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login_Page/Page_/Footer 2019 GS Marketing All Rights Reserved'), findTestData('Login page CSS').getValue(
        3, 15), FailureHandling.CONTINUE_ON_FAILURE)

txt = WebUI.getText(findTestObject('Login_Page/Page_/Footer 2019 GS Marketing All Rights Reserved'))

ftxt = txt.substring(0, txt.length() - 7)

WebUI.verifyEqual(ftxt, findTestData('Login page CSS').getValue(3, 15), FailureHandling.CONTINUE_ON_FAILURE)

clr = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Footer 2019 GS Marketing All Rights Reserved'), findTestData('Login page CSS').getValue(
        4, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(clr, findTestData('Login page CSS').getValue(4, 15), FailureHandling.CONTINUE_ON_FAILURE)

fontSize = WebUI.getCSSValue(findTestObject('Login_Page/Page_/Footer 2019 GS Marketing All Rights Reserved'), findTestData(
        'Login page CSS').getValue(5, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(fontSize, findTestData('Login page CSS').getValue(5, 15), FailureHandling.CONTINUE_ON_FAILURE)


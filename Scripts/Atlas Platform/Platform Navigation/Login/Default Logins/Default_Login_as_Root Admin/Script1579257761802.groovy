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
import org.openqa.selenium.WebDriver as WebDriver
//import org.openqa.selenium.interactions.Actions
//import com.kms.katalon.core.webui.driver.DriverFactory
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

not_run: WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/Default Logins/TC_100_ForSecurityURLSAcceptance'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//WebDriver driver = DriverFactory.getWebDriver()
WebUI.navigateToUrl('https://atlas-dev.gsm.auto/')

WebUI.setText(findTestObject('Login_Page/Page_/email address placeholder'), Email)

WebUI.setText(findTestObject('Login_Page/Page_/Password placeholder'), Password)

WebUI.click(findTestObject('Login_Page/Page_/Log In button'))

dashboard_act_title = WebUI.getWindowTitle()

WebUI.verifyEqual(dashboard_act_title, dashboard_exp_title)


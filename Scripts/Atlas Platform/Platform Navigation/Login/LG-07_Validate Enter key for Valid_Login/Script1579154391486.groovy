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

WebUI.openBrowser('')

//WebDriver driver = DriverFactory.getWebDriver()
WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Login_Page/Page_/email address placeholder'), Email)

WebUI.setText(findTestObject('Login_Page/Page_/Password placeholder'), Password)

Robot r = new Robot()

r.keyPress(KeyEvent.VK_ENTER)

r.keyRelease(KeyEvent.VK_ENTER)

dashboard_act_title = WebUI.getWindowTitle()

WebUI.verifyEqual(dashboard_act_title, dashboard_exp_title)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/AUDIENCE Module'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/CONTENT Module'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/MESSAGING Module'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/REPORTING Module'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/ADMIN Module'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/Switcher'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/AMP LOGO img'), 0)


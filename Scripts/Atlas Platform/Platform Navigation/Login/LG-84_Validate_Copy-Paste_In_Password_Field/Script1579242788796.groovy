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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Login_Page/Page_/email address placeholder'), email, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Login_Page/Page_/email address text box'))

Robot r = new Robot()

r.keyPress(KeyEvent.VK_CONTROL)

r.keyPress(KeyEvent.VK_A)

r.keyRelease(KeyEvent.VK_A)

r.keyRelease(KeyEvent.VK_CONTROL)

WebUI.rightClick(findTestObject('Login_Page/Page_/email address text box'))

r.keyPress(KeyEvent.VK_C)

r.keyRelease(KeyEvent.VK_C)

WebUI.rightClick(findTestObject('Login_Page/Page_/Password placeholder'))

r.keyPress(KeyEvent.VK_P)

r.keyRelease(KeyEvent.VK_P)

WebUI.verifyElementAttributeValue(findTestObject('Login_Page/Page_/Password placeholder'), 'value', '', 0)


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys
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

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/others/Navigation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ROLES/Role_Navigation/messaging'))

WebUI.sendKeys(findTestObject('Marketing Automation/Search/Search input'), 'Marketing Automation 1' + Keys.ENTER)

WebUI.verifyElementText(findTestObject('Marketing Automation/Search/created Marketing Automation name'), 'Marketing Automation 1')

WebUI.click(findTestObject('Marketing Automation/Search/created Marketing Automation name'))

WebUI.verifyElementAttributeValue(findTestObject('Marketing Automation/Search/Marketing automation name'), 'value', 'Marketing Automation 1', 
    0)

WebUI.delay(3)

WebUI.closeBrowser()


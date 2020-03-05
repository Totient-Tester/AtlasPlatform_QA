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

WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Roles Navigation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ROLES/Roles_page/Role Manager_Expand button'))

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Super Admin'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Bundle Admin'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Services Admin'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Organization Admin'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Account Admin'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/GSM Sales'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Customer Success'), 0)


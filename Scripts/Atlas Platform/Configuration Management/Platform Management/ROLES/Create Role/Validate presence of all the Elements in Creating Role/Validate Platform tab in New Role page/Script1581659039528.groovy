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

WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Roles Navigation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ROLES/Roles_page/Create New Role_button'))

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/a_Platform'))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/h2_Platform'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/checkbox_User Create'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/platform/checkbox_User Create'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/span_User Create'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/label_Availability'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/radiobutton_AllAccounts'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/platform/radiobutton_AllAccounts'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/label_All Accounts'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/radiobutton_AddAffiliation'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/label_Affilaton'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/searchbox_affiliation'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/Select_affiliationPlaceholder'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/dropdown_affiliation'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/button_Add Affilation'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/radiobutton_AddAccount'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/label_Account'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/searchbox_account'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/Select_accountPlaceholder'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/dropdown_account'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/button_Add Account'), 0)


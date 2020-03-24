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

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/h2_New Role'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/a_Role Properties'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/a_Platform'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/a_Content Features'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/a_Audience Features'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/a_Message Features'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/a_Report Features'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/h2_Role Properties'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/label_Role Name'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/label_Role Description'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/textarea_Role Description_description'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/button_Cancel'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/div_Create'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/Role Properties_collapse button'), 0)


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

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/Default Logins/Default_Login_as_Root Admin'), 
    [('Email') : findTestData('AMP_Y').getValue(1, 1), ('Password') : findTestData('AMP_Y').getValue(2, 1), ('dashboard_exp_title') : ''], 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('ROLES/Role_Navigation/a_ADMIN'))

not_run: WebUI.click(findTestObject('ROLES/Roles_page/Create Role_button'))

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/New Role_page/tickMark_roleProperties'), 0)

WebUI.verifyElementHasAttribute(findTestObject('ROLES/Create Role/New Role_page/div_Create'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/button_Cancel'))

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Role Manager'), 0)

WebUI.click(findTestObject('ROLES/Roles_page/Create Role_button'))

GlobalVariable.ROLENAME1 = findTestData('Roles').getValue(3, 1)

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), GlobalVariable.ROLENAME1)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), findTestData('Roles').getValue(
        8, 1), GlobalVariable.ROLENAME1, 0)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/button_Cancel'))

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/No Stay_button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/button_Cancel'))

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/Yes Leave_button'))

WebUI.click(findTestObject('ROLES/Roles_page/Create Role_button'))

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), GlobalVariable.ROLENAME1)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/Clear_button'))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/Required field'), 0)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), findTestData('Roles').getValue(
        8, 1), findTestData('Roles').getValue(9, 1), 0)

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), GlobalVariable.ROLENAME1)

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/textarea_Role Description_description'), findTestData('Roles').getValue(
        4, 1))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/New Role_page/textarea_Role Description_description'), 
    findTestData('Roles').getValue(8, 1), findTestData('Roles').getValue(4, 1), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/tab_expanded'), 0)

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/New Role_page/tab_minimized'), 0)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/expand and collapse button'))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/tab_minimized'), 0)

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/New Role_page/tab_expanded'), 0)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/expand and collapse button'))

WebUI.verifyElementNotHasAttribute(findTestObject('ROLES/Create Role/New Role_page/div_Create'), findTestData('Roles').getValue(
        8, 2), 0)

not_run: WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/tickMark_roleProperties'), 0)

not_run: WebUI.click(findTestObject('ROLES/Create Role/New Role_page/div_Create'))

not_run: WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Role Manager'), 0)


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

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/New Role_page/tickMark_roleProperties'), 0)

WebUI.verifyElementHasAttribute(findTestObject('ROLES/Create Role/New Role_page/div_Create'), findTestData('Roles').getValue(
        1, 2), 0)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/button_Cancel'))

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Role Manager'), 0)

WebUI.click(findTestObject('ROLES/Roles_page/Create New Role_button'))

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), findTestData('Roles').getValue(2, 
        1))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), findTestData('Roles').getValue(
        1, 1), findTestData('Roles').getValue(2, 1), 0)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/button_Cancel'))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/cancel_role'), 0)

WebUI.click(findTestObject('ROLES/Create Role/confirm_button'))

not_run: WebUI.verifyElementPresent(findTestObject(null), 0)

WebUI.click(findTestObject('ROLES/Roles_page/Create New Role_button'))

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), findTestData('Roles').getValue(2, 
        1))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), findTestData('Roles').getValue(
        1, 1), findTestData('Roles').getValue(2, 1), 0)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/Clear_button'))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/Required field'), 0)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), findTestData('Roles').getValue(
        1, 1), findTestData('Roles').getValue(2, 2), 0)

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), findTestData('Roles').getValue(2, 
        1))

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/textarea_Role Description_description'), findTestData('Roles').getValue(
        3, 1))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/New Role_page/textarea_Role Description_description'), 
    findTestData('Roles').getValue(1, 1), findTestData('Roles').getValue(3, 1), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/tab_expanded'), 0)

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/New Role_page/tab_minimized'), 0)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/expand and collapse button'))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/tab_minimized'), 0)

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/New Role_page/tab_expanded'), 0)

WebUI.verifyElementNotHasAttribute(findTestObject('ROLES/Create Role/New Role_page/div_Create'), findTestData('Roles').getValue(
        1, 2), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/New Role_page/tickMark_roleProperties'), 0)

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/div_Create'))

not_run: WebUI.verifyElementPresent(findTestObject(null), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Role Manager'), 0)


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

WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Roles Navigation'), [:])

WebUI.click(findTestObject('ROLES/Roles_page/Create New Role_button'))

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/a_Message Features'))

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/Message Features/tickMark_MessageFeatures'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Approval_No Access'), 230)

WebUI.click(findTestObject('ROLES/Create Role/Message Features/Access_labels/Approval_Read Only'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Approval_No Access'), 
    230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Approval_Read Only'), 230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Batch_No Access'), 230)

WebUI.click(findTestObject('ROLES/Create Role/Message Features/Access_labels/Batch_Read Only'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Batch_No Access'), 230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Batch_Read Only'), 230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Distributed_No Access'), 
    230)

WebUI.click(findTestObject('ROLES/Create Role/Message Features/Access_labels/Distributed_Read Only'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Distributed_No Access'), 
    230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Distributed_Read Only'), 
    230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Marketing_No Access'), 
    230)

WebUI.click(findTestObject('ROLES/Create Role/Message Features/Access_labels/Marketing_Read Only'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Marketing_No Access'), 
    230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Marketing_Read Only'), 
    230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Triggered_No Access'), 
    230)

WebUI.click(findTestObject('ROLES/Create Role/Message Features/Access_labels/Triggered_Read Only'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Triggered_No Access'), 
    230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Triggered_Read Only'), 
    230)

WebUI.click(findTestObject('ROLES/Create Role/Message Features/Access_labels/Approval_All Access'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Approval_Read Only'), 
    230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Approval_All Access'), 
    230)

WebUI.click(findTestObject('ROLES/Create Role/Message Features/Access_labels/Batch_All Access'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Batch_Read Only'), 230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Batch_All Access'), 230)

WebUI.click(findTestObject('ROLES/Create Role/Message Features/Access_labels/Distributed_All Access'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Distributed_Read Only'), 
    230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Distributed_All Access'), 
    230)

WebUI.click(findTestObject('ROLES/Create Role/Message Features/Access_labels/Marketing_All Access'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Marketing_Read Only'), 
    230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Marketing_All Access'), 
    230)

WebUI.click(findTestObject('ROLES/Create Role/Message Features/Access_labels/Triggered_All Access'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Triggered_Read Only'), 
    230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Message Features/Access_radioButton/Triggered_All Access'), 
    230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Message Features/tickMark_MessageFeatures'), 0)


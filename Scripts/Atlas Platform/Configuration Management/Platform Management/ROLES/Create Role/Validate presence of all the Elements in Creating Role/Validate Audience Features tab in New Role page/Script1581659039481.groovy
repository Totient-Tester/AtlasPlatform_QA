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

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/a_Audience Features'))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/h2_Audience Features'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/label_DMS'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/label_Seed List'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/label_Suppression List'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/label_List Cut'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/label_Opt Out'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/DMS_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/DMS_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/DMS_No Access'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/DMS_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Speed_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Speed_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Speed_No Access'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Speed_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Suppression_All Access'), 
    0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Suppression_Read Only'), 
    0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Suppression_No Access'), 
    0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Suppression_No Access'), 
    0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/List_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/List_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/List_No Access'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/List_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Opt_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Opt_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Opt_No Access'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Audience Features/Access_radioButton/Opt_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/DMS_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/DMS_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/DMS_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/Speed_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/Speed_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/Speed_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/Suppression_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/Suppression_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/Suppression_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/List_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/List_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/List_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/Opt_All Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/Opt_Read Only'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/Access_labels/Opt_No Access'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/checkbox_segmentBuilder'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Audience Features/checkbox_segmentBuilder'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Audience Features/span_Segment Builder'), 0)


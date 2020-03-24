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

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/a_Report Features'))

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/Report Features/tickMark_ReportFeatures'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Report Features/rb_No Access_reportSection'), 0)

WebUI.click(findTestObject('ROLES/Create Role/Report Features/span_All Access'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Report Features/rb_No Access_reportSection'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Report Features/rb_All Access_reportSection'), 0)

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Report Features/rb_Global Recommendations_global'), 0)

WebUI.click(findTestObject('ROLES/Create Role/Report Features/span_Global Recommendations'))

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Report Features/rb_Global Recommendations_global'), 0)

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Report Features/rb_Roll Up Reporting'), 0)

WebUI.click(findTestObject('ROLES/Create Role/Report Features/span_Roll Up Reporting'))

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Report Features/rb_Roll Up Reporting'), 0)

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/Report Features/rb_Global Recommendations_global'), 0)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/batch_toggle'), 'value', 'false', 0)

WebUI.click(findTestObject('ROLES/Create Role/Report Features/off_BMR'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/batch_toggle'), 'value', 'true', 0)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/Distributed_toggle'), 'value', 'false', 
    0)

WebUI.click(findTestObject('ROLES/Create Role/Report Features/off_DMR'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/Distributed_toggle'), 'value', 'true', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/Marketing_toggle'), 'value', 'false', 
    0)

WebUI.click(findTestObject('ROLES/Create Role/Report Features/off_MAR'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/Marketing_toggle'), 'value', 'true', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/customReports_toggle'), 'value', 'true', 
    0)

WebUI.click(findTestObject('ROLES/Create Role/Report Features/On_CustomReports'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/customReports_toggle'), 'value', 'false', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/Channel_toggle'), 'value', 'false', 
    0)

WebUI.click(findTestObject('ROLES/Create Role/Report Features/off_ChannelReports'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/Channel_toggle'), 'value', 'true', 0)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/KPI_toggle'), 'value', 'false', 0)

WebUI.click(findTestObject('ROLES/Create Role/Report Features/off_KPI'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/KPI_toggle'), 'value', 'true', 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/tickMark_ReportFeatures'), 0)


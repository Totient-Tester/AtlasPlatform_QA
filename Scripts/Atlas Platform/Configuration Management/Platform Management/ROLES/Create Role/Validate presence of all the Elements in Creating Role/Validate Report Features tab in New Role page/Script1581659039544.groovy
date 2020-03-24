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

WebUI.click(findTestObject('ROLES/Create Role/New Role_page/a_Report Features'))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/h2_Report Features'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/label_Report Section'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/rb_All Access_reportSection'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/rb_No Access_reportSection'), 230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/Report Features/rb_No Access_reportSection'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/span_All Access'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/span_No Access'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/label_global'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/rb_Global Recommendations_global'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/rb_Roll Up Reporting'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/span_Global Recommendations'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/span_Roll Up Reporting'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/label_Batch Messaging Report'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/off_BMR'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/On_BMR'), 230)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/batch_toggle'), 'value', 'false', 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/label_Distributed Marketing Reports'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/off_DMR'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/On_DMR'), 230)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/Distributed_toggle'), 'value', 'false', 
    0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/label_Marketing Automation Reports'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/off_MAR'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/On_MAR'), 230)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/Marketing_toggle'), 'value', 'false', 
    0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/label_Custom Reports'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/off_CustomReports'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/On_CustomReports'), 230)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/customReports_toggle'), 'value', 'true', 
    0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/label_Channel Reports'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/off_ChannelReports'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/On_ChannelReports'), 230)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/Channel_toggle'), 'value', 'false', 
    0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/label_KPI Reports'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/off_KPI'), 230)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/Report Features/On_KPI'), 230)

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/Report Features/KPI_toggle'), 'value', 'false', 0)


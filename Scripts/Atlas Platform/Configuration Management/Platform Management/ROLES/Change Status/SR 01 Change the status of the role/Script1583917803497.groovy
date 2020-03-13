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

rolename = WebUI.getText(findTestObject('ROLES/Roles_page/1st Role name in grid'), FailureHandling.CONTINUE_ON_FAILURE)

currentStatus1 = WebUI.getText(findTestObject('ROLES/Change Status/1st status'))

WebUI.click(findTestObject('ROLES/Roles_page/Hamburger/button_hamburger'))

WebUI.click(findTestObject('ROLES/Change Status/change status link'))

WebUI.verifyElementPresent(findTestObject('ROLES/Change Status/changestatus_label'), 0)

WebUI.verifyElementText(findTestObject('ROLES/Change Status/rolename_in status'), rolename)

WebUI.verifyElementPresent(findTestObject('ROLES/Change Status/select_label'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Change Status/active_label_in status'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Change Status/archived label_in status'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Change Status/currentstatus_label'), 0)

if (currentStatus1 == 'Active') {
    WebUI.click(findTestObject('ROLES/Change Status/archived label_in status'))
} else {
    WebUI.click(findTestObject('ROLES/Change Status/active_label_in status'))
}

WebUI.verifyElementPresent(findTestObject('ROLES/Change Status/note'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Change Status/cancel_button'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Change Status/Confirm_button'), 0)

WebUI.click(findTestObject('ROLES/Change Status/Confirm_button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

currentStatus2 = WebUI.getText(findTestObject('ROLES/Change Status/1st status'))

println(currentStatus1)

println(currentStatus2)

WebUI.verifyNotMatch(currentStatus1, currentStatus2, false)


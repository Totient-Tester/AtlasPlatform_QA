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

WebUI.click(findTestObject('ROLES/Roles_page/Hamburger/button_hamburger'))

WebUI.click(findTestObject('ROLES/Edit Role/edit_link'))

WebUI.verifyElementHasAttribute(findTestObject('ROLES/Edit Role/save button'), findTestData('Roles').getValue(8, 2), 0)

GlobalVariable.ROLENAME1 = findTestData('Roles').getValue(3, 1)

WebUI.sendKeys(findTestObject('ROLES/Create Role/New Role_page/input_Role Name_name'), GlobalVariable.ROLENAME1)

WebUI.sendKeys(findTestObject('ROLES/Edit Role/edit role description'), findTestData('Roles').getValue(4, 1))

WebUI.verifyElementNotHasAttribute(findTestObject('ROLES/Edit Role/save button'), findTestData('Roles').getValue(8, 2), 
    0)

WebUI.click(findTestObject('ROLES/Edit Role/cancel button'))

WebUI.verifyElementPresent(findTestObject('ROLES/Edit Role/cancelConfirmationtext1'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Edit Role/cancelConfirmationtext2'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Edit Role/NoStay_button'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Edit Role/YesLeave_button'), 0)

WebUI.click(findTestObject('ROLES/Edit Role/NoStay_button'))

WebUI.click(findTestObject('ROLES/Edit Role/cancel button'))

WebUI.click(findTestObject('ROLES/Edit Role/YesLeave_button'))

WebUI.click(findTestObject('ROLES/Roles_page/Hamburger/button_hamburger'))

WebUI.click(findTestObject('ROLES/Edit Role/edit_link'))

WebUI.sendKeys(findTestObject('ROLES/Edit Role/edit role description'), findTestData('Roles').getValue(4, 1))

WebUI.click(findTestObject('ROLES/Edit Role/save button'))

WebUI.verifyElementPresent(findTestObject('ROLES/Edit Role/saveConfirmationtext1'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Edit Role/saveConfirmationtext2'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Edit Role/NoCancel_button'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Edit Role/YesSave_button'), 0)

WebUI.click(findTestObject('ROLES/Edit Role/NoCancel_button'))

WebUI.click(findTestObject('ROLES/Edit Role/save button'))

WebUI.click(findTestObject('ROLES/Edit Role/YesSave_button'))


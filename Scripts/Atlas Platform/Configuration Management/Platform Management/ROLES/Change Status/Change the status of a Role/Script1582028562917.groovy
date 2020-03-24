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

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/others/Navigation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('ROLES/Role_Navigation/a_ADMIN'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ROLES/Change Status/role name'), GlobalVariable.ROLENAME2)

WebUI.click(findTestObject('ROLES/Roles_page/Hamburger/button_hamburger'))

WebUI.click(findTestObject('ROLES/Change Status/change status link'))

WebUI.click(findTestObject('ROLES/Change Status/Archived'))

WebUI.click(findTestObject('ROLES/Change Status/Confirm_button'))

WebUI.delay(2)

not_run: println(WebUI.getAttribute(findTestObject('ROLES/Roles_page/Search_placeholder'), 'placeholder'))

not_run: WebUI.click(findTestObject('ROLES/Roles_page/Search_placeholder'))

not_run: WebUI.sendKeys(findTestObject('ROLES/Roles_page/Search_placeholder'), GlobalVariable.ROLENAME2 + Keys.ENTER)

WebUI.verifyElementText(findTestObject('ROLES/Change Status/status_archived'), findTestData('Roles').getValue(5, 2))

WebUI.delay(2)

WebUI.closeBrowser()


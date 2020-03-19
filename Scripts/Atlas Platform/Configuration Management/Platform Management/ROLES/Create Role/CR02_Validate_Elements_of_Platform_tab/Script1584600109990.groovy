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

not_run: WebUI.click(findTestObject('ROLES/Create Role/New Role_page/a_Platform'))

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/platform/tickMark_Platform'), 0)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/platform/checkbox_User Create'), 230)

WebUI.click(findTestObject('ROLES/Create Role/platform/span_User Create'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/platform/checkbox_User Create'), 230)

WebUI.click(findTestObject('ROLES/Create Role/platform/span_User Create'))

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/platform/checkbox_User Create'), 230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/platform/radiobutton_AllAccounts'), 230)

WebUI.verifyElementHasAttribute(findTestObject('ROLES/Create Role/platform/searchbox_affiliation'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.verifyElementHasAttribute(findTestObject('ROLES/Create Role/platform/dropdown_affiliation'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.verifyElementHasAttribute(findTestObject('ROLES/Create Role/platform/button_Add Affilation'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.click(findTestObject('ROLES/Create Role/platform/label_Affilaton'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/platform/radiobutton_AllAccounts'), 230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/platform/radiobutton_AddAffiliation'), 230)

WebUI.verifyElementNotHasAttribute(findTestObject('ROLES/Create Role/platform/searchbox_affiliation'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.verifyElementNotHasAttribute(findTestObject('ROLES/Create Role/platform/dropdown_affiliation'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.verifyElementNotHasAttribute(findTestObject('ROLES/Create Role/platform/button_Add Affilation'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.sendKeys(findTestObject('ROLES/Create Role/platform/Select_affiliationPlaceholder'), findTestData('Roles').getValue(
        6, 1))

not_run: WebUI.verifyElementVisibleInViewport(findTestObject('ROLES/Create Role/platform/affiliation_1st one'), 230)

not_run: WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/affiliation_1st one'), 230)

WebUI.click(findTestObject('ROLES/Create Role/platform/affiliation_1st one'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ROLES/Create Role/platform/button_Add Affilation'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/affiliation_added'), 0)

WebUI.click(findTestObject('ROLES/Create Role/platform 2/delete icon_affiliation'))

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/platform/affiliation_added'), 0)

WebUI.click(findTestObject('ROLES/Create Role/platform/label_All Accounts'))

WebUI.click(findTestObject('ROLES/Create Role/platform/label_Affilaton'))

WebUI.sendKeys(findTestObject('ROLES/Create Role/platform/Select_affiliationPlaceholder'), findTestData('Roles').getValue(
        6, 2))

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/platform/Results_search text field'), 230)

WebUI.click(findTestObject('ROLES/Create Role/platform/label_All Accounts'))

WebUI.click(findTestObject('ROLES/Create Role/platform/label_Affilaton'))

not_run: WebUI.sendKeys(findTestObject('ROLES/Create Role/platform/Select_affiliationPlaceholder'), findTestData('Roles').getValue(
        6, 1))

not_run: WebUI.click(findTestObject('ROLES/Create Role/platform/affiliation_1st one'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/platform/Select_affiliationPlaceholder'), findTestData(
        'Roles').getValue(1, 1), findTestData('Roles').getValue(4, 1), 230)

WebUI.click(findTestObject('ROLES/Create Role/platform/dropdown_affiliation'))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/Results_search text field'), 0)

WebUI.click(findTestObject('ROLES/Create Role/platform/affiliation_1st one'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ROLES/Create Role/platform/button_Add Affilation'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/affiliation_added'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/delete icon_platform tab'), 0)

WebUI.click(findTestObject('ROLES/Create Role/platform 2/delete icon_affiliation'))

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/platform/affiliation_added'), 0)

WebUI.verifyElementHasAttribute(findTestObject('ROLES/Create Role/platform/searchbox_account'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.verifyElementHasAttribute(findTestObject('ROLES/Create Role/platform/dropdown_account'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.verifyElementHasAttribute(findTestObject('ROLES/Create Role/platform/button_Add Account'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.click(findTestObject('ROLES/Create Role/platform/label_Account'))

WebUI.verifyElementNotChecked(findTestObject('ROLES/Create Role/platform/radiobutton_AddAffiliation'), 230)

WebUI.verifyElementChecked(findTestObject('ROLES/Create Role/platform/radiobutton_AddAccount'), 230)

WebUI.verifyElementNotHasAttribute(findTestObject('ROLES/Create Role/platform/searchbox_account'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.verifyElementNotHasAttribute(findTestObject('ROLES/Create Role/platform/dropdown_account'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.verifyElementNotHasAttribute(findTestObject('ROLES/Create Role/platform/button_Add Account'), findTestData('Roles').getValue(
        8, 2), 0)

WebUI.sendKeys(findTestObject('ROLES/Create Role/platform/Select_accountPlaceholder'), findTestData('Roles').getValue(7, 
        1))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/account_1st one'), 230)

WebUI.click(findTestObject('ROLES/Create Role/platform/account_1st one'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ROLES/Create Role/platform/button_Add Account'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/account_Toyoto_added'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/delete icon_platform tab'), 0)

WebUI.click(findTestObject('ROLES/Create Role/platform 2/delete icon_affiliation'))

WebUI.delay(2)

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/platform/account_Toyoto_added'), 0)

WebUI.click(findTestObject('ROLES/Create Role/platform/label_All Accounts'))

WebUI.click(findTestObject('ROLES/Create Role/platform/label_Account'))

WebUI.sendKeys(findTestObject('ROLES/Create Role/platform/Select_accountPlaceholder'), findTestData('Roles').getValue(7, 
        2))

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/platform/Results_search text field'), 230)

WebUI.click(findTestObject('ROLES/Create Role/platform/label_All Accounts'))

WebUI.click(findTestObject('ROLES/Create Role/platform/label_Account'))

not_run: WebUI.sendKeys(findTestObject('ROLES/Create Role/platform/Select_accountPlaceholder'), findTestData('Roles').getValue(
        5, 1))

not_run: WebUI.click(findTestObject('ROLES/Create Role/platform/account_1st one'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementAttributeValue(findTestObject('ROLES/Create Role/platform/Select_accountPlaceholder'), findTestData(
        'Roles').getValue(1, 1), findTestData('Roles').getValue(5, 1), 230)

WebUI.click(findTestObject('ROLES/Create Role/platform/dropdown_account'))

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/Results_search text field'), 0)

WebUI.click(findTestObject('ROLES/Create Role/platform/account_1st one'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ROLES/Create Role/platform/button_Add Account'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/account_Toyoto_added'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/delete icon_platform tab'), 0)

WebUI.click(findTestObject('ROLES/Create Role/platform/delete icon_platform tab'))

WebUI.verifyElementNotPresent(findTestObject('ROLES/Create Role/platform/account_Toyoto_added'), 0)

WebUI.click(findTestObject('ROLES/Create Role/platform/label_All Accounts'))

not_run: WebUI.verifyElementPresent(findTestObject('ROLES/Create Role/platform/tickMark_Platform'), 0)


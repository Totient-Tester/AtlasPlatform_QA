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

WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/Default Logins/Default_Login_as_Root Admin'), 
    [('Email') : findTestData('AMP_Y').getValue(1, 1), ('Password') : findTestData('AMP_Y').getValue(2, 1), ('dashboard_exp_title') : ''], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Login_Page/Dashboard/ADMIN Module'))

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/Admin Sub-Navigation/div_Organizations'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/Admin Sub-Navigation/div_Accounts'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/Admin Sub-Navigation/div_Users'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/Admin Sub-Navigation/div_Roles'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/Admin Sub-Navigation/div_Features'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/Admin Sub-Navigation/div_Licensing'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/Admin Sub-Navigation/div_Programs'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/Admin Sub-Navigation/div_Affiliations'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/Admin Sub-Navigation/div_Events'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dashboard/Admin Sub-Navigation/div_Compliance'), 0)


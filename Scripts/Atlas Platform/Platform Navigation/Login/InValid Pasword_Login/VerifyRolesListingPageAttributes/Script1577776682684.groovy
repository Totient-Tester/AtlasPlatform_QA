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

WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/LoginWithRootAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/adminmenu'), 0)

String str1 = WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/adminmenu'), 'color')

WebUI.verifyEqual(str1, str1, FailureHandling.STOP_ON_FAILURE)

String str2 = WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/adminmenu'), 'font-size')

WebUI.verifyEqual(str2, str2, FailureHandling.STOP_ON_FAILURE)

String str3 = WebUI.getText(findTestObject('Object Repository/LoginPage/adminmenu'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(str3, str3, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementAttributeValue(findTestObject('Object Repository/LoginPage/adminmenu'), "class", "active", 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/LoginPage/audiencemenu'))

String str4 = WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/audiencemenu'), 'color')

WebUI.verifyEqual(str4, str4, FailureHandling.STOP_ON_FAILURE)

String str5 = WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/audiencemenu'), 'font-size')

WebUI.verifyEqual(str5, str5, FailureHandling.STOP_ON_FAILURE)

String str6 = WebUI.getText(findTestObject('Object Repository/LoginPage/audiencemenu'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(str6, str6, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/LoginPage/contentmeu'))

WebUI.click(findTestObject('Object Repository/LoginPage/reportingmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/adminmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/organizationssubmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/accountssubmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/usersubmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/rolessubmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/featuressubmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/licensingsubmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/programssubmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/affiliationssubmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/eventssubmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/compliancesubmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/rolessubmenu'))

WebUI.click(findTestObject('Object Repository/LoginPage/expandicon'))

WebUI.click(findTestObject('Object Repository/LoginPage/rolemanagertext'))

WebUI.click(findTestObject('Object Repository/LoginPage/SuperAdminTabs'))

WebUI.click(findTestObject('Object Repository/LoginPage/bundleadminTabs'))

WebUI.click(findTestObject('Object Repository/LoginPage/servicesadminTabs'))

WebUI.click(findTestObject('Object Repository/LoginPage/organizationadminTabs'))

WebUI.click(findTestObject('Object Repository/LoginPage/accountadminTabs'))

WebUI.click(findTestObject('Object Repository/LoginPage/GSMSalesTabs'))

WebUI.click(findTestObject('Object Repository/LoginPage/customersuccessTabs'))

WebUI.closeBrowser()


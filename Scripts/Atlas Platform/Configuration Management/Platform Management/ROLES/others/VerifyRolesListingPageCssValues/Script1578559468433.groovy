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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Object excelfile = ExcelFactory.getExcelDataWithDefaultSheet(System.getProperty('user.dir') + '\\Data Files\\xlsx files\\AMP.xlsx', 
    'RoleListingPageAttributes', true)

WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/LoginWithRootAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HeaderMenus/adminmenu'), 0)

//WebUI.click(findTestObject('HeaderMenus/adminmenu'))
WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/adminmenu'), 'color'), excelfile.getValue('element_color_in_RGBA', 
        1))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('HeaderMenus/adminmenu'), 'font-size'), excelfile.getValue('element_size', 
        1), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('HeaderMenus/adminmenu'), FailureHandling.CONTINUE_ON_FAILURE), excelfile.getValue(
        'element_text', 1), true)

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/adminmenuicon'), 'd'), excelfile.getValue('icon_value', 
        1), FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementAttributeValue(findTestObject('Object Repository/LoginPage/adminmenu'), "class", "active", 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('HeaderMenus/audiencemenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/audiencemenu'), 'color'), excelfile.getValue('element_color_in_RGBA', 
        2))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('HeaderMenus/audiencemenu'), 'font-size'), excelfile.getValue('element_size', 
        2), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('HeaderMenus/audiencemenu'), FailureHandling.CONTINUE_ON_FAILURE), excelfile.getValue(
        'element_text', 2), true)

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/audiencemenuicon'), 'd'), excelfile.getValue('icon_value', 
        2), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HeaderMenus/contentmeu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/contentmeu'), 'color'), excelfile.getValue('element_color_in_RGBA', 
        3))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('HeaderMenus/contentmeu'), 'font-size'), excelfile.getValue('element_size', 
        3), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('HeaderMenus/contentmeu'), FailureHandling.CONTINUE_ON_FAILURE), excelfile.getValue(
        'element_text', 3), true)

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/contentmenuicon'), 'd'), excelfile.getValue('icon_value', 
        3), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HeaderMenus/messagingmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/messagingmenu'), 'color'), excelfile.getValue('element_color_in_RGBA', 
        4))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('HeaderMenus/messagingmenu'), 'font-size'), excelfile.getValue('element_size', 
        4), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('HeaderMenus/messagingmenu'), FailureHandling.CONTINUE_ON_FAILURE), excelfile.getValue(
        'element_text', 4), true)

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/messagingmenuicon'), 'd'), excelfile.getValue('icon_value', 
        4), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HeaderMenus/reportingmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/reportingmenu'), 'color'), excelfile.getValue('element_color_in_RGBA', 
        5))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('HeaderMenus/reportingmenu'), 'font-size'), excelfile.getValue('element_size', 
        5), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('HeaderMenus/reportingmenu'), FailureHandling.CONTINUE_ON_FAILURE), excelfile.getValue(
        'element_text', 5), true)

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/reportingmenuicon'), 'd'), excelfile.getValue('icon_value', 
        5), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HeaderMenus/adminmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/adminmenu'), 'color'), excelfile.getValue('element_color_in_RGBA', 
        6))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('HeaderMenus/adminmenu'), 'font-size'), excelfile.getValue('element_size', 
        6), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('HeaderMenus/adminmenu'), FailureHandling.CONTINUE_ON_FAILURE), excelfile.getValue(
        'element_text', 6), true)

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/adminmenuicon'), 'd'), excelfile.getValue('icon_value', 
        6), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/LoginPage/organizationssubmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/organizationssubmenu'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 7))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/organizationssubmenu'), 'font-size'), excelfile.getValue(
        'element_size', 7), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/organizationssubmenu'), FailureHandling.CONTINUE_ON_FAILURE), 
    excelfile.getValue('element_text', 7), true)

WebUI.click(findTestObject('Object Repository/LoginPage/accountssubmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/accountssubmenu'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 8))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/accountssubmenu'), 'font-size'), excelfile.getValue(
        'element_size', 8), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/accountssubmenu'), FailureHandling.CONTINUE_ON_FAILURE), 
    excelfile.getValue('element_text', 8), true)

WebUI.click(findTestObject('Object Repository/LoginPage/usersubmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/usersubmenu'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 9))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/usersubmenu'), 'font-size'), excelfile.getValue(
        'element_size', 9), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/usersubmenu'), FailureHandling.CONTINUE_ON_FAILURE), 
    excelfile.getValue('element_text', 9), true)

WebUI.click(findTestObject('Object Repository/LoginPage/featuressubmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/featuressubmenu'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 10))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/featuressubmenu'), 'font-size'), excelfile.getValue(
        'element_size', 10), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/featuressubmenu'), FailureHandling.CONTINUE_ON_FAILURE), 
    excelfile.getValue('element_text', 10), true)

WebUI.click(findTestObject('Object Repository/LoginPage/licensingsubmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/licensingsubmenu'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 11))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/licensingsubmenu'), 'font-size'), excelfile.getValue(
        'element_size', 11), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/licensingsubmenu'), FailureHandling.CONTINUE_ON_FAILURE), 
    excelfile.getValue('element_text', 11), true)

WebUI.click(findTestObject('Object Repository/LoginPage/programssubmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/programssubmenu'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 12))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/programssubmenu'), 'font-size'), excelfile.getValue(
        'element_size', 12), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/programssubmenu'), FailureHandling.CONTINUE_ON_FAILURE), 
    excelfile.getValue('element_text', 12), true)

WebUI.click(findTestObject('Object Repository/LoginPage/affiliationssubmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/affiliationssubmenu'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 13))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/affiliationssubmenu'), 'font-size'), excelfile.getValue(
        'element_size', 13), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/affiliationssubmenu'), FailureHandling.CONTINUE_ON_FAILURE), 
    excelfile.getValue('element_text', 13), true)

WebUI.click(findTestObject('Object Repository/LoginPage/eventssubmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/eventssubmenu'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 14))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/eventssubmenu'), 'font-size'), excelfile.getValue(
        'element_size', 14), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/eventssubmenu'), FailureHandling.CONTINUE_ON_FAILURE), 
    excelfile.getValue('element_text', 14), true)

WebUI.click(findTestObject('Object Repository/LoginPage/compliancesubmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/compliancesubmenu'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 15))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/compliancesubmenu'), 'font-size'), excelfile.getValue(
        'element_size', 15), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/compliancesubmenu'), FailureHandling.CONTINUE_ON_FAILURE), 
    excelfile.getValue('element_text', 15), true)

WebUI.click(findTestObject('Object Repository/LoginPage/rolessubmenu'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/rolessubmenu'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 16))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/rolessubmenu'), 'font-size'), excelfile.getValue(
        'element_size', 16), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/rolessubmenu'), FailureHandling.CONTINUE_ON_FAILURE), 
    excelfile.getValue('element_text', 16), true)

WebUI.click(findTestObject('Object Repository/LoginPage/expandicon'))

WebUI.click(findTestObject('Object Repository/LoginPage/rolemanagertext'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/rolemanagertext'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 17))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/rolemanagertext'), 'font-size'), excelfile.getValue(
        'element_size', 17), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/rolemanagertext'), FailureHandling.CONTINUE_ON_FAILURE), 
    excelfile.getValue('element_text', 17), true)

WebUI.click(findTestObject('Object Repository/LoginPage/SuperAdminTabs'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/SuperAdminTabs'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 18))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/SuperAdminTabs'), 'font-size'), excelfile.getValue(
        'element_size', 18), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/SuperAdminTabs'), FailureHandling.CONTINUE_ON_FAILURE).replaceAll(
        '^[\\s\\.\\d]+', '').trim(), excelfile.getValue('element_text', 18), true)

WebUI.click(findTestObject('Object Repository/LoginPage/bundleadminTabs'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/bundleadminTabs'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 19))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/bundleadminTabs'), 'font-size'), excelfile.getValue(
        'element_size', 19), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/bundleadminTabs'), FailureHandling.CONTINUE_ON_FAILURE).replaceAll(
        '^[\\s\\.\\d]+', '').trim(), excelfile.getValue('element_text', 19), true)

WebUI.click(findTestObject('Object Repository/LoginPage/servicesadminTabs'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/servicesadminTabs'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 20))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/servicesadminTabs'), 'font-size'), excelfile.getValue(
        'element_size', 20), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/servicesadminTabs'), FailureHandling.CONTINUE_ON_FAILURE).replaceAll(
        '^[\\s\\.\\d]+', '').trim(), excelfile.getValue('element_text', 20), true)

WebUI.click(findTestObject('Object Repository/LoginPage/organizationadminTabs'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/organizationadminTabs'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 21))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/organizationadminTabs'), 'font-size'), excelfile.getValue(
        'element_size', 21), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/organizationadminTabs'), FailureHandling.CONTINUE_ON_FAILURE).replaceAll(
        '^[\\s\\.\\d]+', '').trim(), excelfile.getValue('element_text', 21), true)

WebUI.click(findTestObject('Object Repository/LoginPage/accountadminTabs'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/accountadminTabs'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 22))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/accountadminTabs'), 'font-size'), excelfile.getValue(
        'element_size', 22), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/accountadminTabs'), FailureHandling.CONTINUE_ON_FAILURE).replaceAll(
        '^[\\s\\.\\d]+', '').trim(), excelfile.getValue('element_text', 22), true)

WebUI.click(findTestObject('Object Repository/LoginPage/GSMSalesTabs'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/GSMSalesTabs'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 23))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/GSMSalesTabs'), 'font-size'), excelfile.getValue(
        'element_size', 23), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/GSMSalesTabs'), FailureHandling.CONTINUE_ON_FAILURE).replaceAll(
        '^[\\s\\.\\d]+', '').trim(), excelfile.getValue('element_text', 23), true)

WebUI.click(findTestObject('Object Repository/LoginPage/customersuccessTabs'))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/customersuccessTabs'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 24))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('Object Repository/LoginPage/customersuccessTabs'), 'font-size'), excelfile.getValue(
        'element_size', 24), true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LoginPage/customersuccessTabs'), FailureHandling.CONTINUE_ON_FAILURE).replaceAll(
        '^[\\s\\.\\d]+', '').trim(), excelfile.getValue('element_text', 24), true)

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('HeaderMenus/helpIcon'), 'font-size'), excelfile.getValue('element_size', 
        25), true)

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/helpIcon'), 'color'), excelfile.getValue(
        'element_color_in_RGBA', 25))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/helpIcon'), 'd').toLowerCase(), excelfile.getValue('icon_value', 25).toLowerCase())

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('HeaderMenus/tenderIcon'), 'font-size'), excelfile.getValue('element_size',
	26), true)

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/tenderIcon'), 'color'), excelfile.getValue(
	'element_color_in_RGBA', 26))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/tenderIcon'), 'd'), excelfile.getValue(
	'icon_value', 26))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('HeaderMenus/notificationIcon'), 'font-size'), excelfile.getValue('element_size',
	27), true)

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/notificationIcon'), 'color'), excelfile.getValue(
	'element_color_in_RGBA', 27))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/notificationIcon'), 'd'), excelfile.getValue(
	'icon_value', 27))

WebUI.verifyMatch(WebUI.getCSSValue(findTestObject('HeaderMenus/profileIcon'), 'font-size'), excelfile.getValue('element_size',
	28), true)

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/profileIcon'), 'color'), excelfile.getValue(
	'element_color_in_RGBA', 28))

WebUI.verifyEqual(WebUI.getCSSValue(findTestObject('HeaderMenus/profileIcon'), 'd'), excelfile.getValue(
	'icon_value', 28))

WebUI.closeBrowser()


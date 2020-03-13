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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/Default Logins/Default_Login_as_Root Admin'), 
    [('Email') : findTestData('AMP_Y').getValue(1, 1), ('Password') : findTestData('AMP_Y').getValue(2, 1), ('dashboard_exp_title') : ''], 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('ROLES/Role_Navigation/a_ADMIN'))

WebUI.verifyElementClickable(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value', value1, 
    30)

WebUI.click(findTestObject('ROLES/Roles_page/Pagination/front_navigation'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value', value2, 
    30)

WebUI.click(findTestObject('ROLES/Roles_page/Pagination/Back_navigation'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value', value1, 
    30)

WebUI.click(findTestObject('ROLES/Roles_page/Pagination/Back_navigation'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value', value1, 
    30)

page = WebUI.getText(findTestObject('ROLES/Roles_page/Pagination/label_of 10'))

page_no = page.substring(3)

println(page_no.length())

page_length = page_no.length()

for (; page_length > 0; page_length--) {
    WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), Keys.chord(Keys.BACK_SPACE))
}

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), Keys.chord(page_no, Keys.ENTER))

//WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), Keys.chord(Keys.BACK_SPACE))
WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value', page_no, 
    30)

not_run: CustomKeywords.'com.katalon.plugin.keyword.shadow.ShadowKeywords.isDisabled'(findTestObject('ROLES/Roles_page/Pagination/front_navigation'))

WebUI.click(findTestObject('ROLES/Roles_page/Pagination/front_navigation'))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value', page_no, 
    30)

page_in1 = WebUI.getAttribute(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value')

page_inl = page_in1.length()

for (; page_inl > 0; page_inl--) {
    WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), Keys.chord(Keys.BACK_SPACE))
}

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), Keys.chord(value3, Keys.ENTER))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value', value3, 
    30)

page_in2 = WebUI.getAttribute(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value')

page_in2 = page_in2.length()

for (; page_in2 > 0; page_in2--) {
    WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), Keys.chord(Keys.BACK_SPACE))
}

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), Keys.chord(value500000, Keys.ENTER))

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value', value3, 
    30)

page_in3 = WebUI.getAttribute(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value')

page_in3 = page_in3.length()

for (; page_in3 > 0; page_in3--) {
    WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), Keys.chord(Keys.BACK_SPACE))
}

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), Keys.chord(value4, Keys.ENTER))

page_showing = WebUI.getText(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'))

if (page_showing.contains(page4)) {
    WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), 'value', value4, 
        30)
}

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Pagination/input_Page_form-control'), Keys.chord(value1, Keys.ENTER))


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ById as ById
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/LoginWithRootAdmin'), [('user_Email') : 'navaraj@totient.co.in'
        , ('user_Password') : 'Totient@123'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HeaderMenus/contentmeu'))

WebUI.click(findTestObject('Login_Page/Dashboard/Content Sub-Navigation/div_Images'))

WebUI.delay(5)

WebUI.click(findTestObject('CONTENT/Image_Listing/upload_image_button'))

WebUI.verifyElementText(findTestObject('CONTENT/Upload_Images/h1_Upload Images_Header_Text'), 'Upload')

// Upload Image Name is auto generated:
String img_name = CustomKeywords.'web.CustomKeyword.getTimeStampWithText'('Automation - ')

print(img_name)

WebUI.setText(findTestObject('CONTENT/Upload_Images/input_Image Name'), img_name)

WebUI.click(findTestObject('CONTENT/Upload_Images/button_Add Description'))

WebUI.setText(findTestObject('CONTENT/Upload_Images/textarea_Description_description'), CustomKeywords.'web.CustomKeyword.getRandomString'())

//WebUI.click(findTestObject('CONTENT/Upload_Images/label_Select Files'))
WebDriver dr = DriverFactory.getWebDriver()

List<WebElement> listofFileUpload = WebUiCommonHelper.findWebElements(findTestObject('CONTENT/Upload_Images/label_Select Files'), 
    0)

for (int i = 0; i < listofFileUpload.size(); i++) {
    String id = listofFileUpload.get(i).getAttribute('id')

    WebElement ele = dr.findElement(By.id(id))

    ele.sendKeys(((System.getProperty('user.dir') + '\\Test Files\\img') + (i + 1)) + '.jpg')
}

WebUI.verifyElementText(findTestObject('CONTENT/Upload_Images/label_Replace'), 'Replace')

WebUI.click(findTestObject('CONTENT/Upload_Images/language_DropDown'))

List<WebElement> dropdownlist = WebUiCommonHelper.findWebElements(findTestObject('CONTENT/Upload_Images/Select_Language_Options'), 
    0)

CustomKeywords.'web.CustomKeyword.selectDropDownValue'(dropdownlist, 'English')

List<WebElement> radiobuttonsforMarketing = WebUiCommonHelper.findWebElements(findTestObject('CONTENT/Upload_Images/maketing_categories'), 
    0)

CustomKeywords.'web.CustomKeyword.selectDropDownValue'(radiobuttonsforMarketing, 'Milestone')

WebUI.click(findTestObject('CONTENT/Upload_Images/button_Upload'))

WebUI.waitForElementPresent(findTestObject('CONTENT/Image_Listing/all_Image_textwithcount'), 10)

List<WebElement> lisOFImagename = WebUiCommonHelper.findWebElements(findTestObject('CONTENT/Image_Listing/colum1_Image_Name_values'), 
    0)

boolean isUpload = CustomKeywords.'web.CustomKeyword.selectDropDownValue'(lisOFImagename, img_name)

WebUI.verifyEqual(isUpload, true)


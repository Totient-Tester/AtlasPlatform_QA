import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/LoginWithRootAdmin'), [('user_Email') : 'navaraj@totient.co.in'
        , ('user_Password') : 'Totient@123'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Swicther/swicthermenutext'))

WebUI.click(findTestObject('Swicther/search_in_swicther'))

WebUI.setText(findTestObject('Swicther/Swicher_Search_box'), 'Toyota')

List<WebElement> listOfResult = WebUiCommonHelper.findWebElements(findTestObject('Swicther/search_page_all_values'), 5)

List<WebElement> listofoptioninstring = new ArrayList<String>()

for (WebElement ele : listOfResult) {
	listofoptioninstring.addAll((ele.getText().split('Last')[0]).trim())
}

if (listOfResult.size() == 0) {
    WebUI.verifyElementText(findTestObject('Swicther/search_no_record_message'), 'No records found', FailureHandling.CONTINUE_ON_FAILURE)
} else {
	boolean isSorted = CustomKeywords.'web.CustomKeyword.checkListAscendingOrder'(listofoptioninstring)
	'If custom keyword is written true test case pass.Otherwise fail.'
	WebUI.verifyEqual(isSorted, true)
}

WebUI.click(findTestObject('Swicther/closeIcon'))


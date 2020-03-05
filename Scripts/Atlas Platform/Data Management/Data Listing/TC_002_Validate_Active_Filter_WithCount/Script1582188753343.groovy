import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/LoginWithRootAdmin'), [('user_Email') : 'navaraj@totient.co.in'
        , ('user_Password') : 'Totient@123'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HeaderMenus/audiencemenu'))

WebUI.refresh()

WebUI.click(findTestObject('Login_Page/Dashboard/Data Sub-Navigation/div_Data Source'))

String beforefilterapplytot = WebUI.getText(findTestObject('Object Repository/AUDIENCE/Data Source/total_count'))

int beforetotal = Integer.parseInt(beforefilterapplytot.replace('(', '').replace(')', '').trim())

WebUI.click(findTestObject('Object Repository/AUDIENCE/Data Source/filter'))

WebUI.click(findTestObject('Object Repository/AUDIENCE/Data Source/active'))

WebUI.click(findTestObject('Object Repository/AUDIENCE/Data Source/apply_btn'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/AUDIENCE/Data Source/active_text_filtered'), 'Active')

String totalText = WebUI.getText(findTestObject('Object Repository/AUDIENCE/Data Source/matchingRecord_count'))

int total = Integer.parseInt((totalText.split(' ')[0]).trim())

List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('AUDIENCE/Data Source/column1_values'), 0)

int pageValueCount = elements.size()

if (total > 10) {
    while (total != pageValueCount) {
        WebUI.click(findTestObject('AUDIENCE/Data Source/next'))

        elements = WebUiCommonHelper.findWebElements(findTestObject('AUDIENCE/Data Source/column1_values'), 0)

        pageValueCount += elements.size( //println(pageValueCount)
            )
    }
}

WebUI.verifyEqual(total, pageValueCount)

WebUI.click(findTestObject('AUDIENCE/Data Source/active_close_icon'))

String afterfilterapplytot = WebUI.getText(findTestObject('Object Repository/AUDIENCE/Data Source/total_count'))

int aftertotal = Integer.parseInt(afterfilterapplytot.replace('(', '').replace(')', '').trim())

WebUI.verifyEqual(aftertotal, beforetotal)


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.junit.After as After
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

String countText = WebUI.getText(findTestObject('AUDIENCE/Data Source/source_first_count'))

int count = Integer.parseInt(countText)

WebUI.click(findTestObject('AUDIENCE/Data Source/source_first_humbuger'))

WebUI.click(findTestObject('AUDIENCE/Data Source/viewconsumers'))

WebUI.verifyElementNotPresent(findTestObject('AUDIENCE/View Consumers/moduleDownText'), 5, FailureHandling.STOP_ON_FAILURE)

String totalText = WebUI.getText(findTestObject('AUDIENCE/View Consumers/total_value'))

String splitText = totalText.split('\\(')[1]

println(splitText)

int total = Integer.parseInt(splitText.replace(')', '').trim())

WebUI.verifyEqual(count, total, FailureHandling.STOP_ON_FAILURE)

if (total != 0) {
    List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('AUDIENCE/View Consumers/all_consumer_first_name'), 
        0)

    int pageValueCount = elements.size()

    if (total > 10) {
        while (total != pageValueCount) {
            WebUI.click(findTestObject('AUDIENCE/Data Source/next'))

            elements = WebUiCommonHelper.findWebElements(findTestObject('AUDIENCE/View Consumers/all_consumer_first_name'), 
                0)

            pageValueCount += elements.size()
        }
    }
    
    int rowNo = findTestData('View Consumers Test Data').getRowNumbers()

    List<WebElement> firstname_from_excel = new ArrayList<String>()

    for (int i = 0; i < rowNo; i++) {
        String text = findTestData('View Consumers Test Data').getValue('Consumer First Name', i + 1)

        println(text)

        firstname_from_excel.add(text)
    }
    
    WebUI.verifyEqual(total, pageValueCount)
} else {
    WebUI.verifyTextPresent('No Consumer Data Found', true)
}


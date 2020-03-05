import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

WebUI.refresh()

WebUI.click(findTestObject('HeaderMenus/audiencemenu'))

WebUI.click(findTestObject('Login_Page/Dashboard/Data Sub-Navigation/div_Data Source'))

String totalText = WebUI.getText(findTestObject('AUDIENCE/Data Source/total_count'))

WebUI.click(findTestObject('AUDIENCE/Data Source/created_Column_Name'))

int total = Integer.parseInt(totalText.replace('(', '').replace(')', '').trim())

int pageValueCount = 0

List<WebElement> dataSourceTextValues = new ArrayList<String>()

String totalOfPaginationCount = WebUI.getText(findTestObject('AUDIENCE/Data Source/no_pagination_With_Count'))

if (!(totalOfPaginationCount.equalsIgnoreCase('Showing 0 of 0 Images'))) {
    List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('AUDIENCE/Data Source/created_column_values'), 
        0)

    if (total > 10) {
        while (total != pageValueCount) {
            for (WebElement ele : elements) {
                dataSourceTextValues.add(ele.getText())
            }
            
            pageValueCount += elements.size()

            WebUI.click(findTestObject('AUDIENCE/Data Source/next'))

            elements = WebUiCommonHelper.findWebElements(findTestObject('AUDIENCE/Data Source/created_column_values'), 0)
        }
    }
}

//println((pageValueCount + '--') + total)
boolean isAsc = CustomKeywords.'web.CustomKeyword.checkListAscendingOrder'(dataSourceTextValues)

WebUI.verifyEqual(isAsc, true)

// To verify the Descending Order List 
WebUI.click(findTestObject('HeaderMenus/adminmenu'))

WebUI.click(findTestObject('HeaderMenus/audiencemenu'))

WebUI.click(findTestObject('AUDIENCE/Data Source/created_Column_Name'))

WebUI.delay(3)

WebUI.click(findTestObject('AUDIENCE/Data Source/created_Column_Name'))

List<WebElement> dataSourceTextValuesWithDesc = new ArrayList<String>()

int pageValueCount1 = 0

if (!(totalOfPaginationCount.equalsIgnoreCase('Showing 0 of 0 Images'))) {
    List<WebElement> elements1 = WebUiCommonHelper.findWebElements(findTestObject('AUDIENCE/Data Source/created_column_values'), 
        0)

    if (total > 10) {
        while (total != pageValueCount1) {
            for (WebElement ele1 : elements1) {
                dataSourceTextValuesWithDesc.add(ele1.getText())
            }
            
            pageValueCount1 += elements1.size()

            WebUI.click(findTestObject('AUDIENCE/Data Source/next'))

            elements1 = WebUiCommonHelper.findWebElements(findTestObject('AUDIENCE/Data Source/created_column_values'), 
                0)
        }
    }
}

boolean isDesc = CustomKeywords.'web.CustomKeyword.checkListDescendingOrder'(dataSourceTextValues, dataSourceTextValuesWithDesc)

WebUI.verifyEqual(isDesc, true)


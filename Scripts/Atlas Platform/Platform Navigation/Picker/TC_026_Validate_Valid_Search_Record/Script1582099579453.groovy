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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import java.sql.*
import org.openqa.selenium.WebElement as WebElement

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/LoginWithRootAdmin'), [('user_Email') : 'navaraj@totient.co.in'
        , ('user_Password') : 'Totient@123'], FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'web.MySQLDataBase.conncetDBWithOutParams'()

ResultSet rs = CustomKeywords.'web.MySQLDataBase.executeQuery'('select account.name from atlas_config.account INNER join atlas_config.account_access ON account_access.account_id=account.account_id where user_id=2;')

ResultSet rs1 = CustomKeywords.'web.MySQLDataBase.executeQuery'('select count(*) AS total from atlas_config.account INNER join atlas_config.account_access ON account_access.account_id=account.account_id where user_id=2;')

WebUI.click(findTestObject('Swicther/swicthermenutext'))

WebUI.click(findTestObject('Swicther/search_in_swicther'))

WebUI.setText(findTestObject('Swicther/Swicher_Search_box'), 'Toyota')

List<WebElement> listOfResult = WebUiCommonHelper.findWebElements(findTestObject('Swicther/search_page_all_values'), 5)

if (listOfResult.size() == 0) {
    WebUI.verifyElementText(findTestObject('Swicther/search_no_record_message'), 'No records found', FailureHandling.CONTINUE_ON_FAILURE)
} else {
    for (int i = 0; i < listOfResult.size(); i++) {
        if (listOfResult.get(i).getText().contains('Toyota')) {
            WebUI.verifyEqual(true, true)
        } else {
            WebUI.verifyEqual(true, false)

            break
        }
    }
}

WebUI.click(findTestObject('Swicther/closeIcon'))


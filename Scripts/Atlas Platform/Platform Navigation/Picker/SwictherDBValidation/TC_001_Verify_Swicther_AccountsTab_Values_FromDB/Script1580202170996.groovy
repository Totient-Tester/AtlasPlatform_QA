import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.sql.Connection as Connection
import java.sql.ResultSet as ResultSet
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/LoginWithRootAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Swicther/swicthermenutext'))

WebUI.click(findTestObject('Swicther/accounts_tab_swicther'))

List<WebElement> listofoptions = WebUiCommonHelper.findWebElements(findTestObject('Swicther/accounts_tab_all_values'), 5)

List<WebElement> listOfElementText = new ArrayList<String>()

for (int h = 0; h < listofoptions.size(); h++) {
    listOfElementText.add((listofoptions.get(h).getText().split('Last')[0]).trim())
}

Connection conn = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection'()

ResultSet sett = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(conn, ('select account.name from atlas_config.account INNER join atlas_config.account_access ON account_access.account_id=account.account_id where user_id=' + 
    GlobalVariable.user_id) + ';')

println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(sett, 'name'))

WebUI.verifyEqual(listOfElementText, CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(
        sett, 'name'))


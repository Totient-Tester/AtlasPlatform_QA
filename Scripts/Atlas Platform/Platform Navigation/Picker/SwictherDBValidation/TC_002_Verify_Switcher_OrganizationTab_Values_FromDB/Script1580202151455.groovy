import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.sql.Connection as Connection
import java.sql.ResultSet as ResultSet

import org.apache.ivy.util.CollectionUtils
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Action
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/LoginWithRootAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Swicther/swicthermenutext'))

WebUI.click(findTestObject('Swicther/organization_tab_swicther'))

List<WebElement> listofoptions = WebUiCommonHelper.findWebElements(findTestObject('Swicther/organization_tab_all_values'), 
    5)

List<WebElement> listOfElementText = new ArrayList<String>()

driver = DriverFactory.getWebDriver();

JavascriptExecutor js = ((JavascriptExecutor)driver);

for (int h = 0; h < listofoptions.size(); h++) {
    //println listAccountDBValue.get(h)+"--"+listofoptions.get(h).getText().split("Last")[0].trim();
	js.executeScript("arguments[0].scrollIntoView(true);",listofoptions.get(h));
    println('====>>>>>>>' + listofoptions.get(h).getText())

    listOfElementText.add((listofoptions.get(h).getText().split('Last')[0]).trim())
}

Connection conn = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection'()

ResultSet sett = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(conn, 'select organization.name from atlas_config.organization INNER join atlas_config.organization_access ON organization_access.organization_id=organization.organization_id where user_id=2;')

println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(sett, 'name'))

Collections.sort(listOfElementText)

Collections.sort(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(sett, 'name'))

WebUI.verifyEqual(listOfElementText, CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(
        sett, 'name'))




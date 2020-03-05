import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.WebElement as WebElement
import org.testng.Assert as Assert
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

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/LoginWithRootAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Swicther/swicthermenutext'))

WebUI.click(findTestObject('Swicther/accounts_tab_swicther'))

List<WebElement> listofAccNames = WebUiCommonHelper.findWebElements(findTestObject('Swicther/accounts_tab_all_values'), 
    10)

List<WebElement> textValuesForAccountsName = new ArrayList<String>()

for (int hjk = 0; hjk < listofAccNames.size(); hjk++) {
    textValuesForAccountsName.add((listofAccNames.get(hjk).getText().split('Last')[0]).trim())
}

WebUI.click(findTestObject('Swicther/root_tab_swicther'))

List<WebElement> listofRootnames = WebUiCommonHelper.findWebElements(findTestObject('Swicther/root_tab_all_values'), 10)

List<WebElement> rootNames = new ArrayList<String>()

for (WebElement ele : listofRootnames) {
    rootNames.add((ele.getText().split('Last')[0]).trim())
}

boolean isPresent = textValuesForAccountsName.removeAll(rootNames)

WebUI.verifyEqual(isPresent, false)

WebUI.click(findTestObject('Swicther/organization_tab_swicther'))

List<WebElement> listofOrgNames = WebUiCommonHelper.findWebElements(findTestObject('Swicther/organization_tab_all_values'), 
    10)

List<WebElement> orgNames = new ArrayList<String>()

for (WebElement ele : listofOrgNames) {
    orgNames.add((ele.getText().split('Last')[0]).trim())
}

isPresent = textValuesForAccountsName.removeAll(orgNames)

//Assert.assertFalse(isPresent, 'ACCOUNTS NAME IS NOT DISPLAYING IN ROOT AND ORGANIZATION TABS')
WebUI.verifyEqual(isPresent, false)

WebUI.click(findTestObject('Swicther/closeIcon'))


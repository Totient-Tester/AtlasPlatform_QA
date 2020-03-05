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

WebUI.click(findTestObject('Swicther/organization_tab_swicther'))

List<WebElement> listofOrgNames = WebUiCommonHelper.findWebElements(findTestObject('Swicther/organization_tab_all_values'), 
    10)

WebUI.click(findTestObject('Swicther/root_tab_swicther'))

List<WebElement> listofRootnames = WebUiCommonHelper.findWebElements(findTestObject('Swicther/root_tab_all_values'), 10)

List<WebElement> rootNames = new ArrayList<String>()

for (WebElement ele : listofRootnames) {
    rootNames.add(ele.getText())
}

for (int hjk = 0; hjk < listofOrgNames.size(); hjk++) {
    Assert.assertTrue(!(rootNames.contains((listofOrgNames.get(hjk).getText().split('Last')[0]).trim())), 'Root Account is not present in Org Tab')
}

WebUI.click(findTestObject('Swicther/accounts_tab_swicther'))

List<WebElement> listofAccNames = WebUiCommonHelper.findWebElements(findTestObject('Swicther/accounts_tab_all_values'), 
    10)

for (int hjk = 0; hjk < listofAccNames.size(); hjk++) {
    Assert.assertTrue(!(rootNames.contains((listofAccNames.get(hjk).getText().split('Last')[0]).trim())), 'Root Account is not present in Acc Tab')
}

WebUI.click(findTestObject('Swicther/closeIcon'))


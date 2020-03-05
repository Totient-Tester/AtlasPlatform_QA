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

List<WebElement> listofoptions = WebUiCommonHelper.findWebElements(findTestObject('Swicther/accounts_tab_all_values'), 5)

List<WebElement> listoficons = WebUiCommonHelper.findWebElements(findTestObject('Swicther/accounts_tab_all_icons'), 5)

List<WebElement> listofoptioninstring = new ArrayList<String>()

for (WebElement ele : listofoptions) {
    listofoptioninstring.addAll(ele.getText())
}

String verify_accountName = CustomKeywords.'web.CustomKeyword.getrandomStingValue'(listofoptioninstring)

for (int h = 0; h < listofoptions.size(); h++) {
    if (listofoptions.get(h).getText().equalsIgnoreCase(verify_accountName)) {
        if (listoficons.get(h).getAttribute('d').toLowerCase().equalsIgnoreCase(dattributeValue.toString().toLowerCase())) {
            Assert.assertEquals(listoficons.get(h).getAttribute('d'), dattributeValue.toString())

            break
        }
    }
}

WebUI.click(findTestObject('Swicther/closeIcon'))


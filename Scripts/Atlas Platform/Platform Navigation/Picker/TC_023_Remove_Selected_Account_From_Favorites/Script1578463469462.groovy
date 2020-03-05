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

WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Picker/TC_021_Validate_Accounts_Favorites'), [:], FailureHandling.STOP_ON_FAILURE)

List<WebElement> listoffavvalues = WebUiCommonHelper.findWebElements(findTestObject('Swicther/favorites_tab_all_values'), 
    5)

List<WebElement> listofstaricon = WebUiCommonHelper.findWebElements(findTestObject('Swicther/favorites_tab_all_fav_icon'), 
    5)

int beforeRemoveStar_FavoriteListCount = listoffavvalues.size()

for (int h = 0; h < listoffavvalues.size(); h++) {
    listofstaricon.get(h).click()

    break
}

listoffavvalues = WebUiCommonHelper.findWebElements(findTestObject('Swicther/favorites_tab_all_values'), 5)

int afterRemovedStar_FavoriteListCount = listoffavvalues.size()

WebUI.verifyNotEqual(beforeRemoveStar_FavoriteListCount, afterRemovedStar_FavoriteListCount)


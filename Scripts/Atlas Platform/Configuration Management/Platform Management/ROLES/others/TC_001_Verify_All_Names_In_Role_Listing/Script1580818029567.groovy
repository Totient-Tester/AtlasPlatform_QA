import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.sql.Connection as Connection
import java.sql.ResultSet as ResultSet
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

WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/LoginWithRootAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HeaderMenus/adminmenu'), 0)

Connection conn1 = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection'()

ResultSet resultValues2 = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(conn1, 'SELECT * FROM atlas_config.custom_role;')

println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(resultValues2, 'name'))

List<WebElement> roleNameFromDB = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(
    resultValues2, 'name')

println('DB VALUES : ' + roleNameFromDB)

WebUI.click(findTestObject('HeaderMenus/adminmenu'))

WebUI.click(findTestObject('LoginPage/rolessubmenu'))

String text = WebUI.getText(findTestObject('ROLES/RoleListingPage/allrolestextwithcount'))

String totalcountintext = (text.split(' ')[2]).replace('(', '').replace(')', '').trim()

String totalFormDB = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount'(resultValues2)

println(text)

println((totalcountintext + '--') + totalFormDB)

int total = Integer.parseInt(totalcountintext)

List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('ROLES/RoleListingPage/roleslisting'), 0)

int updatedCount = elements.size()

List<WebElement> roleNameList = new ArrayList<String>()

while (total != updatedCount) {
    for (WebElement e : elements) {
        roleNameList.add(e.getText())
    }
    
    WebUI.click(findTestObject('ROLES/RoleListingPage/nextIcon'))

    elements = WebUiCommonHelper.findWebElements(findTestObject('ROLES/RoleListingPage/roleslisting'), 0)

    updatedCount += elements.size()

    println(updatedCount)
}

Collections.sort(roleNameFromDB)

Collections.sort(roleNameList)

WebUI.verifyEqual(roleNameFromDB, roleNameList)


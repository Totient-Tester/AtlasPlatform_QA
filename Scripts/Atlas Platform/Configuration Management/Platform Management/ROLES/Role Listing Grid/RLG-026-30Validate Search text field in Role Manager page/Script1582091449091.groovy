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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.eclipse.persistence.internal.oxm.record.json.JSONParser.pair_return as pair_return
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.io.File as File
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Enumeration as Enumeration
import java.util.Properties as Properties
import java.util.concurrent.TimeUnit as TimeUnit
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Roles Navigation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

WebUI.verifyElementAttributeValue(findTestObject('ROLES/Roles_page/Search text field/input_All Roles (1842)_form-control'), 
    Search_placeholder, 'Search', 30)

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Search text field/input_All Roles (1842)_form-control'), RoleName1)

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Search text field/Super1 Admin1'), 30)

WebUI.click(findTestObject('ROLES/Roles_page/Search text field/button_All Roles (1842)_clearButton'))

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Search text field/input_All Roles (1842)_form-control'), RoleName2)

WebUI.verifyElementNotPresent(findTestObject('ROLES/Roles_page/Search text field/Super1 Admin z'), 30)

WebUI.click(findTestObject('ROLES/Roles_page/Search text field/button_All Roles (1842)_clearButton'))

WebUI.sendKeys(findTestObject('ROLES/Roles_page/Search text field/input_All Roles (1842)_form-control'), RoleName3)

List<WebElement> a = driver.findElements(By.xpath('//strong[text()=\''+RoleName3+'\']/../..'))

e_count = a.size()

println(e_count)

int a_count = 0

for (WebElement c : a) {
    String role = c.getText()

    if (role.contains(RoleName3)) {
        println(role)

        a_count++
    }
}

println(a_count)

WebUI.verifyEqual(e_count, a_count)


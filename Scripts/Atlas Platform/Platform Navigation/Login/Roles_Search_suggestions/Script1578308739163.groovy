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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.testng.asserts.Assertion as Assertion
import org.openqa.selenium.By as By
//import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Login_Page/Page_/email address placeholder'), Email)

WebUI.setText(findTestObject('Object Repository/Login_Page/Page_/Password placeholder'), Password)

WebUI.click(findTestObject('Object Repository/Login_Page/Page_/Log In button'))

WebUI.click(findTestObject('Login_Page/Roles/div'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Login_Page/Roles/input_All Roles (1842)_form-control'), search_string, FailureHandling.CONTINUE_ON_FAILURE)

results = driver.findElements(By.xpath('//strong[text()=\'Super\']/../..'))

int i = 0

int x = results.size()

println(x)

while (i < results.size()) {
    for (WebElement l : results) {
        if (l.getText().contains(search_string)) {
            println(l.getText() + 'is true')
        } else {
            println(l.getText() + 'is false')
        }
        
        i++
    }
}


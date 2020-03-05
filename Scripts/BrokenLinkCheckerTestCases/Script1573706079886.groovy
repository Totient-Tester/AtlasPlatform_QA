import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.junit.After
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import application.CustomKeyword
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver();

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

List<WebElement> listOfATags = driver.findElements(By.tagName("a"));

listOfATags.addAll(driver.findElements(By.tagName("img")));

for(WebElement element : listOfATags){
	
	if(element.getAttribute("href")!=null && element.getAttribute("href").contains("https://") || element.getAttribute("href").contains("http://")){
		
	   
		println element.getAttribute("href");
		CustomKeyword.isBrokenLinkchecker(new URL(element.getAttribute("href")))
		//isBrokenLinkchecker(element.getAttribute("href"));element.getAttribute("href").contains("http://")
		//WebUI.verifyAllLinksOnCurrentPageAccessible(true, [element.getAttribute("href")])
		//CustomKeyword.takeScreenShot();
		
	}
}



WebUI.closeBrowser()


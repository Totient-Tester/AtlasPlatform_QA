import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.ITestContext
import org.testng.ITestNGListener
import org.testng.ITestResult
import org.testng.annotations.AfterMethod

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

public class TestListeners1 implements ITestNGListener {
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		println testCaseContext.getTestCaseId()
		println testCaseContext.getTestCaseStatus()
		
		println "On Failure Method is Calling : "+testCaseContext.getTestCaseStatus()
		
		if(!testCaseContext.getTestCaseStatus().equalsIgnoreCase("PASSED"))
							WebUI.takeScreenshot("D:\\TestDataForSampleProject\\test1.jpg")
		
	}
	
	
	public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
			
	}
	
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
				
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
				
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
				
	}

	
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
				
	}

	
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
				
	}


	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
				
	}
	
	
}
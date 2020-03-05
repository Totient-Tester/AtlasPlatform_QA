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

WebUI.callTestCase(findTestCase('Atlas Platform/Platform Navigation/Login/Default Logins/Default_Login_as_Root Admin'), 
    [('Email') : findTestData('AMP_Y').getValue(1, 1), ('Password') : findTestData('AMP_Y').getValue(2, 1), ('dashboard_exp_title') : ''], 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/others/Navigation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ROLES/Role_Navigation/messaging'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/create marketing button'))

WebUI.sendKeys(findTestObject('Marketing Automation/Create Marketing Automation/marketing Automation name'), 'Marketing Automation 1')

WebUI.clickOffset(findTestObject('Marketing Automation/Create Marketing Automation/start'), 125, -50)

WebUI.sendKeys(findTestObject('Marketing Automation/Create Marketing Automation/task name'), 'start')

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/create task'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/settings'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/send mail(task)'))

WebUI.sendKeys(findTestObject('Marketing Automation/Create Marketing Automation/task name'), 'Welcome1')

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/extensions tab'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/plus button(extensions)'))

WebUI.sendKeys(findTestObject('Marketing Automation/Create Marketing Automation/name(extensions)'), 'templateid')

WebUI.sendKeys(findTestObject('Marketing Automation/Create Marketing Automation/value(extensions)'), '1')

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/intermediate'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/settings'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/wait(date)'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/general tab'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/timer'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/timer Date'))

WebUI.sendKeys(findTestObject('Marketing Automation/Create Marketing Automation/timer duration'), '30')

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/gateway'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/create task'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/settings'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/send mail(task)'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/general tab'))

WebUI.sendKeys(findTestObject('Marketing Automation/Create Marketing Automation/task name'), 'Welcome2')

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/extensions tab'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/plus button(extensions)'))

WebUI.sendKeys(findTestObject('Marketing Automation/Create Marketing Automation/name(extensions)'), 'templateid')

WebUI.sendKeys(findTestObject('Marketing Automation/Create Marketing Automation/value(extensions)'), '2')

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/end'))

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/general tab'))

WebUI.sendKeys(findTestObject('Marketing Automation/Create Marketing Automation/task name'), 'end')

WebUI.clickOffset(findTestObject('Marketing Automation/Create Marketing Automation/start'), 470, -50)

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/end'))

WebUI.sendKeys(findTestObject('Marketing Automation/Create Marketing Automation/task name'), 'end')

WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/Create button'))

not_run: WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/start button'))

not_run: WebUI.click(findTestObject('Marketing Automation/Create Marketing Automation/stop button'))


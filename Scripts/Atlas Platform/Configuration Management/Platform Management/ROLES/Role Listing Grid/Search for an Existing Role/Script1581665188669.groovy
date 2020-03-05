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

<<<<<<< HEAD:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing grid/Search for an Existing Role/Script1581665188669.groovy
not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Roles Navigation'), 
=======
<<<<<<< HEAD:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing Grid/Search the Created Role Role/Script1581936631567.groovy
<<<<<<< HEAD:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing Grid/Search the Created Role Role/Script1581936631567.groovy
not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/others/Navigation'), 
>>>>>>> b185aeae1fae384cb0e511113bc1c897933fe436:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing Grid/Search the Created Role Role/Script1581936631567.groovy
    [:], FailureHandling.CONTINUE_ON_FAILURE)
=======
WebUI.click(findTestObject('Logout/My Account'))
>>>>>>> 87708f0dd43aa6bc23a6e8e66a1d986b699b4520:Scripts/Atlas Platform/Platform Navigation/Logout/Logout/Script1581923469426.groovy

WebUI.click(findTestObject('Logout/li_Log Out'))

<<<<<<< HEAD:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing grid/Search for an Existing Role/Script1581665188669.groovy
WebUI.sendKeys(findTestObject('ROLES/Roles_page/Search Box'), findTestData('null').getValue(3, 1) + Keys.ENTER)

WebUI.verifyElementText(findTestObject('ROLES/Roles_page/Search text field/validate created role'), findTestData('xlsx files/Roles').getValue(
        3, 1))
=======
<<<<<<< HEAD:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing Grid/Search the Created Role Role/Script1581936631567.groovy
WebUI.sendKeys(findTestObject('ROLES/Roles_page/Search Box'), GlobalVariable.ROLENAME1 + Keys.ENTER)

WebUI.verifyElementText(findTestObject('ROLES/Roles_page/role name'), GlobalVariable.ROLENAME1)
=======
actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, 'https://atlas-dev.gsm.auto/', false)
>>>>>>> 87708f0dd43aa6bc23a6e8e66a1d986b699b4520:Scripts/Atlas Platform/Platform Navigation/Logout/Logout/Script1581923469426.groovy
=======
<<<<<<< HEAD:Scripts/Atlas Platform/Platform Navigation/Logout/Logout/Script1581923469426.groovy
WebUI.click(findTestObject('Logout/My Account'))
=======
not_run: WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/others/Navigation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)
>>>>>>> master:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing Grid/Search the Created Role Role/Script1581936631567.groovy

WebUI.click(findTestObject('Logout/li_Log Out'))

<<<<<<< HEAD:Scripts/Atlas Platform/Platform Navigation/Logout/Logout/Script1581923469426.groovy
actURL = WebUI.getUrl()

WebUI.verifyMatch(actURL, 'https://atlas-dev.gsm.auto/', false)
=======
WebUI.sendKeys(findTestObject('ROLES/Roles_page/Search Box'), GlobalVariable.ROLENAME1 + Keys.ENTER)

WebUI.verifyElementText(findTestObject('ROLES/Roles_page/role name'), GlobalVariable.ROLENAME1)
>>>>>>> master:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing Grid/Search the Created Role Role/Script1581936631567.groovy
>>>>>>> uday:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing grid/Search for an Existing Role/Script1581665188669.groovy
>>>>>>> b185aeae1fae384cb0e511113bc1c897933fe436:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing Grid/Search the Created Role Role/Script1581936631567.groovy


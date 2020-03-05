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

<<<<<<< HEAD:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing grid/RLG-031 Verify Filter link in Role Manager page/Script1581659064017.groovy
WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Roles Navigation'), [:], 
=======
<<<<<<< HEAD
<<<<<<< HEAD:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing grid/RLG-031 Verify Filter link in Role Manager page/Script1581659064017.groovy
=======
<<<<<<< HEAD:Scripts/Atlas Platform/Platform Navigation/Login/New Test Case/Script1578375593985.groovy
=======
>>>>>>> uday
WebUI.callTestCase(findTestCase('Atlas Platform/Configuration Management/Platform Management/ROLES/Navigation'), [:], 
>>>>>>> b185aeae1fae384cb0e511113bc1c897933fe436:Scripts/Atlas Platform/Platform Navigation/Login/New Test Case/Script1578375593985.groovy
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ROLES/Roles_page/Filter'))

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Filter_link/li_Status'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Filter_link/span_Active'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Filter_link/span_Archived'), 0)

WebUI.verifyElementPresent(findTestObject('ROLES/Roles_page/Filter_link/button_Apply'), 0)

<<<<<<< HEAD
=======
>>>>>>> 87708f0dd43aa6bc23a6e8e66a1d986b699b4520:Scripts/Atlas Platform/Platform Navigation/Login/New Test Case/Script1578375593985.groovy
=======
>>>>>>> master:Scripts/Atlas Platform/Configuration Management/Platform Management/ROLES/Role Listing grid/RLG-031 Verify Filter link in Role Manager page/Script1581659064017.groovy
>>>>>>> uday

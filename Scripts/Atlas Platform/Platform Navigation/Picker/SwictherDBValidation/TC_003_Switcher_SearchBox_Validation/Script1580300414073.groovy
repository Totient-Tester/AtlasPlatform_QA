import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.sql.*
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

Connection conn = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection'()

ResultSet resultValues = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(conn, 'select * from atlas_config.custom_role where status="ACTIVE";')

println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(resultValues, 'name'))

println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListRowValue'(resultValues, 1, 10))

println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount'(resultValues))

println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(resultValues, 5, 'name'))

ResultSet resultValues1 = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(conn, 'SELECT * FROM atlas_config.user WHERE email ="navaraj@totient.co.in";')

println (CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(resultValues1, 1, 'user_id'))

GlobalVariable.user_id = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(resultValues1, 1, 'user_id')

println "User ID Variable value is : "+GlobalVariable.user_id;

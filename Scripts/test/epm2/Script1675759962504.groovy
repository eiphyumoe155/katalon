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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://skt-production.firebaseapp.com/')

WebUI.click(findTestObject('Object Repository/epm_test/Page_Vite  React  TS/button_GSC'))

WebUI.click(findTestObject('Object Repository/epm_test/Page_Vite  React  TS/button_History'))

WebUI.click(findTestObject('Object Repository/epm_test/Page_Vite  React  TS/svg_AI Article Writer_MuiSvgIcon-root MuiSv_b4bf44'))

WebUI.setText(findTestObject('Object Repository/epm_test/Page_Vite  React  TS/input_Type a keyword_r6'), '22')

WebUI.click(findTestObject('Object Repository/epm_test/Page_Vite  React  TS/button_Search Candidates'))

WebUI.click(findTestObject('Object Repository/epm_test/Page_Vite  React  TS/button_Generate Title'))


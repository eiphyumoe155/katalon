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

response = WS.sendRequest(findTestObject('prompt generate ai/keyword'))

process_id = WS.getElementPropertyValue(response, 'p_id')

GlobalVariable.process_id = process_id

println('process id of user from keyword: ' + GlobalVariable.process_id.toString())


response1 = WS.sendRequest(findTestObject('prompt generate ai/title'))

process_id1 = WS.getElementPropertyValue(response1, 'p_id')

GlobalVariable.process_id = process_id1

println('process id of user from title: ' + GlobalVariable.process_id.toString())


response2 = WS.sendRequest(findTestObject('prompt generate ai/introduction'))

process_id2 = WS.getElementPropertyValue(response2, 'p_id')

GlobalVariable.process_id = process_id2

println('process id of user from intro: ' + GlobalVariable.process_id.toString())


response3 = WS.sendRequest(findTestObject('prompt generate ai/headline'))

process_id3 = WS.getElementPropertyValue(response3, 'p_id')

GlobalVariable.process_id = process_id3

println('process id of user from headline: ' + GlobalVariable.process_id.toString())


response4 = WS.sendRequest(findTestObject('prompt generate ai/paragraph'))

process_id4 = WS.getElementPropertyValue(response4, 'p_id')

GlobalVariable.process_id = process_id4 

println('process id of user from paragraph: ' + GlobalVariable.process_id.toString())


response5 = WS.sendRequest(findTestObject('prompt generate ai/summary'))

process_id5 = WS.getElementPropertyValue(response5, 'p_id')

GlobalVariable.process_id = process_id5

println('process id of user from summary: ' + GlobalVariable.process_id.toString())


response6 = WS.sendRequest(findTestObject('prompt generate ai/content'))

process_id6 = WS.getElementPropertyValue(response6, 'p_id')

GlobalVariable.process_id = process_id6

println('process id of user from content: ' + GlobalVariable.process_id.toString())


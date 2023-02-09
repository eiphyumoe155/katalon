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
import com.kms.katalon.core.webservice.verification.WSResponseManager as WSResponseManager
import groovy.json.JsonSlurper as JsonSlurper




response = WS.sendRequest(findTestObject('prompt generate ai/keyword'))
def slurper = new groovy.json.JsonSlurper()
def result = slurper.parseText(response.getResponseBodyContent())
def value = result.p_id
GlobalVariable.process_id = value
println('process id of user from keyword: ' + GlobalVariable.process_id.toString())


response1 = WS.sendRequest(findTestObject('prompt generate ai/title'))
def slurper = new groovy.json.JsonSlurper()
def result1 = slurper.parseText(response1.getResponseBodyContent())
def value1 = result1.p_id
GlobalVariable.process_id = value1
println('process id of user from title: ' + GlobalVariable.process_id.toString())


response2 = WS.sendRequest(findTestObject('prompt generate ai/introduction'))
def slurper = new groovy.json.JsonSlurper()
def result2 = slurper.parseText(response2.getResponseBodyContent())
def value2 = result2.p_id
GlobalVariable.process_id = value2
println('process id of user from intro: ' + GlobalVariable.process_id.toString())


response3 = WS.sendRequest(findTestObject('prompt generate ai/headline'))
def slurper = new groovy.json.JsonSlurper()
def result3 = slurper.parseText(response3.getResponseBodyContent())
def value3 = result3.p_id
GlobalVariable.process_id = value3
println('process id of user from headline: ' + GlobalVariable.process_id.toString())


response4 = WS.sendRequest(findTestObject('prompt generate ai/paragraph'))
def slurper = new groovy.json.JsonSlurper()
def result4 = slurper.parseText(response4.getResponseBodyContent())
def value4 = result4.p_id
GlobalVariable.process_id = value4
println('process id of user from paragraph: ' + GlobalVariable.process_id.toString())


response5 = WS.sendRequest(findTestObject('prompt generate ai/summary'))
def slurper = new groovy.json.JsonSlurper()
def result5 = slurper.parseText(response5.getResponseBodyContent())
def value5 = result5.p_id
GlobalVariable.process_id = value5
println('process id of user from summary: ' + GlobalVariable.process_id)


response6 = WS.sendRequest(findTestObject('prompt generate ai/content'))
def slurper = new groovy.json.JsonSlurper()
def result6 = slurper.parseText(response6.getResponseBodyContent())
def value6 = result6.p_id
GlobalVariable.process_id = value6
println('process id of user from content: ' + GlobalVariable.process_id)
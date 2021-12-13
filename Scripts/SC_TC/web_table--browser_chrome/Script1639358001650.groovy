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

WebUI.navigateToUrl('https://rahulshettyacademy.com/AutomationPractice/')

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_30'), '30')

WebUI.verifyElementText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_25'), '25')

WebUI.getText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_Learn SQL in Practical  Database Testing_8b83a1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_30'), '30')

WebUI.verifyElementText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_25'), '25')

WebUI.getText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_Learn JMETER from Scratch - (Performance_60f099'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_35'), '35')

WebUI.verifyElementText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_25'), '25')

WebUI.getText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_QA Expert Course Software Testing  Bugzi_863c32'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_25'), '25')

WebUI.getText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_Master Selenium Automation in simple Pyt_98e7ce'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Web Table Example/Page_Practice Page/td_0'), '0')

WebUI.closeBrowser()


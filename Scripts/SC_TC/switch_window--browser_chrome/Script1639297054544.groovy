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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Switch Window Example/Page_Practice Page/button_Open Window'))

WebUI.delay(4)

WebUI.switchToWindowTitle('QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy')

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Switch Window Example/Page_QA Click Academy  Selenium,Jmeter,Soap_747ff4/button_NO THANKS'), 
    4)

WebUI.click(findTestObject('Object Repository/Switch Window Example/Page_QA Click Academy  Selenium,Jmeter,Soap_747ff4/button_NO THANKS'))

WebUI.delay(4)

WebUI.focus(findTestObject('Switch Window Example/Page_QA Click Academy  Selenium,Jmeter,Soap_747ff4/div_30 day Money Back GuaranteeWe would nev_bfdf08'))

WebUI.verifyTextPresent('', false)

WebUI.delay(4)

WebUI.closeWindowTitle('QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy')

WebUI.delay(4)

WebUI.closeBrowser()


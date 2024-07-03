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
import com.kms.katalon.core.testobject.ConditionType

WebUI.callTestCase(findTestCase('1. LoginTestScenario/TC-01-Login with Valid Credential'), [:], FailureHandling.STOP_ON_FAILURE)

List<String> itemIds = [
	'add-to-cart-sauce-labs-backpack',
	'add-to-cart-sauce-labs-bike-light',
	'add-to-cart-sauce-labs-fleece-jacket'
]

for (String itemId : itemIds) {
	TestObject addToCartButton = new TestObject().addProperty("id", ConditionType.EQUALS, itemId)
	
	WebUI.click(addToCartButton)
	
	WebUI.delay(1)
}

WebUI.click(findTestObject('Object Repository/HomePage/buttonCart'))

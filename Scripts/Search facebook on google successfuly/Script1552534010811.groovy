import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.google.co.th/')

WebUI.verifyTextPresent('ภาพ', false)

WebUI.verifyTextPresent('ทั้งหมด', false)

WebUI.verifyTextPresent('ลงชื่อเข้าสู่ระบบ', false)

'Wait for Page Load'
WebUI.waitForPageLoad(30)

//WebUI.setText(findTestObject('Mobile element/android.login'), 'facebook')
WebUI.sendKeys(findTestObject('Mobile element/android.search'), Keys.chord('facebook', Keys.ENTER))

WebUI.verifyTextPresent('https://m.facebook.com', false)

WebUI.navigateToUrl('https://www.facebook.com')

WebUI.setText(findTestObject('Mobile element/android.login'), 'slowwyCH@gmail.com')

WebUI.setText(findTestObject('Mobile element/android.password'), '123123123')

WebUI.click(findTestObject('Mobile element/android.submit'))

WebUI.verifyTextPresent('ภาษาไทย', false)

Mobile.verifyIsPortrait()

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Mobile element/android.verify'), 0)

WebUI.verifyTextPresent('รหัสผ่านที่คุณป้อนไม่ถูกต้อง ', false)


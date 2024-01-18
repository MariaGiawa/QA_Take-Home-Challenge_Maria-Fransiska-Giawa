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

WebUI.navigateToUrl('https://myskill.id/')

WebUI.click(findTestObject('Object Repository/Page_Si Paling Belajar  MySkill/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  MySkill/input_email'), 'giawamaria395@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  MySkill/input_password'), '2BMhfH5fbFA4px80eU1ugQ==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  MySkill/button_Masuk'))

WebUI.click(findTestObject('Page_Icon Profil/div_Blog_MuiBox-root mui-style-vxcmzt'))

WebUI.click(findTestObject('Object Repository/Page_Si Paling Belajar  MySkill/a_Profil'))

WebUI.click(findTestObject('Object Repository/Page_Profile Saya  MySkill/button_Ubah Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Profile Saya  MySkill/input_oldPassword'), '2BMhfH5fbFA4px80eU1ugQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Profile Saya  MySkill/input_newPassword'), '2BMhfH5fbFAt8M8k7vczCA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Profile Saya  MySkill/input_confirmNewPassword'), '2BMhfH5fbFAdFJho1Op5MQ==')

WebUI.click(findTestObject('Object Repository/Page_Profile Saya  MySkill/button_Ubah Password_1'))

WebUI.click(findTestObject('Object Repository/Page_Profile Saya  MySkill/p_Konfirmasi password baru harus sama denga_455098'))

WebUI.delay(10)

WebUI.closeBrowser()


package javaPackage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class scriptNomorSatu {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User go to (.*)")
	def user_go_to_site(String site) {
		WebUI.openBrowser(site)
		WebUI.maximizeWindow()
	}

	@When("User in landing page")
	def user_in_landing_page() {
		System.out.println("User in 'landing' page")
	}

	@And("User click button Daftar")
	def user_choose_select_value_another_root_option() {
		WebUI.click(findTestObject('Object Repository/Dashboard/01_button_daftar'))
	}

	@And("User click button Daftar Atas Nama Individu")
	def user_click_button_daftar_atas_nama_individu() {
		WebUI.click(findTestObject('Object Repository/Dashboard/02_button_daftarAtasIndividu'))
	}

	@And("User input nama lengkap (.*)")
	def user_input_nama_lengkap(String namaLengkap) {
		WebUI.setText(findTestObject('Object Repository/Dashboard/03_inputText_nama'), namaLengkap)
	}

	@And("User input email (.*)")
	def user_input_email(String email) {
		WebUI.setText(findTestObject('Object Repository/Dashboard/04_inputText_email'), email)
	}

	@And("User input kata sandi	(.*)")
	def user_input_kata_sandi(String kataSandi) {
		WebUI.setText(findTestObject('Object Repository/Dashboard/05_inputText_kataSandi'), kataSandi)
	}

	@And("User input konfirmasi kata sandi (.*)")
	def user_input_konfirmasi_kata_sandi(String konfirmasiKataSandi) {
		WebUI.setText(findTestObject('Object Repository/Dashboard/06_inputText_konfirmasiKataSandi'), konfirmasiKataSandi)
	}

	@And("User choose dari mana anda mengetahui shafiq?")
	def user_choose_dari_mana_anda_mengetahui_shafiq() {
		WebUI.click(findTestObject('Object Repository/Dashboard/07_selectOption_sourceId'))
		WebUI.click(findTestObject('Object Repository/Dashboard/12_div_instagram'))
		WebUI.delay(3)
	}

		@And("User click captcha")
		def user_click_captcha() {
			WebUI.switchToFrame(findTestObject('Object Repository/Dashboard/13_iframe_captcha'), 0)
//			WebUI.focus(findTestObject('Object Repository/Dashboard/06_inputText_konfirmasiKataSandi'))
//			WebUI.sendKeys(findTestObject('Object Repository/Dashboard/06_inputText_konfirmasiKataSandi'), Keys.chord(Keys.TAB))
//			WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//			WebUI.delay(3)
//			WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))
			WebUI.click(findTestObject('Object Repository/Dashboard/08_checkBox_captcha'))
		}

		@And("User click button Daftar Terakhir")
		def user_click_button_daftar() {
			WebUI.switchToDefaultContent()
			WebUI.click(findTestObject('Object Repository/Dashboard/09_button_submit'))
		}

		@And("User click checkbox syarat dan ketentuan")
		def user_click_checkbox_syarat_dan_ketentuan() {
			WebUI.click(findTestObject('Object Repository/Dashboard/10_checkBox_syaratDanKetentuan'))
		}
	
		@And("User click button setujui")
		def user_click_button_setujui() {
			WebUI.click(findTestObject('Object Repository/Dashboard/09_button_submit'))
		}

	@Then('User success register')
	def user_success_register() {
		WebUI.verifyTextPresent('Email Verifikasi Telah Dikirim', false)
	}
}
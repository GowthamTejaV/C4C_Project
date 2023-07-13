package stepdefinitions;

import java.io.IOException;

import com.pages.LoginPage;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;
import io.cucumber.java.en.Given;

public class LoginSteps {
	LoginPage login = new LoginPage();
	
	//use
	@Given("User Login to C4C application as Office Manager {string}")
	public void User_Login_to_C4C_application_as_Office_Manager(String key) throws IOException {
		
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(key);
		
		String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_url");
		String username = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_OfficeManager");
		String password = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_OfficeManagerPassword");
		LoginPage.loginTotheApplication(url, username, password);
		
	}
	//use
	@Given("User Login to C4C application as Regional Manager {string}")
	public void User_Login_to_C4C_application_as_Regional_Manager(String key) throws IOException {
		
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(key);
		
		String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_url");
		String username = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_RegionalManager");
		String password = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_RegionalManager_Password");
		LoginPage.loginTotheApplication(url, username, password);
	}
	//use
	@Given("User Login to C4C application as Country Director {string}")
	public void User_Login_to_C4C_application_as_Country_Director(String key) throws IOException {
		
		
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(key);
		
		String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_url");
		String username = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_CountryDirector");
		String password = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "UAT_CountryDirectorPassword");
		LoginPage.loginTotheApplication(url, username, password);
	}
	//use
	@Given("User Login to C4C application using china contract login {string}")
	public void User_Login_to_C4C_application_using_china_contract_login(String key) throws IOException {
		
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(key);
		
		String url = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "TRAIN_url");
		String username = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "TRAIN_Username_China");
		String password = ApplicationHooks.getFieldValue(ApplicationHooks.readExcelData, "Login", "TRAIN_Password_China");
		LoginPage.loginTotheApplication(url, username, password);
	}
}

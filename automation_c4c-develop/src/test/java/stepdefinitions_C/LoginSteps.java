package stepdefinitions_C;

import java.util.Map;

import com.pages.IC_CreationPage;
import com.pages.Login;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.ExcelUtil;

import AppHooks.ApplicationHooks;
import io.cucumber.java.en.Given;

public class LoginSteps {
	IC_CreationPage icp = new IC_CreationPage();
	ApplicationPageUtil appPageUtil=new ApplicationPageUtil();
	
	
	
	@Given("User login to the application as {string} in {string}")
	public void user_login_to_the_application(String role,String env) throws Exception {
		Map<String,String>credData=new Login().getCredentials(role,env);
			String userName=credData.get("userid");
			String psw=credData.get("password");
			String url=credData.get("url");
			appPageUtil.loginTotheApplicatio_C4C(userName, psw, url);
	}
	@Given("User login to the application as {string} in {string} and {string}")
	public void user_login_to_the_application_as_in_and(String role,String env,String testCaseNo) {
		ApplicationHooks.readExcelData = new ExcelUtil().readExcelData(testCaseNo);
		Map<String,String>credData=new Login().getCredentials(role,env);
			String userName=credData.get("userid");
			String psw=credData.get("password");
			String url=credData.get("url");
			appPageUtil.loginTotheApplicatio_C4C(userName, psw, url);
	}

}
 
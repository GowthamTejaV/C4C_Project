package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;


public class SESBanking {	
	
	public static String urls;
	
	public static By bankingPod = By.xpath(".//h5//a[contains(@href, '/student-essentials/banking/search-results/')]"); 
	public static By bankingPod1 = By.xpath(".//h3//a[contains(@href, '/student-essentials/banking/search-results/')]");
	public static By bankingPodLi = By.xpath(".//a[contains(@href, '/student-essentials/banking/search-results/')]");
	public static By CommonWealthPod = By.xpath(".//*[@class='comp-cont']//*[@class='comp-sub-head'][contains(text(),'Commonwealth bank of Australia')]");
	public static By CommonWealthAboutLink = By.xpath(".//*[@class='comp-cont']//following::a[contains(@href,'student-essentials/banking/')]");
	public static By CommonWealthDetailsBackLink = By.xpath(".//*[@id='ses-emailformtrigger']/following-sibling::a[contains(text(),'Back')]");
	public static By EnqNow = By.xpath(".//*[@id='ses-emailformtrigger']");
	
	public static By emailId = By.xpath(".//*[@id='sesEmail']"); 
	public static By nextBtn = By.xpath(".//*[@class='btn btn-default']");
	public static By ftName = By.xpath(".//*[@id='sesFirstName']");
	public static By ltName = By.xpath(".//*[@id='sesLastName']");
	public static By phoneNo = By.xpath(".//*[@id='sesPhoneNo']");
	public static By nearestIDPSES = By.xpath("//select[contains(@id,'officeName')]");
	public static By termsAndCond = By.xpath(".//*[@id='sesTermsandConditionsAcceptance']//following-sibling::label");
	public static By contEmail = By.xpath(".//*[@id='sesContactMethodAcceptance']//following-sibling::label");
	
	public static By mktPref = By.xpath(".//*[@id='sesMarketingPreferenceAcceptance']//following-sibling::label"); 
	public static By enqSubmit = By.xpath(".//*[contains(@onclick,'sesEnquiry')]");
	public static By asmHeader = By.xpath(".//*[@class='ASM_header navigation navigation--top']");
	public static By asmpwd = By.xpath(".//*[@class='ASM-input ' and contains(@placeholder,'assword')]");
	public static By asmSubmit = By.xpath(".//*[@class='ASM-btn ASM-btn-login']");
	public static By userIntial = By.xpath(".//*[@id='userNameInitial_id']");
	public static By userLogin = By.xpath(".//*[@alt='User profile icon']");

	public static By createProfile = By.xpath(".//h6[@class='sub_title']//a"); 
	public static By signIn = By.xpath(".//*[@class='user_options']//a[contains(@href,'user-signin')]");
	public static By emailtxt = By.xpath(".//*[contains(@class,'email_feild')]//input");
	public static By passwordtxt = By.xpath(".//*[contains(@class,'password_field')]//input");
	public static By submitlogin = By.xpath(".//*[contains(@type,'submit')][contains(@class,'button')]");
	public static By myDetails = By.xpath(".//ul[@class='user_options']//div//a[contains(@href,'user-profile')]");
	public static By appClose = By.xpath(".//*[@class='ap_close']//a");

	public static By langSel = By.xpath(".//*[@id='language']"); 
	public static By multiLang = By.xpath(".//*[@class='mulit-lang-switch']");
	public static By selDestAust = By.xpath(".//*[@class='rad_fld']//label");
	public static By iframes = By.xpath(".//iframe[(@id='CognitoIFrame')]");
	
	/**
	 * This method is used to launch student essentials page
	 */
//	public static void launchStudentEssentials() {
//		try {
//			ConfigReader config = new ConfigReader();
//        	Properties prop = config.read_properties();
//            String envi = prop.getProperty("environment").toLowerCase();
//            String country = prop.getProperty("country").toLowerCase();
//             System.out.println("envi :::::::::::::::::" + envi);
//             if(country.equalsIgnoreCase("vietnam")) {
//             if(envi.equalsIgnoreCase("UAT")) {
//                 urls="https://www-"+envi+".idp.com/"+country+"/student-essentials/?geoip=14.0.16.1";
//                 ApplicationHooks.driver.get(urls);
//             }else if(envi.equalsIgnoreCase("live")) {
//                urls="https://www.idp.com/"+country+"/student-essentials/?geoip=14.0.16.1";
//               ApplicationHooks.driver.get(urls);
//            }
//             }else{
//            	 if(envi.equalsIgnoreCase("UAT")) {
//                     urls="https://www-"+envi+".idp.com/"+country+"/student-essentials/";
//                     ApplicationHooks.driver.get(urls);
//                 }else if(envi.equalsIgnoreCase("live")) {
//                    urls="https://www.idp.com/"+country+"/student-essentials/";
//                   ApplicationHooks.driver.get(urls);
//                } 
//             }
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	

	/**
	 * This method is used to start the SES Banking
	 * @param enqType
	 */
	public static void SESBankingStart() {
		try {
			ExtentCucumberAdapter.addTestStepLog("<b style=\"color:Yellow;\">-----------SES Banking ------------</b>");	
			ElementUtil.scrolldown();
			Boolean appClo = ElementUtil.isElementDisplayed(appClose,30, "App Close");
			if (appClo == true){
				ElementUtil.click(appClose);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * This method is used to call the fill Enquiry and verify it in C4C
	 * @param enqType
	 * @param ProviderCountry
	 * @param ProviderProduct
	 * @param testDataId
	 * @param firstName
	 * @param lastName
	 * @param Email
	 * @param Password
	 */
	public void SESBanking(String enqType, String testDataId, 
			String firstName, String lastName, String Email, String Password, String sheetName, String nearestIDPOff) {
		try {
			System.out.println(enqType);
			switch (enqType.toLowerCase()) {
			  case "loginuser":
				 // LoginIDP.validLogin(Email, Password); 
				  fillSESBankingEnquiry(testDataId, firstName, lastName,sheetName,nearestIDPOff);
				  break;
			  case "counref":
				  fillSESBankingEnquiry(testDataId, firstName, lastName,sheetName,nearestIDPOff);
				  break;
			  case "UserEnquiry":
				  fillSESBankingEnquiry(testDataId, firstName, lastName,sheetName,nearestIDPOff);
				  break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to verify SES Banking after enquired
	 * @param enqType
	 */
	public void verifySESBanking(String enqType) {
		try {
			switch (enqType.toLowerCase()) {
			  case "loginuser":
				  validateBankingUserEnquiry();
				  break;
			  case "counref":
				  verifyCounsellorReferralEnquiry();
				  break;
			  case "UserEnquiry":
				  System.out.println("Going to verify");
				  validateBankingUserEnquiry();
				  break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to enter into banking pod
	 */
	public static void enterIntoBankingPod() {
		try {
			Boolean bnkpodAvail = ElementUtil.isElementDisplayed(bankingPod,20, "Banking Pod");
			Boolean bnkpodAvail1 = ElementUtil.isElementDisplayed(bankingPod1,20, "Banking Pod1");
			if (bnkpodAvail == true || bnkpodAvail1 == true) {
				System.out.println("Banking is displaying");
				Boolean bnkpodAvailCli = ElementUtil.isElementDisplayed(bankingPod,25, "Banking Pod");
				if (bnkpodAvailCli == true) {
					ElementUtil.printToReportPass("Banking Pod AVailable");
					ElementUtil.click(bankingPod);
				}
				Boolean bnkpodAvailCli1 = ElementUtil.isElementDisplayed(bankingPod1,20, "Banking Pod1");
				if (bnkpodAvailCli1 == true) {
					ElementUtil.printToReportPass("Banking Pod AVailable");
					ElementUtil.click(bankingPod1);
				}
			}else {
				ElementUtil.printToReportFAIL("Banking Pod Not enabled");
			}
			ElementUtil.waitForCertainTime(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to fill SES Enquiry Banking
	 * @param ProviderCountry
	 * @param ProviderProduct
	 * @param testDataId
	 * @param firstName
	 * @param lastName
	 * @throws IOException 
	 */
	public void fillSESBankingEnquiry(String testDataId, String firstName, String lastName, String sheetName, String nearestIDPOff) throws IOException {
		try {
				ElementUtil.ranEmailId(emailId, sheetName, testDataId, 3);
				ElementUtil.click(nextBtn);
				ElementUtil.type(ftName, firstName);
				ElementUtil.type(ltName, lastName);
				ElementUtil.ranMobileNo(phoneNo, sheetName, testDataId, 6);
//				ConfigReader config = new ConfigReader();
//	        	Properties prop = config.read_properties();
//	            String country = prop.getProperty("country").toLowerCase();
//				if(country.equalsIgnoreCase("vietnam")) {
//					ElementUtil.ranMobileNoViet(phoneNo, sheetName, testDataId, 6);
//				}
				Boolean nearestIDP = ElementUtil.isElementDisplayed(CanadaImmigrationServices.nearestIDPOfficeCli, 8, "Nearest IDP Office");
				if(nearestIDP) {
					ElementUtil.click(CanadaImmigrationServices.nearestIDPOfficeCli);
					ElementUtil.customDropList(CanadaImmigrationServices.nearestIDPOffice, nearestIDPOff);
				}else {
					ElementUtil.printToReportMessage("Nearest IDP Office Field is not available here");
				}

				ElementUtil.click(contEmail);
				ElementUtil.click(mktPref);
				ElementUtil.click(termsAndCond);
				ElementUtil.printToReportMessage("Following data entered");
				ElementUtil.waitForCertainTime(2000);
				ElementUtil.click(enqSubmit);
				ElementUtil.waitForPageLoad(6000);
		}catch(FileNotFoundException e) {
			Assert.fail();
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to validate the user Enquiry in SES Banking
	 * @param testDataId
	 */
	public static void validateBankingUserEnquiry() {
		try {
			String pageUrl = ElementUtil.getURL();
			String a[] = pageUrl.split("/");
			System.out.println(a[2]);
			if (a[2].equalsIgnoreCase("www.commbank.com.au")) {
				ElementUtil.printToReportPass("BANKING USER ENQUIRY SUCCESS");
			} else if (a[2].equalsIgnoreCase("pay.cibc.com")) {
				ElementUtil.printToReportPass("BANKING USER ENQUIRY SUCCESS");
			} else if (a[2].equalsIgnoreCase("www.icicibank.co.uk")) {
				ElementUtil.printToReportPass("BANKING USER ENQUIRY SUCCESS");
			} else {
				ElementUtil.printToReportFAIL("BANKING USER ENQUIRY UNSUCCESS");
				Assert.fail();
			}
			ElementUtil.waitForCertainTime(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to validate the Counsellor referral enquiry in SES Banking
	 */
	public static void verifyCounsellorReferralEnquiry() {
		try {
			String pageUrl1 = ElementUtil.getURL();
			String aa[] = pageUrl1.split("/");
			System.out.println(aa[2]);
			if (aa[2].equalsIgnoreCase("www.commbank.com.au")) {
				ElementUtil.printToReportPass(" BANKING COUNCELLOR REFERRAL SUCCESS ");
				} else if (aa[2].equalsIgnoreCase("pay.cibc.com")) {
					ElementUtil.printToReportPass(" BANKING COUNCELLOR REFERRAL SUCCESS ");
				} else if (aa[2].equalsIgnoreCase("www.icicibank.co.uk")) {
					ElementUtil.printToReportPass(" BANKING COUNCELLOR REFERRAL SUCCESS ");
				} else {
					ElementUtil.printToReportFAIL(" BANKING COUNCELLOR REFERRAL UNSUCCESS ");
					Assert.fail();
			}
			ElementUtil.waitForCertainTime(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to verify the User Enquiry in SES Banking
	 */
	public static void verifyUserEnquiry() {
		try {
			String pageUrl2 = ElementUtil.getURL();
			String a2[] = pageUrl2.split("/");
			System.out.println(a2[2]);
			if (a2[2].equalsIgnoreCase("www.commbank.com.au")) {
				ElementUtil.printToReportPass(" BANKING USER ENQUIRY SUCCESS ");
			} else if (a2[2].equalsIgnoreCase("www.icicibank.co.uk")) {
				ElementUtil.printToReportPass(" BANKING USER ENQUIRY SUCCESS ");
			}else{
				ElementUtil.printToReportFAIL(" BANKING USER ENQUIRY UNSUCCESS ");
				Assert.fail();
			}
			ElementUtil.waitForCertainTime(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
   /**
    * This method is used to click the provider product dynamically
    * @param tabText
    */
	public static void destinationClick(String providerCountry) {
		try {
			Thread.sleep(000);
			ElementUtil.scrolldown();
			System.out.println("providerCountry : " + providerCountry);
			WebElement clProvCoun = DriverFactory.getDriver().findElement(By.xpath(".//*[@class='rad_fld']//label[contains(text(),'" + providerCountry + "')]"));
			JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
			js.executeScript("arguments[0].click()", clProvCoun);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to click the enquiry  button
	 * @param tabText
	 */
	public static void clickenqBtn(String ProviderProduct) {
         try {
       // 	 ElementUtil.waitForElementVisible(moneyTransferPage);
 		//	System.out.println("Displaying money transfer pod in the SES modules ");
 			WebElement clProvProd = DriverFactory.getDriver().findElement(By.xpath("//*[contains(@href,'" + ProviderProduct + "')]//parent::div//parent::div//following-sibling::div[@class='white-bg-comp']//a"));
 		//	ElementUtil.Jclick(clickProvProduct);
 			JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
 			js.executeScript("arguments[0].click()", clProvProd);
 			
         }catch(Exception e) {
        	 e.printStackTrace();
         }
	}
	
	
	/**
	 * This method is used to click the enquiry  button
	 * @param tabText
	 */
	public static void clickenqBtnOshc(String ProviderProduct) {
         try {
       // 	 ElementUtil.waitForElementVisible(moneyTransferPage);
 		//	System.out.println("Displaying money transfer pod in the SES modules ");
 			WebElement clProvProd = DriverFactory.getDriver().findElement(By.xpath("//*[contains(@href,'" + ProviderProduct + "')]//parent::div//parent::div//following-sibling::div[@class='white-bg-comp']//a[@class='sitebtn grnbtn ']"));
 		//	ElementUtil.Jclick(clickProvProduct);
 			JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
 			js.executeScript("arguments[0].click()", clProvProd);
 			
         }catch(Exception e) {
        	 e.printStackTrace();
         }
	}
	

}

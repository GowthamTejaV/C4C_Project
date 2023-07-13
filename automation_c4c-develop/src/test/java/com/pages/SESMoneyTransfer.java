package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;
public class SESMoneyTransfer {
	
	public static By moneytransferPod = By.xpath(".//h5/a[contains(@href, '/student-essentials/money-transfer/search-results/')]");
    public static By moneytransferPod1 = By.xpath(".//h3/a[contains(@href, '/student-essentials/money-transfer/search-results/')]");
    public static By moneyTransferPage = By.xpath(".//*[@class='comp-cont']//*[@class='comp-sub-head']");
    public static By CohortGoAboutLink = By.xpath(".//*[@class='comp-cont']//*[@class='comp-sub-head'][contains(text(),'Cohort')]/following-sibling::a[contains(text(),'About')]");
    public static By BacktoListingLink = By.xpath(".//*[@id='ses-emailformtrigger']/following-sibling::a[contains(text(),'Back')]");
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
    public static By termsAndCondi = By.xpath(".//*[@id='terms_and_conditions']");
    public static By flywireCollege = By.xpath(".//*[@id='LANDING_PAGE_FIELD']");

    public static By ajxlst = By.xpath(".//li[contains(@id,'LANDING_PAGE_FIELD-option')]");
    public static By flywireAdminFees = By.xpath(".//input[contains(@id,'payment_items')]");
    public static By flywireContinue = By.xpath(".//span[contains(@class,'ActionIcon icon-arrow-right')]");
    public static By flywireContinueOne = By.xpath(".//span[contains(@class,'ActionIcon icon-arrow-right')]");
    public static By iframes = By.xpath(".//iframe[contains(@src,'login')]");
    public static By iframes1 = By.xpath(".//iframe[(@id='CognitoIFrame')]");
    public static By asmHeader = By.xpath(".//*[@class='ASM_header navigation navigation--top']");
    public static By asmpwd = By.xpath(".//*[@class='ASM-input ' and contains(@placeholder,'assword')]");
    
    public static By asmSubmit = By.xpath(".//*[@class='ASM-btn ASM-btn-login']");
    public static By userLogin = By.xpath(".//*[@alt='User profile icon']");
    public static By createProfile = By.xpath(".//h6[@class='sub_title']//a");
    public static By signIn = By.xpath(".//*[@class='user_options']//a[contains(@href,'user-signin')]");
    public static By emailtxt = By.xpath(".//*[contains(@class,'email_feild')]//input");
    public static By passwordtxt = By.xpath(".//*[contains(@class,'password_field')]//input");
    public static By submitlogin = By.xpath(".//*[contains(@type,'submit')][contains(@class,'button')]");
    public static By myDetails = By.xpath(".//ul[@class='user_options']//div//a[contains(@href,'user-profile')]");

    public static By userIntial = By.xpath(".//*[@id='userNameInitial_id']");
    public static By appClose = By.xpath(".//*[@class='ap_close']//span");
    public static By langSel = By.xpath(".//*[@id='language']");
    public static By multiLang = By.xpath(".//*[@class='mulit-lang-switch']");
    public static By selDestAust = By.xpath(".//*[@class='rad_fld']//label");
    public static By flywirePod = By.xpath(".//*[contains(@src,'https://agents-integration.flywire.lol')]");
    public static By interceptClose = By.xpath("//*[@id=\"intercom-container\"]/div/div/div[1]/div/div[2]");
    /**
     * This method is used to click money transfer pod in Student Essentials page
     */
    public void clickMoneyTransferPod() {
    	try {
    		Boolean moneyPodAva = ElementUtil.isElementDisplayed(moneytransferPod,10, "Money Transfer Pod");
			Boolean monehyPodAva1 = ElementUtil.isElementDisplayed(moneytransferPod1,10, "Money Transfer Pod1");
			if (moneyPodAva == true || monehyPodAva1 == true) {
				Boolean moneyPodCli = ElementUtil.isElementDisplayed(moneytransferPod,10, "Money Transfer Pod");
				if (moneyPodCli == true) {
					ElementUtil.click(moneytransferPod);
				}
				Boolean moneyPodCli1 = ElementUtil.isElementDisplayed(moneytransferPod1,10, "Money Transfer Pod1");
				if (moneyPodCli1 == true) {
					ElementUtil.click(moneytransferPod1);
				}
			}
			System.out.println("Money Transfer POD is displaying");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    /**
     * This method is used to click the destination country in the Money Transfer pod
     * @param ProviderCountry
     */
    public void clickDestinationCountry(String providerCountry) {
    	try {
    		Thread.sleep(5000);
			ElementUtil.scrolldown();
			WebElement clProvCoun =DriverFactory.getDriver().findElement(By.xpath(".//*[@class='rad_fld']//label[contains(text(),'" + providerCountry + "')]"));
			JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getDriver();
			js.executeScript("arguments[0].click()", clProvCoun);
			}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    /**
     * This method is used to click enquiry button in the money transfer pod
     * @param ProviderProduct
     */
    public void clickEnquiryButton(String ProviderProduct) {
    	try {
			WebElement clProvProd =DriverFactory.getDriver().findElement(By.xpath("//*[contains(@href,'" + ProviderProduct + "')]//parent::div//parent::div//following-sibling::div[@class='white-bg-comp']//a"));		
			JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getDriver();
			js.executeScript("arguments[0].click()", clProvProd);
			}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    /**
     * This method is used to fill enquiry details in the money transfer pod
     * @param testDataId
     * @param firstName
     * @param lastName
     * @throws IOException 
     * @throws InterruptedException 
     */
    public void fillEnquiryDetails(String testDataId, String firstName, String lastName, String sheetName, String nearestIDPOff) throws IOException, InterruptedException {
    	try {
			ElementUtil.ranEmailId(emailId, sheetName, testDataId, 3);
			ElementUtil.click(nextBtn);
			ElementUtil.type(ftName, firstName);
			ElementUtil.type(ltName, lastName);
			ElementUtil.ranMobileNo(phoneNo, sheetName, testDataId, 6);
//			ConfigReader config = new ConfigReader();
//        	Properties prop = config.read_properties();
//            String country = prop.getProperty("country").toLowerCase();
//			if(country.equalsIgnoreCase("vietnam")) {
//				ElementUtil.ranMobileNoViet(phoneNo, sheetName, testDataId, 6);
//			}
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
			System.out.println("Following data entered");
			ElementUtil.click(enqSubmit);
			Thread.sleep(10000);
    	}catch(FileNotFoundException e) {
			Assert.fail();
			e.printStackTrace();
		}
    }
    
    public void fillEnquiryDetails() throws IOException, InterruptedException {
    
    	ElementUtil.click(contEmail);
			ElementUtil.click(mktPref);
			ElementUtil.click(termsAndCond);
			System.out.println("Following data entered");
			ElementUtil.click(enqSubmit);
			Thread.sleep(10000);
  
    }
    
    
   
   /**
    * This method is used to verify money transfer product in the Money Transfer Pod 
    * @param ProviderCountry
    * @param testDataId
    */
    public void verifyMoneyTransfersProduct() {
    	try {
			String pageUrl1 = ElementUtil.getURL();
			String aa[] = pageUrl1.split("/");
			System.out.println(aa[2]);
			Boolean flywirePo = ElementUtil.isElementDisplayed(flywirePod,10,"Flywire Pod");
			if (flywirePo == true) {
				ElementUtil.printToReportPass(" Money transfer User enquiry success ");
			} else if (aa[2].equalsIgnoreCase("student.globalpay.wu.com")) {
				ElementUtil.printToReportPass(" Money transfer User enquiry success ");
			} else if (aa[2].equalsIgnoreCase("idp.cohortgo.app")) {
				ElementUtil.printToReportPass(" Money transfer User enquiry success ");
			} else if (aa[2].equalsIgnoreCase("www.icicibank.com")) {
				ElementUtil.printToReportPass(" Money transfer User enquiry success ");
			} else if (aa[2].equalsIgnoreCase("students.convera.com")) {
				ElementUtil.printToReportPass(" Money transfer User enquiry success ");
			} 
			else {
				ElementUtil.printToReportFAIL(" Money transfer User enquiry Unsuccess ");
				Assert.fail();
			}    	
			}catch(Exception e) {
    		e.printStackTrace();
    	}
    }

}

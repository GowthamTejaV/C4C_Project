package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class CanadaImmigrationServices { 

	public static By immigrationServicesMenu = By.xpath("//*[contains(@class,'nav__links nav__links--products nav__links--hideImgContent js-offcanvas-links navbar-left')]//li[7]");
	public static By migrationServicesMenu = By.xpath("//a[contains(@class,'ga4SesMigrationService')]");
	public static By emailIDSES = By.xpath("//*[contains(@class,'form-group rfrmerr')]//input");
	public static By nextBtn = By.xpath("//button[contains(@class,'btn btn-default')]/span[1]");
	public static By studyInterest = By.xpath("//*[contains(@class,'formControl__checkbox rfrmsuc')]");
	public static By currentVisaStatusCli = By.xpath("//*[@id='currentVisaStatus']//parent::div[1]//parent::div[1]");
	public static By currentVisaStatusSel = By.xpath("//*[@id='currentVisaStatus']//following-sibling::div//following-sibling::div[@class='menu transition visible']/child::div");
	public static By nearestIDPOfficeCli = By.xpath("//*[@id='officeName']//parent::div[1]//parent::div[1]");
	public static By nearestIDPOffice = By.xpath("//*[@id='officeName']//following-sibling::div//following-sibling::div[@class='menu transition visible']/child::div");
	public static By getStarted = By.xpath("//*[@id=\"ses-emailformtrigger\"]");
	public static By SubHeading = By.xpath("//div[@class='comp-left']/div[@class='comp-sub-head']");
	public static By SubHeadingText = By.xpath("(//div[@class='comp-left'])/div[@class='comp-sub-head']/h4"); 
		/**
		 * This method is used to click the Enquiry  button
		 * @param ProviderProduct
		 */
		public static void getStartedProvider(String ProviderProduct) {
	         try {
	        	System.out.println("ProviderProduct : " + ProviderProduct);
	        	String tabxpath = "//*[contains(@href,'" + ProviderProduct + "')]//parent::div//parent::div//following-sibling::div[@class='white-bg-comp']//a";
	     		WebElement elment = DriverFactory.getDriver().findElement(By.xpath(tabxpath));
	        	ElementUtil.scrolldown();
	     		ElementUtil.clickJS(elment);
	         }catch(Exception e) {
	        	 e.printStackTrace();
	         }
		}
		
		/**
		 * This method is used to navigate to migration services
		 */
		public void enterIntoMigrationServices() {
			try {
				ElementUtil.click(immigrationServicesMenu);
				ElementUtil.click(migrationServicesMenu);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * This method is used to fill the immigration services enquiry form  in IDP
		 * @param ProviderProduct
		 * @param testDataId
		 * @param firstName
		 * @param lastName
		 * @param studyIntVal
		 * @param visaStatus
		 * @throws IOException 
		 */
		public void fillEnquiryFormMigrationServices(String testDataId, String ProviderProduct, String firstName, String lastName, String studyIntVal,
				String visaStatus, String sheetName) throws IOException {
			try {
				ElementUtil.waitForCertainTime(4000);
			//	ElementUtil.click(getStarted);
				getStartedProvider(ProviderProduct);
				ElementUtil.ranEmailId(SESBanking.emailId, sheetName, testDataId, 3);
				ElementUtil.click(SESBanking.nextBtn);
				ElementUtil.type(SESBanking.ftName, firstName);
				ElementUtil.type(SESBanking.ltName, lastName);
				ElementUtil.ranMobileNo(SESBanking.phoneNo, sheetName, testDataId, 5);
				interestedStudyInCanada(studyIntVal);
				ElementUtil.click(currentVisaStatusCli);
				System.out.println("visaStatus : " + visaStatus);
				ElementUtil.customDropList(currentVisaStatusSel, visaStatus);
				ElementUtil.click(SESBanking.contEmail);
				ElementUtil.click(SESBanking.mktPref);
				ElementUtil.click(SESBanking.termsAndCond);
				ElementUtil.waitForCertainTime(500);
				ElementUtil.click(SESBanking.enqSubmit);
				ElementUtil.printToReportMessage("ENQUIRED SUCCESSFULLY");
				ElementUtil.waitForCertainTime(20000);
				
			}catch(FileNotFoundException e) {
				Assert.fail();
				e.printStackTrace();
			}
		}
		
		/**
		 * This method is used to select where we are interested to study in canada or not
		 * @param studyIntVal
		 */
		public void interestedStudyInCanada(String studyIntVal) {
			try {
				WebElement studyInterestEle = DriverFactory.getDriver().findElement(studyInterest);
	            List<WebElement> studyInterestEleLists = studyInterestEle.findElements(By.tagName("li"));
	            Thread.sleep(2000);
	            int getstudyInterestEleLists = studyInterestEleLists.size();
				for(int i =1; i<=getstudyInterestEleLists; i++) {
					WebElement studyInterestEleListWeb = DriverFactory.getDriver().findElement(By.xpath("//*[contains(@class,'formControl__checkbox rfrmsuc')]//li["+i+"]/label"));
					String studyInterestEleListWebValue = studyInterestEleListWeb.getText();
					if(studyInterestEleListWebValue.equalsIgnoreCase(studyIntVal)) {
						DriverFactory.getDriver().findElement(By.xpath("//*[contains(@class,'formControl__checkbox rfrmsuc')]//li["+i+"]/label")).click();
					    ElementUtil.printToReportMessage("Study Interest Clicked");
					    break;
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			}
	
		public static void ValidateSubHeading() {
			ElementUtil.scrollToElement(SubHeading);
			
		List<WebElement> list = DriverFactory.getDriver().findElements(SubHeading);
		
		int listSize = list.size();
		
		for(int i=1; i<=listSize; i++ ) {		
			WebElement Heading = DriverFactory.getDriver().findElement(By.xpath("(//div[@class='comp-left']/div[@class='comp-sub-head'])[" +i+ "]"));
			String Subheading = Heading.getText();
			System.out.println(Subheading);
			if(Subheading.contains("VisaPlace")) {
				
				WebElement SubHeadingText = DriverFactory.getDriver().findElement(By.xpath("(//div[@class='comp-left']/div[@class='comp-sub-head']/h4)[" +i+ "]"));
				String Text = SubHeadingText.getText();
				System.out.println(Text);
				if(Text.contains("Immigration Lawyers")) {
					System.out.println("Text displayed as expected");
				}
				else {
					System.out.println("Text is not displayed as expected");
				}
			}
			
			else if(Subheading.contains("WooW Canada Immigration")) {
				WebElement SubHeadingText = DriverFactory.getDriver().findElement(By.xpath("(//div[@class='comp-left']/div[@class='comp-sub-head']/h4)[" +i+ "]"));
				String Text = SubHeadingText.getText();
				System.out.println(Text);
				if(Text.contains("Regulated Canadian Immigration Consultants")) {
					System.out.println("Text displayed as expected");
				}
				else {
					System.out.println("Text is not displayed as expected");
				}
			}
		}
		}
	
}

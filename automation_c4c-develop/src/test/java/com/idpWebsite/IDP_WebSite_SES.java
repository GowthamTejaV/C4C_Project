package com.idpWebsite;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.qa.util.DriverFactory;
import com.qa.util.ApplicationPageUtil;
import com.qa.util.ConfigReader;
import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;


public class IDP_WebSite_SES {
	private By spinnerLoading = By.xpath(".//div[@class='spinner']");

	private By studentEssential = By.xpath(".//a[text()=' Student Essentials']");

	private By ses_MoneyTransferCourse = By.xpath(".//a[text()='Money Transfer']");

	private By destinationCountry = By.xpath(".//label[text()='Australia ']");

	private By payNowBtn = By.xpath("(.//a[@id='ses-emailformtrigger']/span[contains(text(),'Pay now')])[1]");

	private By enter_EmailID = By.xpath(".//label[text()='Enter your email']");

	private By sesEmailID_Input_txt = By.xpath(".//input[@id='sesEmail']");

	private By nextBtn = By.xpath(".//button[@type='submit']//span[text()=' Next']");

	private By sesfirstName = By.xpath(".//label[@for='sesFirstName']");

	private By sesfirstName_Input_txt = By.xpath(".//input[@id='sesFirstName']");

	private By sesLastName = By.xpath(".//label[@for='sesLastName']");

	private By sesLastName_Input_txt = By.xpath(".//input[@id='sesLastName']");

	private By sespPhNo = By.xpath(".//input[@name='phoneNo']");

	private By termas_and_conditions_chkb = By.xpath(".//*[@name='termsandConditionsAcceptance']");

	private By sesContactMethod_chkb = By.xpath(".//label[@for='sesContactMethodAcceptance']");

	private By sesMarketingPrefer_chkb = By.xpath(".//label[@for='sesMarketingPreferenceAcceptance']");

	private By processedBtn = By.xpath(".//*[contains(text(),'Proceed')]");

	private By ses_created_EmailID = By.xpath(".//*[@name='email']");

	private By leadCategory = By.xpath(".//*[@data-help-id='TMItVDruGaIo5bZ$OmVaVG']");
	
	private By clodeEditpage=By.xpath(".//bdi[text()='Cancel']");

	// Regression Test Cases

	private By accommodation = By.xpath(".//a[contains(text(),'Accommodation')]");
	private By selectDestinationBtn = By.xpath(".//select[@name='sesDestinationCountry']");
	private By destinationOptions = By.xpath(".//select[@name='sesDestinationCountry']/option");
	private By institutionname = By.xpath(".//input[@name='sesInstitutionName']");
	private By campnames = By.xpath(".//ul[@id='campName']//li[text()='Armidale']");
	private By assistantPrompt = By.xpath(".//span[text()='IDP Virtual Assistant']");
	private By dismiss=By.xpath(".//div[@aria-label='Dismiss']");
	private By searchBtn=By.xpath(".//span[text()='Search']");
	private By underEighteenonBtn=By.xpath(".//label[text()='Yes']/preceding-sibling::input");
	private By interComMessengerBtn=By.xpath(".//div[@aria-label='Open Intercom Messenger']");
	private By closeInterComMessengerBtn=By.xpath("//div[@data-testid='launcher-minimize-icon']/svg");
	private By accomdationOptions=By.xpath("//button[text()='Proceed to book']");
	private By accomdationOpt=By.xpath("(//button[text()='Proceed to book'])[1]");
	private By sesEmail=By.xpath("(.//input[@name='sesEmail']/following-sibling::label)[1]");
	private By sesnextBtn=By.xpath("(.//span[contains(text(),'Next')])[1]");
	private By nearestIDPOfficeDropDown=By.xpath(".//label/preceding-sibling::div//i");
	
	public void closeTheEditPage() {
		ElementUtil.click(clodeEditpage);
	}
	
	public void enternearestIDPOfficeDropDown(String idpOffice) {
		ElementUtil.click(nearestIDPOfficeDropDown);
		List<WebElement>eles=DriverFactory.getDriver().findElements(By.xpath(".//label/preceding-sibling::div//i/following-sibling::div/following-sibling::div/child::div"));
		Iterator<WebElement>itr=eles.iterator();
		
		while(itr.hasNext()){
			WebElement ele=itr.next();
			String str=(String)ele.getText();
			if(str.equalsIgnoreCase(idpOffice)) {
				ele.click();
				break;
			}
		}
	}
	
	
	public void enterTheSESEmailID(String emailTxt) {
		ElementUtil.click(sesEmail);
		ElementUtil.type(sesEmail,emailTxt);
	}
	public void clickSESNextBtn() {
		ElementUtil.click(sesnextBtn);
	}	
	
	
	public void clickOnSESSearchButton() {
		ElementUtil.click(searchBtn);
	}
	
	public int getaccomationCount() {
		return DriverFactory.getDriver().findElements(accomdationOptions).size();
	}
	
	public void clickONaccomationOption() {
		ElementUtil.click(accomdationOpt);
		//DriverFactory.getDriver().findElements(accomdationOptions).get(0).click();;
	}
	
	
	public void selectUnunder_eighteen_RaiodButton() {
		ElementUtil.click(underEighteenonBtn);
	}

	public void isVirtualAssistantPromptDisplaying() {
	  boolean flag=false;
		try {
			//.//iframe[@name='intercom-borderless-frame']
			DriverFactory.getDriver().switchTo().frame(DriverFactory.getDriver().findElement(By.xpath("//iframe[@name='intercom-borderless-frame']")));
			ElementUtil.waitForElementNotPresent(assistantPrompt);
			flag= ElementUtil.isElementDisplayed(assistantPrompt);
			
		} catch (Exception ex) {
			flag= false;
		}
		if(flag) {
			Actions act=new Actions(DriverFactory.getDriver());
			act.moveToElement(DriverFactory.getDriver().findElement(dismiss)).click().build().perform();
			DriverFactory.getDriver().switchTo().defaultContent();
		}
		
	}
	
	public void clicAndCloseTheIntercomMessenger() {
		
		try {
			ElementUtil.waitForElementClickable(interComMessengerBtn);
			ElementUtil.click(interComMessengerBtn);
			String st=Thread.currentThread().getName();
			System.out.println("Current Thread:-"+st);
			isVirtualAssistantPromptDisplaying();
			Thread.sleep(2500);
			//DriverFactory.getDriver().switchTo().frame(0);
			//Thread.sleep(2000);
			DriverFactory.getDriver().switchTo().frame(DriverFactory.getDriver().findElement(By.xpath("(.//iframe[@title='Intercom live chat'])[2]")));
			Thread.sleep(1000);
			DriverFactory.getDriver().findElement(By.xpath("//div[@data-testid='launcher-with-badge-cutout-none']")).click();
			DriverFactory.getDriver().switchTo().defaultContent();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}

	
	public void selectAccomadationproduct() {
		// waitForLoadGetDisappiera();
		
		clicAndCloseTheIntercomMessenger();
		isVirtualAssistantPromptDisplaying();
		Actions act = new Actions(DriverFactory.getDriver());
		act.moveToElement(DriverFactory.getDriver().findElement(studentEssential))
				.click(DriverFactory.getDriver().findElement(accommodation)).build().perform();
		clicAndCloseTheIntercomMessenger();
	}

	public boolean isstudentEssentialTabAvailable() {
		return ElementUtil.isElementDisplayed(studentEssential);
	}

	public void selectTheDestination(String dest) {
		ElementUtil.click(selectDestinationBtn);
		ElementUtil.waitForElementVisible(destinationOptions);
		List<WebElement> eles = DriverFactory.getDriver().findElements(destinationOptions);
		for (WebElement ele : eles) {
			if (dest.equals(ele.getText())) {
				ele.click();
			}
		}
	}

	public void enteryUniversityAndSelectAnyOneOfTheCampus(String universityname) {
		ElementUtil.type(institutionname, universityname);

	}

	public String getEnterdInstitutionNameText() {
		String txt;
		txt= ElementUtil.getAttribute(institutionname, "value");
		isVirtualAssistantPromptDisplaying();
		return txt;
	}

	public void select_the_campus_name(String camp) {

		List<WebElement> eles = DriverFactory.getDriver().findElements(campnames);
		if (eles.size() > 0) {
			ElementUtil.click(By.xpath(".//ul[@id='campName']//li[text()='" + camp + "']"));
		}
	}

	public boolean listOfCampus() {
		List<WebElement> eles = DriverFactory.getDriver().findElements(campnames);
		return eles.size() > 0;
	}

	public void waitForLoadGetDisappiera() {

		ElementUtil.waitForElementNotPresent(spinnerLoading);
	}

	public void click__ON_StudentEssential_Tab() {

		ElementUtil.click(studentEssential);

	}

	public void submit_for_ses_MoneyTransferCourse() {
		String FnamePrefix = "IDP_SES_VGT_";
		String Fname = ElementUtil.generateRandomString(4);
		String Lname = ElementUtil.generateRandomString(4);
		String Pemail = ElementUtil.generateEmail(7);
		System.out.println("vgt_" + Pemail);
		ConfigReader.writeToApplicationPropertie("IDP_STUDENT", "vgt_" + Pemail);
		String modNo = ElementUtil.generateRandomNumber(10);
		String updatedmodNo = modNo.replace(modNo.substring(0, 3), "999");

		ElementUtil.click(ses_MoneyTransferCourse);
		ElementUtil.click(destinationCountry);
		ElementUtil.click(payNowBtn);
		ElementUtil.click(enter_EmailID);
		ElementUtil.type(sesEmailID_Input_txt, "vgt_" + Pemail);

		ElementUtil.click(nextBtn);

		ElementUtil.click(sesfirstName);
		ElementUtil.type(sesfirstName_Input_txt, FnamePrefix + Fname);

		ElementUtil.click(sesLastName);
		ElementUtil.type(sesLastName_Input_txt, Lname);

		ElementUtil.type(sespPhNo, updatedmodNo);
		ElementUtil.click(termas_and_conditions_chkb);
		ElementUtil.click(sesContactMethod_chkb);
		ElementUtil.click(sesMarketingPrefer_chkb);
		ElementUtil.click(processedBtn);
	}

	public String get_Ses_EmailID() {
		String email;
		try {
			Thread.sleep(8500);
			try {
				DriverFactory.getDriver().switchTo().frame(0);
			} catch (Exception e) {

			}
			email = ElementUtil.getAttribute(ses_created_EmailID, "value");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			email = null;
			e.printStackTrace();
		}
		return email;
	}

	public String getLeadCategoryText() {
		ApplicationPageUtil.waitForLoadGetDisappiear();
		return ElementUtil.getText(leadCategory);
	}

}

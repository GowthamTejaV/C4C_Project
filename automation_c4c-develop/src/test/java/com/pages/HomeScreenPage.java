package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.util.DriverFactory;
import com.qa.util.ElementUtil;

public class HomeScreenPage {
	
	private By addGoupBtn=By.xpath("(.//bdi[text()='Add Group'])[1]");
	private By enterGroupName=By.xpath("(.//input[@placeholder='Enter group name'])[2]");
	private By addCardsIcon=By.xpath("(.//button[@title='Add Cards']/span)[1]");
	private By deleteGroupBtn=By.xpath("(.//button[@title='Delete']/span)[1]");
	private By cardsPrompt=By.xpath(".//span[text()='Cards']");
   

	private By cardsReportsTab=By.xpath(".//div[text()='Reports']");
	private By reportSecionText=By.xpath(".//div/span[text()='Reports']");
	
	private By cardsToolsTab=By.xpath(".//div[text()='Tools']");
	private By toolsSecionText=By.xpath(".//div/span[text()='Tools']");
	
	private By cardsFiltersTab=By.xpath(".//div[text()='Filters']");
	private By filtersSecionText=By.xpath(".//div/span[text()='Filters']");

	private By cardsCustomTab=By.xpath(".//div[text()='Custom']");
	private By customSecionText=By.xpath(".//div/span[text()='Custom']");
	
	public void clickDeletedGroupBtn() {
		ElementUtil.waitForElementVisible(deleteGroupBtn);
		ElementUtil.click(deleteGroupBtn);
	}
	
	public void clickOnAddCardIcon() {
	  ElementUtil.waitForElementPresent(addCardsIcon);
		ElementUtil.click(addCardsIcon);
	}
	

	public boolean iscustomSecionTextDisplaying() {
		 ElementUtil.waitForElementPresent(customSecionText);
		return ElementUtil.isElementDisplayed(customSecionText);
	}
	public void clickOncardsCustomTab() {
		ElementUtil.waitForElementPresent(cardsCustomTab);
		ElementUtil.click(cardsCustomTab);
	}
	
	public boolean isfiltersSecionTextDisplaying() {
		ElementUtil.waitForElementPresent(filtersSecionText);
		return ElementUtil.isElementDisplayed(filtersSecionText);
	}
	public void clickOncardsFiltersTab() {
		ElementUtil.waitForElementPresent(cardsFiltersTab);
		ElementUtil.click(cardsFiltersTab);
	}
	
	public boolean istoolsSecionTextDisplaying() {
		ElementUtil.waitForElementPresent(toolsSecionText);
		return ElementUtil.isElementDisplayed(toolsSecionText);
	}
	public void clickOncardsToolsTab() {
		ElementUtil.waitForElementPresent(cardsToolsTab);
		ElementUtil.click(cardsToolsTab);
	}
	
	
	public boolean isreportSecionTextDisplaying() {
		ElementUtil.waitForElementPresent(reportSecionText);
		return ElementUtil.isElementDisplayed(reportSecionText);
	}
	public void clickOncardsReportsTab() {
		ElementUtil.waitForElementPresent(cardsReportsTab);
		ElementUtil.click(cardsReportsTab);
	}
	
	public boolean isCardsPromtDisplaying() {
		ElementUtil.waitForElementPresent(cardsPrompt);
		return ElementUtil.isElementDisplayed(cardsPrompt);
	}
	
	private By headerLogo=By.cssSelector("[title='Logo']");
	private By sideMenuHomeOption=By.xpath(".//span[text()='Home']/preceding-sibling::span/span");
	private By productivity=By.cssSelector("[aria-label='history']");
	private By notification=By.cssSelector("[aria-label='bell']");
	private By userMenu=By.cssSelector("[aria-label='customer']");
	private By homeScreenHomeText=By.xpath(".//div/span[text()='Home']");
	
	private By createButton=By.xpath(".//*[@data-help-id='globalCreateButton']");
	private By editButton=By.xpath(".//*[@data-help-id='HomePage-EditButton']");
	private By refreshButton=By.xpath(".//*[@data-help-id='HomePage-RefreshButton']");
	
	private By closeCreatePrompt=By.xpath("(.//button[@title='Close']//span)[1]");
	
	//Search Menu Options
	private By globalSearchIcon=By.cssSelector("[aria-label='Search']");
	private By allCategorysFilter=By.xpath(".//span[text()='All Categories']");
	private By searchMenuCloseButton=By.cssSelector("[title='Close']");
	private By advancedOption=By.xpath(".//bdi[text()='Advanced']");
	private By allItemsOption=By.xpath(".//div[text()='All Items']");
	private By myItemsOption=By.xpath(".//div[text()='My Items']");
	private By searchResultText=By.xpath(".//span[text()='Search Results']");
	private By clearOption=By.xpath(".//bdi[text()='Clear']");
	private By noMatchErrorMsg=By.xpath(".//div[text()='No match found. Please refine your search criteria.']");
	private By getAllCategorys=By.xpath("(.//ul[contains(@class,'sapMSelectList')])[2]/child::li[text()]");
	private By searchInputField=By.xpath(".//input[@placeholder='Search']");
	
	
	public void closeTheCreateBtnPrompt() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtil.click(closeCreatePrompt);
	}
	
	public void clickOncreatButton() {
		ElementUtil.click(createButton);
	}
	public void clickOneditButton() {
		ElementUtil.click(editButton);
	}
	public void clickOnrefreshButton() {
		ElementUtil.click(refreshButton);
	}
	
	////////////////////////////////////////////////////////////
	
	public void clickAddGroupButton() {
		ElementUtil.click(addGoupBtn);
	}
	
	public void enter_GroupName(String txt) {
		ElementUtil.type(enterGroupName,txt);
	}
	
	public boolean isenterGroupNameDisplaying() {
		return ElementUtil.isElementDisplayed(enterGroupName);
	}
	//Search Menu Fields 
	
	public void clickOnAdvancedOption() {
		ElementUtil.click(advancedOption);
	}
	public boolean isAdvancedOptionDisplayed() {
		return ElementUtil.isElementDisplayed(advancedOption);
	}
	
	public void clickOnAllItemsOption() {
		ElementUtil.click(allItemsOption);
	}
	
	public boolean isAllitemsOptionDisplayed() {
		return ElementUtil.isElementDisplayed(allItemsOption);
	}
	
	public void clickOnMyItemsOption() {
		ElementUtil.click(myItemsOption);
	}
	public boolean isMyItemsOptionDisplayed() {
		return ElementUtil.isElementDisplayed(myItemsOption);
	}
	public String getsearchResultText() {
		try {
			return ElementUtil.getTextValue(searchResultText);
		}catch(Exception ex) {
			return "";
		}
		
				
	}
	
	public boolean IsDisplaysearchResultText() {
		return ElementUtil.isElementDisplayed(searchResultText);			
	}
	public void clickOnclearOption() {
		ElementUtil.click(clearOption);
	}
	public boolean isclearOptionDisplaying() {
		return ElementUtil.isElementDisplayed(clearOption);
	}
	
	
	public String getNoMatchErrorMsgText() {
		return ElementUtil.getTextValue(noMatchErrorMsg);
	}
	
	public List<String> getAllCategorysOptions() {
		List<String>lst=new ArrayList<String>();
		List<WebElement>lstEls=DriverFactory.getDriver().findElements(getAllCategorys);
		for(WebElement ele :lstEls) {
			lst.add(ele.getText().trim());
		}
		return lst;
	}
	
	public void enterSearchInputField(String text) {
		ElementUtil.type(searchInputField,text);
	}
	
	public boolean isSearchInputFieldDisplayed() {
		return ElementUtil.isElementDisplayed(searchInputField);
	}
	

	
	
	public boolean isHomePageTextIsDisplaying() {
		ElementUtil.waitForElementVisible(homeScreenHomeText);
		return ElementUtil.isElementDisplayed(homeScreenHomeText);
	}
	public void clickOnProductivity() {
		ElementUtil.click(productivity);
	}
	
	public void clickOnnotification() {
		ElementUtil.click(notification);

	}
	public void clickOnUserMenu() {
		ElementUtil.click(userMenu);

	}
	public void clickOnIDPLogo() {
		ElementUtil.waitForElementVisible(headerLogo);
		ElementUtil.click(headerLogo);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isHeaderDisplaying() {
		return ElementUtil.isElementDisplayed(headerLogo);
	}
	public boolean isSideMenuHomeOptionDisplaying() {
		return ElementUtil.isElementDisplayed(sideMenuHomeOption);
	}
	
	public void clickOnGlobalSearchButton() {
		ElementUtil.click(globalSearchIcon);
	}
	
	public void clickAllCategorySearchFilter() {
		ElementUtil.click(allCategorysFilter);
	}
	
	public boolean isAllCategorySearchFilterDisplayed() {
		return ElementUtil.isElementDisplayed(allCategorysFilter);
	}
	
	public void clickOnSearchmenuCloseButton() {
		ElementUtil.click(searchMenuCloseButton);
	}
	   
}

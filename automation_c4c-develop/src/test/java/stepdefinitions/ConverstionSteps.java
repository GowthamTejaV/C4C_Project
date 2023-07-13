package stepdefinitions;

import com.pages.ConverstionPage;

import io.cucumber.java.en.And;

public class ConverstionSteps {
	ConverstionPage convert = new ConverstionPage();

	@And("Switch to converstion tab")
	public void Switch_to_converstion_tab() throws InterruptedException {
		convert.switchToConversionTab();
	}

	@And("Select the first record from conversion page")
	public void Select_the_first_record_from_conversion_page() throws InterruptedException {
		convert.selectFirstRecord();
	}
}

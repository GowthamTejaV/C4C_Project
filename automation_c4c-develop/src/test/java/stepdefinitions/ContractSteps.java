package stepdefinitions;

import java.io.IOException;

import com.pages.IC_ContractCreationPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ContractSteps {

	@And("Click on the first contract")
	public void Click_on_the_first_contract() throws InterruptedException {
		IC_ContractCreationPage.clickFirstContract();
	}

	@And("Click on the second contract")
	public void Click_on_the_second_contract() throws InterruptedException {
		IC_ContractCreationPage.clickSecondContract();
	}

	@And("Click on opportunity section in contract")
	public void Click_on_opportunity_section_in_contract() throws InterruptedException {

		IC_ContractCreationPage.clickOpportunitiesSection();
	}

	@And("Click on contract details section")
	public void Click_on_contract_details_section() throws InterruptedException {

		IC_ContractCreationPage.clickContractDetailsSection();
	}

	@And("Verify if the contract mapped with the opportunity")
	public void Verify_if_the_contract_mapped_with_the_opportunity() {

		IC_ContractCreationPage.verifyContractOpportunity1();
	}

	@And("Verify if the contract mapped with the opportunity second")
	public void Verify_if_the_contract_mapped_with_the_opportunity_second() throws InterruptedException {

		IC_ContractCreationPage.verifyContractOpportunity2();
	}

	@And("Click global sync EBS option")
	public void Click_global_sync_EBS_option() throws InterruptedException {
		IC_ContractCreationPage.clickSyncEBS();
	}

	@And("Edit the existing contract")
	public void Edit_the_existing_contract() throws InterruptedException, IOException {
		IC_ContractCreationPage.updateContract();
	}

	@And("Click finalise EBS button for contract1")
	public void Click_finalise_EBS_button_for_contract1() throws InterruptedException {
		IC_ContractCreationPage.clickFinalise1();

	}

	@Then("Click payment details tab")
	public void click_payment_details_tab() throws InterruptedException {
		IC_ContractCreationPage.clickPaymentDetailsTab();
	}

	@Then("Click add row in payment details")
	public void click_add_row_in_payment_details() throws InterruptedException {
		IC_ContractCreationPage.clickAddRowPayment();
	}

	@Then("Fill mandatory in payment details")
	public void fill_mandatory_in_payment_details() throws InterruptedException, IOException {
		IC_ContractCreationPage.fillMandatoryPaymentDetails();
	}

	@And("Verify if the contract ID editable")
	public void Verify_if_the_contract_ID_editable() {
		IC_ContractCreationPage.verifyContractIdNotEditable();
	}

	@And("Add multiple payment details")
	public void Add_multiple_payment_details() throws InterruptedException, IOException {
		IC_ContractCreationPage.addMultiplePayments();
	}
}

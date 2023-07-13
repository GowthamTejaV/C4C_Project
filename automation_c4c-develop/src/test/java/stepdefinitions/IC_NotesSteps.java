package stepdefinitions;

import java.awt.AWTException;
import java.io.IOException;

import com.pages.IC_NotesPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class IC_NotesSteps {
	@And("Switch to Notes tab")
	public void Switch_to_Notes_tab() throws InterruptedException {
		IC_NotesPage.switchToNotesTab();
	}

	@And("Verify that Individual Customer note section is displayed and is editable in the Notes tab of an IC")
	public void Verify_that_Individual_Customer_note_section_is_displayed_and_is_editable_in_the_Notes_tab_of_an_IC()
			throws InterruptedException, IOException {
		IC_NotesPage.verifyNotes();
	}

	@And("Verify the edit and delete functionality for IC note")
	public void Verify_the_edit_and_delete_functionality_for_IC_note() throws InterruptedException, IOException {
		IC_NotesPage.verifyEditDeleteNotes();
	}

	@Then("Add paragraph in notes")
	public void add_paragraph_in_notes() throws InterruptedException, IOException, AWTException {
		IC_NotesPage.enterparaNote();
	}

	@Then("Click collapse all button")
	public void click_collapse_all_button() throws InterruptedException {
		IC_NotesPage.clickCollapseAll();
	}

	@Then("Click expand all button")
	public void click_expand_all_button() throws InterruptedException {
		IC_NotesPage.clickExpandAll();
	}

}

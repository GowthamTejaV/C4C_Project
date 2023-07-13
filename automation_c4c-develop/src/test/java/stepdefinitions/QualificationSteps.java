package stepdefinitions;

import java.io.IOException;

import com.pages.CourseSelectionPage;
import com.pages.OP_CourseSelectionPage;
import com.pages.QualificationPage;

import io.cucumber.java.en.And;

public class QualificationSteps {
	QualificationPage qualification = new QualificationPage();

	// use
	@And("Switch to qualification tab")
	public void Switch_to_qualification_tab() throws InterruptedException {
		qualification.switchToQualificationTab();
	}

	// use
	@And("Click edit qualification")
	public void Click_edit_qualification() throws InterruptedException {
		qualification.editQualification();
	}

	// use
	@And("Fill mandatory fields from qualification")
	public void Fill_mandatory_fields_from_qualification() throws InterruptedException, IOException {
		qualification.addQualification();

	}

	@And("Fill english test detail")
	public void Fill_english_test_detail() throws InterruptedException, IOException {
		CourseSelectionPage.englishTest();

	}

	// use
	@And("Fill the english test proficiency")
	public void Fill_the_english_test_proficiency() throws InterruptedException, IOException {
		qualification.editQualification();
		qualification.englishTest();

	}

}

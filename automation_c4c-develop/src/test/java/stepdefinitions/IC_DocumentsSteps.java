package stepdefinitions;

import java.awt.AWTException;
import java.io.IOException;

import com.pages.IC_DocumentsPage;
import com.pages.OP_DocumentsPage;

import io.cucumber.java.en.And;

public class IC_DocumentsSteps {
	
	IC_DocumentsPage doc = new IC_DocumentsPage();
	OP_DocumentsPage docOp = new OP_DocumentsPage();

	@And("Switch to attach document tab")
	public void Switch_to_attach_document_tab() throws InterruptedException {
		doc.switchDocumentsTab();
	}

	@And("Select all the uploaded documents")
	public void Select_all_the_uploaded_documents() {
		docOp.uploadFileFromTheLoaclIC();
	}
	//use
	@And("Switch to document management tab")
	public void Switch_to_document_management_tab() throws InterruptedException {
		doc.switchDocumentsManageTab();
	}
	//use
	@And("Upload required document")
	public void Upload_required_document() throws InterruptedException, AWTException, IOException {
		doc.uploadDocument();
	}
}

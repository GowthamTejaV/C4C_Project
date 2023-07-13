package stepdefinitions;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import com.pages.sendEmail;
import io.cucumber.java.en.Given;

public class EmailSteps {

	@Given("Send an email")
	public void Send_an_email()
			throws AddressException, MessagingException, InterruptedException, IOException, NoSuchAlgorithmException {
		sendEmail.mail();
	}
}

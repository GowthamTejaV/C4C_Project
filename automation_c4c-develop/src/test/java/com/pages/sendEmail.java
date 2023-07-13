package com.pages;

import java.security.NoSuchAlgorithmException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;

public class sendEmail {

	public static String to2 = "AutomationTT" + ElementUtil.generateRandomNumber(4) + "@yopmail.com";

	// use
	public static void saveEmail() {
		ConfigReader.writeToApplicationPropertie("TicketEmail", to2);
	}

	public static void mail() throws NoSuchAlgorithmException {
		// use
		String username = "enquiryautomation@idp.com";
		String password = "KTCpebV2cK7KLmSm1Iae";
		String host = "au-smtp-outbound-1.mimecast.com";
		String port = "587";

		String username2 = "tttrainbala@gmail.com";
		String password2 = "nobfbxqzpyeopbtf";
		String host2 = "smtp.gmail.com";
		String port2 = "587";

		System.out.println("====================   Email Started   ======================");

		// Create object of Property file
		  System.out.println("TLSEmail Start"); 
		Properties props = new Properties();

		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		props.put("mail.smtp.ssl.trust", "*");
		
		//props.put("mail.smtp.starttls.required", "true");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");
		//props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,

				new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication(username2, password2);

					}

				});

		try {

			// Create object of MimeMessage class
			Message message = new MimeMessage(session);

			// Set the from address
			message.setFrom(new InternetAddress(username2));

			// Set the recipient address
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to2));

			// Add the subject link
			message.setSubject("Testing Subject");

			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();

			// Set the body of email
			messageBodyPart1.setText("This is message body");

			// Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

			// Mention the file which you want to send
			String filename = "";

			// Create data source and pass the filename
			DataSource source = new FileDataSource(filename);

			// set the handler
			messageBodyPart2.setDataHandler(new DataHandler(source));

			// set the file
			messageBodyPart2.setFileName(filename);

			// Create object of MimeMultipart class
			Multipart multipart = new MimeMultipart();

			// add body part 1
			multipart.addBodyPart(messageBodyPart2);

			// add body part 2
			multipart.addBodyPart(messageBodyPart1);

			// set the content
			message.setContent(multipart);
//
			// finally send the email
			Transport.send(message);

			System.out.println("====================   Email Sent   ======================");

		} catch (MessagingException e) {

			e.printStackTrace();
			//throw new RuntimeException(e);

		}

	}

}

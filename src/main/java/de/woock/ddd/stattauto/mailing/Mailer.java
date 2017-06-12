package de.woock.ddd.stattauto.mailing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Mailer {

	@Autowired
	private JavaMailSender javaMailService;
	
	public void sendMail(String text) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("Hermann.Woock@Web.de");
		message.setFrom("Trump");
		message.setSubject("Registration");
		message.setText(text);
		javaMailService.send(message);
	}
}

package de.woock.ddd.stattauto.mailing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DddStattAutoServiceMailingApplication {

	@Autowired Mailer mailer;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DddStattAutoServiceMailingApplication.class, args);
		Mailer mailer = ctx.getBean(Mailer.class);
		mailer.sendMail("Hallo Hermie");
	}
}

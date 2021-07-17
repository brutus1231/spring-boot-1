package pl.sda.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.sda.springboot1.service.PersonValidator;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);

		PersonValidator personValidator = context.getBean(PersonValidator.class);

		System.out.println(personValidator.valid());

	}

}

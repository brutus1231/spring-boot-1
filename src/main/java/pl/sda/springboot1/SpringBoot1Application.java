package pl.sda.springboot1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.sda.springboot1.service.PersonValidator;
import pl.sda.springboot1.service.PropertyHandler;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);

		PersonValidator personValidator = context.getBean(PersonValidator.class);

		System.out.println("Hello world !!");
		System.out.println(personValidator.valid());

		PropertyHandler propertyHandler = context.getBean(PropertyHandler.class);
		propertyHandler.print();
	}

}

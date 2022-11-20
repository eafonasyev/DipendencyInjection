package com.eafonasyev.demo;

import com.eafonasyev.demo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.applet.AppletContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		System.out.println("-----------Property");
		PropertyController propertyController = (PropertyController) context.getBean("propertyController");
		System.out.println(propertyController.getGreeting());

		System.out.println("-----------Setter");
		SetterController  setterController = (SetterController) context.getBean("setterController") ;
		System.out.println(setterController.getService().getGreeting());

		System.out.println("-----------constractor");
		ConstractorController  constractorController = (ConstractorController) context.getBean("constractorController");
		constractorController.getGreeting();
		System.out.println(constractorController.getGreeting());


		System.out.println("-----------primary");
		MyController myController1 = (MyController) context.getBean("myController");
		System.out.println(myController1.getGreeting());


		System.out.println("-----------language");
		LanguageController languageController  = (LanguageController) context.getBean("languageController");
		System.out.println(languageController.getGreeting());


	}

}

package com.springpetclinic;

import com.springpetclinic.controller.ResourceController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPetClinicApplication {

	public static void main(String[] args) {

		//we asked the context to get the reference of the bean
		//the spring holds the beanref
		//This makes no Java instantiation object
		/*ApplicationContext cts=SpringApplication.run(SpringPetClinicApplication.class, args);
		ResourceController cont=(ResourceController) cts.getBean("resourceController");
		cont.Test();*/
		SpringApplication.run(SpringPetClinicApplication.class, args);
	}

}


package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import comp.MyComponent;
@SpringBootApplication
@ComponentScan(basePackages= {"comp","dao","service"})
public class SpringDemo1 {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(SpringDemo1.class, args);
		
		MyComponent myc=cac.getBean("mycomp",MyComponent.class);
		myc.comp();
	}

}

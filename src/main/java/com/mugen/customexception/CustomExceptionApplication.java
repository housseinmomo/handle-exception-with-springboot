package com.mugen.customexception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomExceptionApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(CustomExceptionApplication.class, args);

		System.out.println("Hello world");
	}

}

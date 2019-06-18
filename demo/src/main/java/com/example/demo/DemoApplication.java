package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //tells spring boot that this is the starting point of spring boot application.
public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);        //to tell spring boot to start this application and create a servlet container and host that application in this servlet container and make it available.
	}                                                              //static class and method

}

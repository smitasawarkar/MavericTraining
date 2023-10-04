package com.springboot.org;

import org.apache.commons.logging.LogFactory;
import org.apache.juli.logging.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class SpringBootTrainingApplication implements CommandLineRunner
{
	   protected final Log logger= (Log) LogFactory.getLog(getClass());
	   public static void main(String[] args) {

	      SpringApplication.run(SpringBootTrainingApplication.class, args);
	      System.out.println("main is executed...........");
	   }
	   @Override
	   public void run(String... args) throws Exception {
	      System.out.println("run method using CommandLineRunner interface");
	         logger.info("this is info");
	         logger.error("this is error");

	   }
	/*
	 * public static void main(String[] args) { ApplicationContext run =
	 * SpringApplication.run(SpringBootTrainingApplication.class, args);
	 * System.out.println("ApplicationContext : " + run);
	 * 
	 * String[] beanNames = run.getBeanDefinitionNames(); Arrays.sort(beanNames);
	 * for (String beanName : beanNames) { System.out.println(beanName);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @RequestMapping("/") public String getMessage() {
	 * 
	 * return "Hellow Spring Boot Application"; }
	 */
	
	
	
	
	
	
//
//	@Value("${spring.application.name}")
//	private String name;
//
//	public static void main(String[] args) {
//	SpringApplication.run(SpringBootTrainingApplication.class, args);
//	}
//
//	
//	@RequestMapping("/")
//	public String getMessage()
//	{
//	    return "Hellow Spring Boot Application";
//	}
//	
//	@RequestMapping(value = "/appname")
//	public String name() {
//		System.out.println("Name is called");
//		return "Application Name:- "+name;
//	}
	
	
	
	
	
}

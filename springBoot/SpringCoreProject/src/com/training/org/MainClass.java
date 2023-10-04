package com.training.org;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class MainClass {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1=(Employee) context.getBean("employeeBean");
		System.out.println(e1);
		
//		Resource r=new ClassPathResource("applicationContext.xml");
//		BeanFactory factory=new XmlBeanFactory(r);
//		
//		Employee e1=(Employee) factory.getBean("employeeBean");
	}

}

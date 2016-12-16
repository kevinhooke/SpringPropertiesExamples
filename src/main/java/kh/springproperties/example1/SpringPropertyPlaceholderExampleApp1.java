package kh.springproperties.example1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kh.springproperties.example1.beans.ExampleBean1;

/**
 * Simple example using XML configuration and a PropertyPlaceholderConfigurer
 * to inject properties into beans using @Value and SpEL.
 * 
 * @author kevinhooke
 *
 */
public class SpringPropertyPlaceholderExampleApp1 {

	public static void main(String[] args){
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("application-context-propertyplaceholder1.xml");
		
		// example1: using xml config
		ExampleBean1 bean = (ExampleBean1)ctx.getBean("exampleBean1");
		System.out.println("example1 using PropertyPlaceholderConfigurer and wiring via xml: " + bean.getProperty1());
		System.out.println("example1 using PropertyPlaceholderConfigurer and wiring via xml" + bean.getProperty2());
	}
	
}

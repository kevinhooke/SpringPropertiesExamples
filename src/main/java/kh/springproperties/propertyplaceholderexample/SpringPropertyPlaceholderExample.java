package kh.springproperties.propertyplaceholderexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Simple example using a property placeholder to inject properties into
 * a bean using @Value and SpEL.
 * 
 * @author kevinhooke
 *
 */
public class SpringPropertyPlaceholderExample {

	public static void main(String[] args){
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("application-context-propertyplaceholder.xml");
		
		// example1: using component-scan
		ExampleBean bean = (ExampleBean)ctx.getBean("exampleBean");
		System.out.println("example1: " + bean.getProperty1());
		System.out.println("example2: " + bean.getProperty2());
		
		// example2: using explicit xml bean definition
		ExampleBean2 bean2 = (ExampleBean2)ctx.getBean("exampleBean2");
		System.out.println("example2: " + bean.getProperty1());

		// example3: using util:prperties and SpEL
		ExampleBean3 bean3 = (ExampleBean3)ctx.getBean("exampleBean3");
		System.out.println("example3: " + bean3.getProperty3());
	
		
		
	}
	
	
}

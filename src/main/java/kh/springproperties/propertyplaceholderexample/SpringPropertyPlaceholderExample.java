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
		
		ExampleBean bean = (ExampleBean)ctx.getBean("exampleBean");
		System.out.println(bean.getProperty1());
		System.out.println(bean.getProperty2());
		
	}
	
	
}

package kh.springproperties.example2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kh.springproperties.example2.beans.ExampleBean2;

/**
 * Simple example using XML configuration and context:property-placeholder
 * to inject properties into beans using @Value.
 * 
 * @author kevinhooke
 *
 */
public class SpringPropertyPlaceholderExampleApp2 {

	public static void main(String[] args){
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("application-context-propertyplaceholder2.xml");
		
		// example2: using xml config, context:property-placeholder
		ExampleBean2 bean = (ExampleBean2)ctx.getBean("exampleBean2");
		System.out.println("example1 using context:property-placeholder and @Value: " + bean.getProperty1());
		System.out.println("example1 using context:property-placeholder and @Value: " + bean.getProperty2());
	}
	
	
}

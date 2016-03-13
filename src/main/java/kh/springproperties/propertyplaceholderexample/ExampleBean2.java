package kh.springproperties.propertyplaceholderexample;

import org.springframework.stereotype.Component;

@Component
public class ExampleBean2 {

	private String property1;
	
	public String getProperty1() {
		return property1;
	}
	public void setProperty1(String property1) {
		this.property1 = property1;
	}
	
}

package kh.springproperties.propertyplaceholderexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean3 {

	/**
	 * property value injected from util:properties referenced using SpEL
	 */
	@Value("#{example3['property3']}")
	private String property3;
	
	public String getProperty3() {
		return property3;
	}
	public void setProperty3(String property3) {
		this.property3 = property3;
	}
	
}

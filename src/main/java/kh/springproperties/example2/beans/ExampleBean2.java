package kh.springproperties.example2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean2 {

	@Value("${example2a}")
	private String property1;
	
	@Value("${example2b}")
	private String property2;
	
	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public String getProperty2() {
		return property2;
	}
	
	public void setProperty2(String property2) {
		this.property2 = property2;
	}
	
}

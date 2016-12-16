package kh.springproperties.example3;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import kh.springproperties.example3.beans.ExampleBean3;

/**
 * Example Spring Boot app using Java config, with @Value and SpEL to inject
 * system properties, env variables and properties from a PropertySource.
 * 
 * @author kevinhooke
 *
 */
@EnableAutoConfiguration
@Component
@ComponentScan
@PropertySource(value = "classpath:example3.properties")
public class SpringBootPropertiesExampleApp1 {

	@Autowired
	private ExampleBean3 bean3;
	
	/**
	 * Example @Value to inject system property, -Dexample1
	 */
	@Value("#{systemProperties['example1']}")
	private String systemExample1;
	
	/**
	 * Example @Value to inject system property with a default value if property is null
	 */
	@Value("#{systemProperties['example2'] ?: 'default-value'}")
	private String systemExample2;
	
	/**
	 * Example @Value to inject an environment variable value
	 */
	@Value("#{environment['java.version']}")
	private String envExample1;
	
	public static void main(String[] args){
		SpringApplication.run(SpringBootPropertiesExampleApp1.class, args);
	}
	
	@PostConstruct
	public void afterInjectionComplete(){
		System.out.println("Spring Boot example3: java config, @PropertySource, and properties injected with @Value: "
				+ bean3.getProperty3());
		
		System.out.println("Example @Value to inject system properties: " + systemExample1);
		
		System.out.println("Example @Value to inject system properties, with default: " + systemExample2);
		
		System.out.println("Example @Value to inject environemnt variable: " + envExample1);
		
	}
	
}

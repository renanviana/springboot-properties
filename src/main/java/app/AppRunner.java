package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import config.PropertiesConfig;

@Component
public class AppRunner implements CommandLineRunner {
	
	@Autowired
	PropertiesConfig prop;
	
	public void run(String... args) {
		
		System.out.println(prop.toString());
		
	}
	
}
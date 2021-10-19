package CongifReader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigPropReader {

	//properties reference at class level
	private Properties prop;      
	private FileInputStream ip;
	
	//created the method  to read the properties file
	public Properties initLangProp(String language) {
		
	System.out.println("lang is :" + language);
	prop = new Properties();
	
	try {
	switch (language.toLowerCase()) {
	case "english":
		ip = new FileInputStream("./MySeleniumProject/src/main/resources/lang.eng.properties");
		break;
	case "french":
		ip = new FileInputStream("/MySeleniumProject/src/main/resources/lang.french.properties");
		break;
	case "russian":
		ip = new FileInputStream("./MySeleniumProject/src/main/resources/lang.russian.properties");
		break;

	default:
		System.out.println("language is not found:" + language);
		break;
	}
	prop.load(ip);
	}
	catch(Exception e) {
	
	}
	return prop;
	}
}

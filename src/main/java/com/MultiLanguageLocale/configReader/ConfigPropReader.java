package com.MultiLanguageLocale.configReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropReader {

	private Properties prop;
	private FileInputStream ip=null;

	public Properties initLangProp(String language) {
		System.out.println("lang is : " + language);

		prop = new Properties();

		try {
			switch (language.toLowerCase()) {
			case "english":
				ip = new FileInputStream(
						".\\src\\main\\resources\\lang.eng.properties");
				break;

			case "french":
				ip = new FileInputStream(
						".\\src\\main\\resources\\lang.french.properties");
				break;
			case "russian":
				ip = new FileInputStream(
						".\\src\\main\\resources\\lang.russian.properties");
				break;

			default:
				System.out.println("lang not found..." + language);
				break;
				
			}
			prop.load(ip);
		} catch (Exception e) {

		}
		return prop;
	}
	
	
}

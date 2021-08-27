package com.MultiLanguageLocale.testBase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.MultiLanguageLocale.configReader.ConfigPropReader;
import com.MultiLanguageLocale.factory.DriverFactory;
import com.MultiLanguageLocale.pages.HomePage;

public class BaseTest {
	
	protected DriverFactory df;
	protected ConfigPropReader cp;
	protected Properties prop;
	protected WebDriver driver;
	protected HomePage homePage;
	
	@BeforeTest
	public void setUp() {
		cp = new ConfigPropReader();
		prop = cp.initLangProp("english");
		df = new DriverFactory();
		driver = df.initDriver("chrome", prop);
		homePage = new HomePage(driver);
		
	}

	
	@AfterTest
	public void tearDown() {
      driver.quit();
	}
}

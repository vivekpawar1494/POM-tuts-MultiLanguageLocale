package com.MultiLanguageLocale.mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.MultiLanguageLocale.testBase.BaseTest;



public class HomePageTest extends BaseTest{
	
	@Test
	public void headerTest() {
		Assert.assertTrue(homePage.isHeaderExist(prop.getProperty("header")));
	}
	
	@Test
	public void contactFooterTest() {
		Assert.assertTrue(homePage.isContactExist(prop.getProperty("contact")));
	}
	

}
	
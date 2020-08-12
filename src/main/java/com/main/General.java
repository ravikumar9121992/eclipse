package com.main;

import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global{
	public  void openbrowser() throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse-workspace\\Selenium-project\\Browser-driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("ffb.com");
		
	} 

}

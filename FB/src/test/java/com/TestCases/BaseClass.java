package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Utility.ReadConfig;




public class BaseClass {
	WebDriver driver;
	ReadConfig read= new ReadConfig();
	public String baseURL=read.getUrl();
	public String key=read.getKey();
	public String value=read.getValue();
	public String username=read.getUsername();
	public String password=read.getPassword();
	
	@BeforeClass
	public void before() {
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
	}
	@AfterClass
	public void after() {
		driver.close();
	}
	

}

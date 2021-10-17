package com.TestCases;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.PageObject.FbLogin;

public class TC_1FbLoginFunction extends BaseClass{
	
	@Test
	public void tc_1() throws InterruptedException, AWTException {
		
		FbLogin fb=new FbLogin(driver);
		fb.setUsername(username);
		fb.setPassword(password);
		fb.setLogin();
		Thread.sleep(10000);
		fb.al();
		Thread.sleep(10000);
		//fb.scroll();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		fb.setlogbtn();
		Thread.sleep(10000);
		fb.logout();
		Thread.sleep(10000);

		
		
	}

}

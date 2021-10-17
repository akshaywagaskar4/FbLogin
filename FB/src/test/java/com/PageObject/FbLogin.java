package com.PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement username1;
	
	@FindBy(xpath="//input[@name=\"pass\"]")
	private WebElement password;
	
	@FindBy(xpath="//button[@name=\"login\"]")
	private WebElement loginbtn;
	
	@FindBy(xpath="//div[@aria-label=\"Account\"]")
	private WebElement logbtn;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logout;
	
	public FbLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setUsername(String user) {
		username1.sendKeys(user);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void setLogin() {
		loginbtn.click();
	}
	public void al() throws AWTException, InterruptedException {
		Robot r = new Robot();
		r.mouseMove(300, 500);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
	}
	
	public void scroll() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		//js.executeAsyncScript("scroll, (0,-500)");
		
	}
	
	public void setlogbtn() {
		logbtn.click();
	}
	public void logout() {
		logout.click();
	}

}

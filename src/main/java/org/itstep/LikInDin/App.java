package org.itstep.LikInDin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.annotations.VisibleForTesting;

import junit.framework.Assert;

/**
 * Hello world!
 *
 */
public class App {
 
	
	
public WebDriver driver;
@Before

public void setings () {
	System.setProperty("webdriver.chrome.driver", "C:\\TESTS\\WEB DRIVERS\\chromedriver.exe");
	driver = new ChromeDriver();
	
	
	
}


@Ignore@Test 

    public  void testLinkRegistration(  ) {
	driver.get("https://www.linkedin.com/start/join");
	//WebElement regP1 = driver.findElement(By.id("main-container"));
	
	//String regPage1 = regPage.getText();
	// System.out.println( regPage1);
	 
	// WebElement regPage11 = regP1.findElement(By.xpath("//*[@id=\"regForm\"]/h3"));
	// String regP = regPage11.getText();
	// System.out.println( regP);
	 
	//assertEquals("Зарегистрируйтесь – это бесплатно!",  regP);
       
	
	// Name
	
	WebElement name = driver.findElement(By.id("first-name"));
	name.sendKeys("Мишиа");
	
	
	
	// Lastname
	
	WebElement lastname = driver.findElement(By.id("last-name"));
	lastname.sendKeys("Лысенкo");
	
	//email
	
	WebElement email = driver.findElement(By.id("join-email"));
	email.sendKeys("tester14881488@gmail.com");
	
	//session_password
	
	WebElement password = driver.findElement(By.id("join-password"));
	password.sendKeys("K222obzar222");
	
	
	//submit
	
	WebElement sub = driver.findElement(By.id("submit-join-form-text"));
	sub.click();
	
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	 driver.switchTo().frame("noCaptchaIframe");
	
	WebElement proteckt = driver.findElement(By.xpath("//*[@id=\"nocaptcha\"]/div/div/iframe"));
	
	proteckt.click();
	
	
    }

 @Test 

public  void  negatNameivTestLinkRegistration(  ) {
driver.get("https://www.linkedin.com/start/join");



// Name

WebElement name = driver.findElement(By.id("first-name"));
name.sendKeys("");



// Lastname

WebElement lastname = driver.findElement(By.id("last-name"));
lastname.sendKeys("Лысенкo");

//email

WebElement email = driver.findElement(By.id("join-email"));
email.sendKeys("tester14881488@gmail.com");

//session_password

WebElement password = driver.findElement(By.id("join-password"));
password.sendKeys("K222obzar222");


//submit

WebElement sub = driver.findElement(By.id("submit-join-form-text"));
sub.click();


// check
//WebElement chek = driver.findElement(By.xpath(""))


}


@After

public void Out() {
	//driver.close();
}
}

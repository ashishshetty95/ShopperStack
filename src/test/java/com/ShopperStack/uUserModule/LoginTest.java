package com.ShopperStack.uUserModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	public WebDriver driver;
	@Test(priority = 1)
	public void testLogin() {
		//String browser=System.getProperty("BROWSER");
		//if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		//}
		/*else if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}*/
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("ashishshetty95@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		System.out.println(driver.getTitle());
		
	}
	
	@Test(priority = 2)
	public void addToCart() {
		driver.findElement(By.id("men")).click();
		driver.findElement(By.xpath("//div[@class='cat_box__FUszw']/descendant::button[.='add to cart'][1]")).click();
	}
	
	@Test(priority = 3)
	public void logout() {
		driver.findElement(By.xpath("//div[text()='A']")).click();
		driver.findElement(By.xpath("//li[.='Logout']")).click();
		driver.quit();
	}
}

package com.learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("New Man");
		driver.findElement(By.xpath("//input[@id='pass' and @name='pass']")).sendKeys("New Man1");

		// driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		driver.close();

	}

}

package com.qa.bank.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium1\\tools\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://usdemo.vee24.com/#/");
		driver.findElement(By.id("mat-input-0")).sendKeys("test@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("abc123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//span[text()='LogOut']")).click();

	}

}

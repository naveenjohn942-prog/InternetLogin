package com.example.login_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;

@SpringBootApplication
public class LoginAutoApplication {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("http://192.168.100.100:8090/");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
			username.sendKeys("2347133");
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("12978059");
			WebElement submitButton = driver.findElement(By.id("loginbutton"));
			submitButton.click();


		} finally{


		}
	}

}

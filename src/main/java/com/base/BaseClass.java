package com.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class BaseClass 
{
	public static WebDriver driver;

	public static void browserLaunch(String browserName) {
		
		

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();

				
			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void urlGo(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clicks(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendKeyss(WebElement ele, String value) {
		try {
			ele.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

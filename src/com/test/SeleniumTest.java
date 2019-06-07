package com.test;

//package com.test.WebAutomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class SeleniumTest 
{
    public static void Test1(  )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize(); 	
		String title = driver.getTitle();
		System.out.println("Title = " + title);
		
		
		/*
		<dependency>
	    <groupId>org.seleniumhq.selenium</groupId>
	    <artifactId>selenium-java</artifactId>
	    <version>3.141.59</version>
	  </dependency>
	  */
	
    }
}

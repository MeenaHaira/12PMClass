package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Apple\\eclipse-workspace\\1PM_Batch\\driver\\chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
		
	    driver.get("https://www.facebook.com/");
	    
	    
	    
	    
	 
	
	}

}

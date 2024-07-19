package com.qa.setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {

	public static WebDriver driver;
	public static String browser;
	public static String url;
	public Properties prop;
	FileInputStream fis;
	
	
	public SetUp()
	{
		File file = new File("./configFile.properties");
		try {
			fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browser=prop.getProperty("browser");
		url=prop.getProperty("url");
		
		
	}
	public static void initlization()
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
	   //.... other browsers
		
		else
		{
			System.out.println("Browser not found");
		}
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//p[normalize-space(text())='Catalog']")).click();
	}
}

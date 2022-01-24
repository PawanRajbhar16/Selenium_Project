package selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set property 
		System.setProperty("webdriver.chrome.driver","D://selenium-server-4.1.0 (1)/chromedriver.exe");
		//WebDriver is interface 
		WebDriver driver=new ChromeDriver();
		
		//land on ultratech website
		driver.get("https://www.ultratechcement.com/");
		
		//check the title of current of page
		System.out.println(driver.getTitle());
		
		//maximize the window 
		driver.manage().window().maximize();
		
		//get the current page url
		System.out.println(driver.getCurrentUrl());
		//different between close() method and quit() method
		//close method close the current page where as quit method close all pages
		
		driver.close();
		
	}

}

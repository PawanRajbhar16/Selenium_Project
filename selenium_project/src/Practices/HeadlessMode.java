package Practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessMode {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium-server-4.1.0 (1)\\drivers\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		
	System.out.println(	driver.getTitle());
		//create screen class
		//org.sikuli.script.Screen s=new org.sikuli.script.Screen();
		
		//Screen s=new Screen();
		 //pattern class
		 
		// Pattern p=new Pattern("signin.png");
		// s.wait(p,2000);
		 
		// s.click();
		 
		
	
	}

}

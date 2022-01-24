package Practices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootsrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","D://selenium-server-4.1.0 (1)/chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20,);
		driver.get("https://accounts.google.com/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'KKjvXb')]")).click();
		Thread.sleep(2000);
		List<WebElement> countryname=driver.findElements(By.xpath("//div[@class='OA0qNb ncFHed']//div//span"));
		
		System.out.println(countryname.size());
		
		for(int i=0; i< countryname.size();i++) {
			
			String co=countryname.get(i).getText();
			System.out.println(co);
			//String name=countryname.get(i).getText().split("?")[1];
		
			
		}
		
		driver.close();
	}

}

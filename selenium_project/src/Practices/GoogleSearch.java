package Practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.switchTo().frame("//iframe[@id='backgroundImage']");
		driver.findElement(By.xpath("//form[@role='search']/div/div/div/div/div[2]/input")).sendKeys("testing");
		
	List<WebElement>	list=driver.findElements(By.xpath("//ul[class='bw4e9b']//li/descendant::div[@class='wM6W7d']"));
	
	System.out.println(list.size());

	}

}

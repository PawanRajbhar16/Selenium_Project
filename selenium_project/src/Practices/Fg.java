package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Fg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://general.futuregenerali.in/branch-locator");
		driver.findElement(By.id("notAllowLocation")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("stateDropdown1SelectBoxItText")).click();
		WebElement drop=driver.findElement(By.xpath("//ul[@id='stateDropdown1SelectBoxItOptions']/li[2]"));
		
		//Select st=new Select(drop);
		drop.click();
		
		//select[@id='stateDropdown1']/option
		
		Actions action=new Actions(driver);

	}
	
	
}

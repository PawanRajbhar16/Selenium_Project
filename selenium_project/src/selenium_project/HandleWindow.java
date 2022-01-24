package selenium_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		HandleWindow multipleWindow=new HandleWindow();
		multipleWindow.Assigenment(driver);
		
			}
	
	public void handlewindow(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		driver.findElement(By.xpath("//body/a")).click();
	Set<String>	windows=driver.getWindowHandles();//get [parent,child window]
	
	Iterator<String>it=windows.iterator();
	String parentId=it.next();
	String childId=it.next();
	
	driver.switchTo().window(childId);
	System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
String email=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];

driver.switchTo().window(parentId);
driver.findElement(By.id("username")).sendKeys(email);




		
	}

	public void Assigenment(WebDriver driver) {
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		 Iterator<String> it=windows.iterator();
		 String parentId=it.next();
		 String childId=it.next();
		 
		 driver.switchTo().window(childId);
		 String child=driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		 System.out.println(child);
		 
		 driver.switchTo().window(parentId);
		String parent= driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText();
		System.out.println(parent);
		 
	}
}

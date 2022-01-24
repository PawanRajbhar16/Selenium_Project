package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;


public class Locator_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D://selenium-server-4.1.0 (1)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		String pass=getpassword(driver);
		
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
	
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@id='root']/div/div/div/p")).getText());
		String message=driver.findElement(By.xpath("//div[@id='root']/div/div/div/p")).getText();
		Assert.assertEquals(message,"You are successfully logged in.");
		
		
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String message=driver.findElement(By.xpath("//div[@id='container']/div/form/p")).getText();
		System.out.println(message);
		// Please use temporary password 'rahulshettyacademy' to Login.

		String[] passwordArray=message.split("'");
		
		//0-index Please use temporary password 
		//1-index rahulshettyacademy' to Login
		//->
		String passowrd=passwordArray[1].split("'")[0];
		
	
		
		return passowrd;
			
		
		
		
	}

}
	
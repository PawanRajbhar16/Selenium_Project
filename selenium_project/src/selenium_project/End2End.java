package selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		End2End cleartrip=new End2End();
			//cleartrip.oneWay(driver);
			cleartrip.getpassenger(driver);
		
		
	}

	public void oneWay(WebDriver driver) throws InterruptedException {
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col flex flex-middle']/div[1]/div/div/div/input")).sendKeys("Mum");
		
		List<WebElement> from=driver.findElements(By.xpath("//div[@class='bg-white br-4 elevation-5 p-1 p-absolute mt-1 z-50 l-0']/ul/li/p"));
		
		
//		for(int i=0;i<from.size();i++) {
//			
//		//String citi=from.get(i).getText();
//		
//		if(from.get(i).getText().contains("Mumbai")){
//			//Thread.sleep(2000);
//			
//			from.get(i).click();
//		}
//			
//		}
		
		
		for(WebElement fromCity:from) {
				
				String cityName=fromCity.getText();
				
				System.out.println(cityName);
				if(fromCity.getText().equalsIgnoreCase("Mumbai, IN - Chatrapati Shivaji Airport (BOM)")) {
					Thread.sleep(2000);
					fromCity.click();
				}
				
			}
	
		
		
		
	}
	
	public void getpassenger(WebDriver driver) throws InterruptedException {
		driver.get("https://www.cleartrip.com/");
		WebElement adultpassenger=driver.findElement(By.xpath("//div[@class='mb-4']/select"));
	Select adult=new Select(adultpassenger);	
	adult.selectByIndex(4);
	
	WebElement child=driver.findElement(By.xpath("//div[@class='row pt-3 pb-4 p-relative px-4']/div/div[3]/select"));
	Select childern=new Select(child);
	childern.selectByValue("2");
	
	WebElement infantsPassenger=driver.findElement(By.xpath("//div[@class='row pt-3 pb-4 p-relative px-4']/div/div[5]/select"));
	Select infants=new Select(infantsPassenger);
	
	infants.selectByVisibleText("1");
	
	End2End Calender=new End2End();
	
	Calender.getCalender(driver);
	
	}
	
	public void getCalender(WebDriver driver) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day--today')]")).click();
		
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		Thread.sleep(2000);
		
		String waring=driver.findElement(By.xpath("//div[@class='col-24']/div/span")).getText();
		
		System.out.println(waring);
		
		driver.findElement(By.xpath("//div[@class='col-24']/div/div")).click();
		
	
		
		
	}
}

package Practices;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import selenium_project.dropdown;

public class Hdfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stg1-website.hdfclife.tech/");
		
		driver.findElement(By.xpath("//div[@class='viewall']/a")).click();
	WebElement plandriver=driver.findElement(By.xpath("//div[@id='carouselExampleIndicators']/div[4]/div/div[1]"));
	
	
int plancount=plandriver.findElements(By.xpath("//div[contains(@class,'swiper-slide')]/a")).size();

for(int i=0; i< plancount;i++) {
	String planName=plandriver.findElements(By.xpath("//div[contains(@class,'swiper-slide')]/a")).get(i).getText();
	
	System.out.print(planName);

	if(!driver.findElement(By.xpath("//div[@class='swiper-button-next swiper-button-disabled']")).isEnabled()) {
		driver.findElement(By.xpath("//div[@class='swiper-button-next']/img")).click();
		
	}else {
		Assert.assertTrue(true);
	}
	
}

	}

}

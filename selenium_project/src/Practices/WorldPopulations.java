package Practices;

import java.util.List;

import javax.swing.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldPopulations {
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		String xpath_today=("//div[text()='Today']//parent::div//span[@class='rts-counter']");
		String xpath_world_pop="//div[@class='maincounter-number']/span";
		String xpath_today_text="//div[text()='Today']//parent::div//div[@class='sec-text']";
		//String id_world_pop="maincounter-wrap";
		//today_pop(xpath_today);
		pop_data(xpath_today);	
		System.out.println("----------------Total Populations------------");
		//currentpop(xpath_world_pop);
		System.out.println("----------------Today Populations-------------");
		//currentpop(xpath_today);
			

	}
	public static void currentpop(String locator,String locator_2) throws InterruptedException {
		
		List<WebElement>PopulationList=driver.findElements(By.xpath(locator));
		int count=1;
		while(count <=20) {
			System.out.println(count +"sec");
					
		for(WebElement populations :  PopulationList) {
			System.out.println(driver.findElement(By.xpath("//div[@id='maincounter-wrap']/h1")).getText());

			System.out.println(populations.getText());

		}
		System.out.println("======================================================");
		Thread.sleep(2000);
		count++;
		
		}

		
	}
	
	public static void today_pop(String locator) {
		
		List<WebElement>Today_pop=driver.findElements(By.xpath(locator));
		List<WebElement>birth=driver.findElements(By.xpath("//div[text()='Today']//parent::div//div[@class='sec-text']"));
		 int count=1;
		for(WebElement today : Today_pop) {
			 while(count <4) {
			 for(WebElement bt : birth) {
				 System.out.println(bt.getText() + today.getText());
				 count++;

			 }
			// System.out.println(today.getText()+ driver.findElement(By.xpath("//div[text()='Today']//parent::div//div[@class='sec-text']")).getText());;
		 }
			 break;

		 }
		
}
	public static void pop_data(String locator) {
		int count=1;
		List<WebElement>Today_pop=driver.findElements(By.xpath(locator));
		List<WebElement>birth=driver.findElements(By.xpath("//div[text()='Today']//parent::div//div[@class='sec-text']"));
		while( count< 10) {
		for(int i=0 ;i < Today_pop.size();i++) {
			String data=birth.get(i).getText()+" " +Today_pop.get(i).getText();
			
			System.out.println(data);
			
			
			
		}
		System.out.println("=====================================");

		count ++;
		
	}}
	

}
	

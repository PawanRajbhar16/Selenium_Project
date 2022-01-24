package selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new HtmlUnitDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}

package selenium_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class interactWithConfigFile {	
static	WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties pro=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Pawan.Rajbhar\\eclipse-workspace\\selenium_project\\src\\selenium_project\\config.properties");
		pro.load(file);
		
		String BrowserName=pro.getProperty("browser");
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		 else if (BrowserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D://selenium-server-4.1.0 (1)/firefox/geckodriver.exe");
			driver=new FirefoxDriver();

		}
		
String url=pro.getProperty("URL");
System.out.println(url);
driver.get(url);
driver.findElement(By.id(pro.getProperty("first_name_id"))).sendKeys(pro.getProperty("first_name"));
driver.findElement(By.id(pro.getProperty("last_name_id"))).sendKeys(pro.getProperty("last_name"));
driver.findElement(By.id(pro.getProperty("emai_id"))).sendKeys(pro.getProperty("email"));

		
		
		
	
		
	}

}

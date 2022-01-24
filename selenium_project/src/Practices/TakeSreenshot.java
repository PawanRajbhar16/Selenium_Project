package Practices;

import java.awt.desktop.OpenFilesHandler;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_project.CountLink;
import www.mys.com.utils.FileUtils;
public class TakeSreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ultratechcement.com/");
		countlink(driver);
		//convert webdriver object to takescreenshot
		TakesScreenshot src=((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		//File srcFile=src.getScreenshotAs(OutputType.FILE);
		//Move image file to destination
		File location=new File("C:\\Users\\Pawan.Rajbhar\\eclipse-workspace\\selenium_project\\src\\Practices\\google.jpg");
	//Copy file at destination
		//FileUtils.copy(srcFile,location);
       // org.openqa.selenium.io.FileHandler.copy(srcFile, location);
		
		
//		getScreenshotAs(OutputType.FILE);
//		FilesUtils.copyFile(src,new File("C:\\Users\\Pawan.Rajbhar\\eclipse-workspace\\selenium_project\\src\\Practices\\google.png"));
//		
		
		

	}
	
	public static void countlink(WebDriver driver) {
	
	List<WebElement>link=driver.findElements(By.tagName("a"));
	
	int totalCount=link.size();
	System.out.println(totalCount);
	ArrayList<WebElement> arrayList=new ArrayList<WebElement>();
	
	for(int i=0; i<totalCount;i++) {
		
		if(link.get(i).getAttribute("href")==null){
			
			arrayList.add(link.get(i));
			
		}
		
	}
	
	System.out.println(arrayList.size());
	
	for(int j=0; j<arrayList.size();j++) {
		
		String activeLink=arrayList.get(j).getAttribute("href");
		System.out.println(activeLink);
	}
		
		
		
	}

}

package selenium_project;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EnquireNow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.ultratechcement.com/");
			driver.manage().window().maximize();
		     driver.findElement(By.xpath("//div[@class=\"modal-content\"]")).click();

			driver.findElement(By.linkText("ENQUIRE NOW")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

			driver.findElement(By.xpath("//form[@class='form-query']/div[8]/div/input")).click();
			
			List<WebElement> error= driver.findElements(By.xpath("//span[@class='error']"));
			
			for(int i=0; i<error.size();i++) {
					String message=error.get(i).getText();
					System.out.println(message);
			}

			
			//wait 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			driver.findElement(By.id("fullname")).sendKeys("pawaj dsad");
			driver.findElement(By.id("mobile-no")).sendKeys("1234567890");
			driver.findElement(By.id("pin-code")).sendKeys("123123");
			WebElement querydropdown=driver.findElement(By.id("query"));
			Select dropdown=new Select(querydropdown);
				dropdown.selectByIndex(1);
				
				WebElement pruductDropdown=driver.findElement(By.id("product"));
			Select	dropdown_2=new Select(pruductDropdown);
			dropdown_2.selectByIndex(1);
			//driver.findElement(By.id("//select[@id='query']/option[2]")).;
			//driver.findElement(By.id("//select[@id='product']/option[1]")).click();
			driver.findElement(By.id("checkboxes-sub")).click();

			Thread.sleep(2000);
			String submit=driver.findElement(By.cssSelector("input[class='btn submit-que']")).getText();
			System.out.println(submit);

			driver.findElement(By.xpath("//form[@class='form-query']/div[8]/div/input")).click();
			String submitting=driver.findElement(By.xpath("//div/input[@class='btn submit-que']")).getCssValue(submit);

			//String submitting=driver.findElement(By.xpath("//form[@class='form-query']/div[8]/div/input")).getText();
			System.out.println(submitting);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			String token_id=driver.findElement(By.xpath("//div[@class='col-md-12 deskEnForm']/p")).getText();
			System.out.println(token_id);
			
			
			
			
		
			
	}

}

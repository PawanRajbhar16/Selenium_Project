package selenium_project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");

//		ChromeOptions options=new ChromeOptions();
//		
//		options.addArguments("--disable-notifications");
//	WebDriver driver=new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.spicejet.com/");
//		

		dropdown dynamic = new dropdown();
		dynamic.google(driver);
		// dynamic.checkboc(driver);
		// dynamic.asianpain(driver);
		// dynamic.google(driver);
		// dynamic.autosuggest(driver);

		// dynamic.staticdropdown(driver);

		// dynamic.passanger(driver);

		// driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		Thread.sleep(3000);

		driver.close();

	}

	public void staticdropdown(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='ATQ']")).click();
		Thread.sleep(2000);
		// xpath by using parent child relationship
		// //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOP']
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();

	}

	public void passanger(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		int i = 1;
		while (i < 4) {
			driver.findElement(By.id("hrefIncAdt")).click();
			String count = driver.findElement(By.id("spanAudlt")).getText();
			System.out.println(count);
			i++;

		}

		for (int j = 4; j > 1; j--) {

			driver.findElement(By.id("hrefDecAdt")).click();

		}

		String passaneger = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(passaneger);
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		// static dropdown
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(2);

		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.close();

	}

	public void autosuggest(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("austr");
		Thread.sleep(2000);
		// get all webelement
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

		// iterate each element by using loop

		for (WebElement option : options) {

			String op = option.getText();
			System.out.println(op);
			if (option.getText().equalsIgnoreCase("Austria")) {
				System.out.println(option.getText());

				Thread.sleep(2000);
				option.click();
				break;
			}

		}

		// driver.close();

	}

	public void google(WebDriver driver) {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//form[@role='search']/div/div/div/div/div[2]/input")).sendKeys("hello");

		List<WebElement> searchs = driver.findElements(By.xpath("//li[@class='sbct']/div/div[2]/div[1]/span"));

		// List<WebElement>
		// searchs=driver.findElements(By.xpath("//li[@class='sbct']/div/div[2]/div[1]/span"));

		for (WebElement search : searchs) {

			if (search.getText().equalsIgnoreCase("hello world")) {
				System.out.println(search.getText());
				search.click();
			}

		}

	}

	// xpath //a[@class='result-item']/div[1]/span
	public void spicejet(WebDriver driver) throws InterruptedException {
		driver.get("https://www.spicejet.com/");

	}

	public void checkboc(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

		List<WebElement> checklist = driver.findElements(By.cssSelector("input[type='checkbox']"));

		System.out.println(checklist.size());

		Assert.assertEquals(checklist.size(), 3);

	}

	public void date(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date1")).isSelected());
//		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
//		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date1")).isSelected());
//		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

			System.out.println("its enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("its disabled");
			Assert.assertTrue(false);
		}

	}

}

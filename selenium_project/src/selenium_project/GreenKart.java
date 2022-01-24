package selenium_project;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GreenKart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] vegitable_item = { "Cucumber", "Brocolli", "Cauliflower", "Beans", "Mushroom", "Potato" };
		
		GreenKart onlinevigges=new GreenKart();
		onlinevigges.addItem(driver, vegitable_item);
		onlinevigges.Card(driver);

		
	}
	

	public  void addItem(WebDriver driver, String[] vegitable_item) throws InterruptedException {
		int j = 0;

		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < product.size(); i++) {
			// System.out.println(product.get(i).getText());
			String[] getProduct = product.get(i).getText().split("-");

			String formattedProduct = getProduct[0].trim();
			// formatte to get actual name instead of Cucumber -1 Kg text we trim it get
			// only Cucumber

			// System.out.println(pro);
			// convert array into array list for easy search or beacuse array list support
			// methods contains()

			List itemList = Arrays.asList(vegitable_item);
			// check whether you exracted item present in array list or not

			if (itemList.contains(formattedProduct)) {
				// click on add to cart button
				j++;
				// i used button xpath by using button text at that time i am getting error
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemList.size()) {
					break;
				}
			}

		}
		
		

	}
	
	public void Card(WebDriver driver) {
		
		driver.findElement(By.xpath("//div[@class='cart']/a[4]/img")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div[2]/button")).click();

		driver.findElement(By.xpath("//div[@class='promoWrapper']/input")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//div[@class='promoWrapper']/button")).click();
		String promocode=driver.findElement(By.xpath("//div[@class='promoWrapper']/span")).getText();
		
		Assert.assertEquals(promocode, "Code applied ..!");
		
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		//driver.findElement(By.xpath("")).click();
		WebElement countryName=driver.findElement(By.xpath("//div[@class='products']/div/div/select"));
		Select selectcountry=new Select(countryName);
		selectcountry.selectByValue("India");
		
		driver.findElement(By.xpath("//div[@class='products']/div/input")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
		
	}

}

//driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");


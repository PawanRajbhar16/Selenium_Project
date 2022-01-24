package selenium_project;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CountLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium-server-4.1.0 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		CountLink cl = new CountLink();
		// cl.countlink(driver);
		// driver.get("http://the-internet.herokuapp.com/");
		// driver.get("https://ultratechcement.com/");
		// driver.get("https://d321qx09ltesr4.cloudfront.net/");
		driver.get("https://ultratechcement.com/");
		// cl.footer(driver);
		// cl.header(driver);
		// cl.header2(driver);
		cl.selectLanguage(driver);

	}

	public void countlink(WebDriver driver) {

		System.out.println(driver.findElements(By.tagName("a")).size());

		List<WebElement> TagNames = driver.findElements(By.tagName("a"));

		for (int i = 0; i < TagNames.size(); i++) {

			WebElement links = TagNames.get(i);

			System.out.println(links.getText() + "<<--->>>" + links.getAttribute("href"));
			// links.getAttribute("hreg");

			// System.out.println(TagNames.get(i).getText());
		}

	}

	// count of footer section step 1) limiting the scope of driver
	public void footer(WebDriver driver) {

		WebElement footerdriver = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/div[1]/ul"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		for (int i = 0; i < footerdriver.findElements(By.tagName("a")).size(); i++) {

			String Clicklinkstab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(Clicklinkstab);

		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

	// count the link of one Column

	// click on each link in the column

	public void header(WebDriver driver) {
		// ul[contains(@class,'firstnav')]
		WebElement Headerdriver = driver.findElement(By.xpath("//ul[contains(@class,'firstnav ')]"));
		List<WebElement> tags = Headerdriver
				.findElements(By.xpath("//ul[contains(@class,'firstnav ')]/li[@class='panelH']/a[1]"));
		System.out.println(Headerdriver
				.findElements(By.xpath("//ul[contains(@class,'firstnav ')]/li[@class='panelH']/a[1]")).size());

		for (int i = 0; i < Headerdriver
				.findElements(By.xpath("//ul[contains(@class,'firstnav ')]/li[@class='panelH']/a[1]")).size(); i++) {

			System.out.println(tags.get(i).getText() + tags.get(i).getAttribute("href"));

		}

	}

	public void header2(WebDriver driver) {
		WebElement Headerdriver = driver.findElement(By.xpath("//ul[contains(@class,'firstnav ')]"));
		List<WebElement> tags = Headerdriver
				.findElements(By.xpath("//ul[contains(@class,'firstnav ')]/li[@class='panelH']/a[1]"));
		System.out.println(Headerdriver
				.findElements(By.xpath("//ul[contains(@class,'firstnav ')]/li[@class='panelH']/a[1]")).size());

		for (int i = 0; i < Headerdriver
				.findElements(By.xpath("//ul[contains(@class,'firstnav ')]/li[@class='panelH']/a[1]")).size(); i++) {
			String clickTap = Keys.chord(Keys.CONTROL, Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			Headerdriver.findElements(By.xpath("//ul[contains(@class,'firstnav ')]/li[@class='panelH']/a[1]")).get(i)
					.sendKeys(clickTap);
		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

	public void selectLanguage(WebDriver driver) {

		WebElement dropdown = driver.findElement(By.xpath("//ul[contains(@class,'navbar-right')]/li[2]/select"));
		Select st = new Select(dropdown);
		// st.selectByValue("/gujarati");
		int languageCount = driver.findElements(By.xpath("//ul[contains(@class,'navbar-right')]/li[2]/select/option")).size();
		for (int i = 1; i < languageCount; i++) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			st.selectByIndex(i);
			System.out.println(dropdown.getText());

			// st.selectByIndex(i);
			
		}

	}

}

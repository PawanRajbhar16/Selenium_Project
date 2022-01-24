package TestNgBasic;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTestng {
	@BeforeSuite
	public void setchrome() {
		System.out.println("set up chrome");
	}
	
	@Test
	public void login() {
		System.out.println("login success");
	}

}

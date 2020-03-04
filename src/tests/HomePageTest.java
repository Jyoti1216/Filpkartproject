package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import utilities.InvokeBrowser;
import utilities.LoadProperties;
import utilities.Locators;

public class HomePageTest {

	public HomePage homepage;

	@BeforeClass
	@Parameters("browser")
	public void setup(String browserName) throws Throwable {
		
		LoadProperties.property();
		
		homepage = new HomePage();
		homepage.LaunchFlipkart(browserName);
	}

	@Test(priority = 0)
	public void FlipkartTitle() {

		String title = homepage.Title();
		System.out.println(title);
		Assert.assertTrue(title.contains("Online Shopping Site"));
	}

	@Test(priority = 1)
	public static void FlipkartLoginBtn() {

		Assert.assertTrue(InvokeBrowser.driver.findElement(Locators.LoginButton).isDisplayed());
	}

}

package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.LoadProperties;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {
	
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String browserName) throws Exception {
		
		loginpage= new LoginPage();
		loginpage.LoginPageOpen(browserName);
		
	} 
	
	
	@Test
	public void login_ValidUserValidPass() throws Exception {
		
		loginpage.login(LoadProperties.config.getProperty("Email"), LoadProperties.config.getProperty("Password"));
	}

	
	
	

}

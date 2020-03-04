package pages;

import utilities.InvokeBrowser;
import utilities.Locators;

public class LoginPage {

	public void LoginPageOpen(String browserName) throws Exception {
		
		InvokeBrowser.driver.findElement(Locators.LoginButton).click();	
	}
	
	public void login(String strUserName, String strPasword) {

		InvokeBrowser.driver.findElement(Locators.Username).sendKeys(strUserName);
		InvokeBrowser.driver.findElement(Locators.Password).sendKeys(strPasword);
		InvokeBrowser.driver.findElement(Locators.loginbutton).click();
		
	}
	
}

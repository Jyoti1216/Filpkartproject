package utilities;

import org.openqa.selenium.By;

public class Locators extends LoadProperties {

	// Home Page
	public static By CloseButton = By.xpath(LoadProperties.orXpath.getProperty("Close_Login_Page"));
	public static By LoginButton = By.xpath(LoadProperties.orXpath.getProperty("LoginBtn"));

	// Login Page
	public static By Username = By.xpath(LoadProperties.orXpath.getProperty("Email_field"));
	public static By Password = By.xpath(LoadProperties.orXpath.getProperty("Pass_field"));
	public static By loginbutton = By.xpath(LoadProperties.orXpath.getProperty("Login_Button"));

}

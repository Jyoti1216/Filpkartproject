package pages;



import org.testng.annotations.Parameters;

import utilities.InvokeBrowser;
import utilities.Locators;

public class HomePage {
	
	public void LaunchFlipkart(String browserName) throws Exception {
       
		
		InvokeBrowser.Launch(browserName);
		InvokeBrowser.driver.findElement(Locators.CloseButton).click();
	}

	public String Title() {

		return InvokeBrowser.driver.getTitle();
	}
	
}

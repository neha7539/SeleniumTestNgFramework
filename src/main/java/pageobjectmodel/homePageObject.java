package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageObject {
	
	public WebDriver driver; // THIS DRIVER DONT HAVE SCOPE
	
	private By myaccount = By.xpath("//a[@title='My Account']");
	
	private By register =By.xpath("//a[text()='Register']");
	private By login = By.xpath("//a[text()='Login']");
	
	
	
	public homePageObject(WebDriver driver) { // yh driver scope le k aya h registertestcAse se
		this.driver=driver; // here we assigned the scope
	}

	public WebElement clickonmyaccount() {
		return driver.findElement(myaccount);
		
	}
	
	public WebElement clickonregister() {
		return driver.findElement(register);
		
	}
	
	public WebElement clickonlogin() {
		return driver.findElement(login);
		
	}

}

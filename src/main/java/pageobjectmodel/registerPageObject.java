package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPageObject {

	public WebDriver driver; // THIS DRIVER DONT HAVE SCOPE

	private By firstname = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By confirmpassword = By.xpath("//input[@name='confirm']");
	private By subscribe = By.xpath("//input[@name='newsletter']");
	private By privacypolicy = By.xpath("//input[@name='agree']");
	private By Continue = By.xpath("//input[@value='Continue']");

	public registerPageObject(WebDriver driver) { // yh driver scope le k aya h registertestcAse se
		this.driver=driver; // here we assigned the scope
	}

	public WebElement clickonfirstname() {
		return driver.findElement(firstname);

	}

	public WebElement clickonlastname() {
		return driver.findElement(lastname);

	}

	public WebElement clickonemail() {
		return driver.findElement(email);

	}

	public WebElement clickontelephone() {
		return driver.findElement(telephone);

	}

	public WebElement clickonpassword() {
		return driver.findElement(password);

	}

	public WebElement clickonconfirmpassword() {
		return driver.findElement(confirmpassword);

	}

	public WebElement clickonsubscribe() {
		return driver.findElement(subscribe);

	}

	public WebElement clickonprivacypolicy() {
		return driver.findElement(privacypolicy);

	}

	public WebElement clickoncontinue() {
		return driver.findElement(Continue);

	}

}

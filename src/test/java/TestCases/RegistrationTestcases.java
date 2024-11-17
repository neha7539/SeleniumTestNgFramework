package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Baseclass;
import pageobjectmodel.homePageObject;
import pageobjectmodel.registerPageObject;

public class RegistrationTestcases extends Baseclass {

	@Test
	public void verifyregisterwithValiddata() throws IOException {

		initializedriver();
		
		// THIS DRIVER HAVE SCOPE
		driver.get("https://naveenautomationlabs.com/opencart/");

		homePageObject hpo = new homePageObject(driver);

		hpo.clickonmyaccount().click();
		
		hpo.clickonregister().click();
		
		registerPageObject rpo = new registerPageObject(driver);
		
		rpo.clickonfirstname().sendKeys("neha");
		rpo.clickonlastname().sendKeys("neha");
		rpo.clickonemail().sendKeys("neha1234@gmail.com");
		rpo.clickontelephone().sendKeys("1234");
		rpo.clickonpassword().sendKeys("secure123");
		rpo.clickonconfirmpassword().sendKeys("secure123");
		rpo.clickonsubscribe().click();
		rpo.clickonprivacypolicy().click();
		rpo.clickoncontinue().click();
		

	}

	@Test(enabled=false)
	public void verifyregisterwithInValiddata() {

	}

	@Test(enabled=false)
	public void verifyregisterwithBlankdata() {

	}

}

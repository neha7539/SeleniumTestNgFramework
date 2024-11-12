package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Baseclass;

public class RegistrationTestcases extends Baseclass {
	
	@Test
	public void verifyregisterwithValiddata() throws IOException {
		
		initializedriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		
	}
	
	@Test
    public void verifyregisterwithInValiddata() {
		
	}
	@Test
    public void verifyregisterwithBlankdata() {
		
	}
	
	

}

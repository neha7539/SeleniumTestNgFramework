package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

	public WebDriver driver;
	
	public void initializedriver() throws IOException {

		// This will help to read the data.property file.
		FileInputStream fis = new FileInputStream("C:\\Users\\neha7\\eclipse-workspace\\SeleniumTestNGFramework\\src\\main\\java\\Resources\\data.properties");

		// it will access the file
		Properties prop = new Properties();

		// yha file load hogi so that java will understand the data

		prop.load(fis);

		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {

		 driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {

		 driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {

			 driver = new EdgeDriver();

		} else {
			System.out.println("Please pass the correct browser");
		}

	}
}

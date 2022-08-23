package driverlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {

	@Test
	public void setup() {
		WebDriverManager.chromedriver().setup();
	//	System.setProperty("webdriver.chrome.driver", "D:\\selenium sw\\webbrowser\\chromedriver.exe");
		WebDriver WD=new ChromeDriver();
		WD.get("https://www.ebay.com/");
		WD.manage().window().maximize();
		String title=WD.getTitle();
		System.out.println(title);
		
	}

}

package MercuryTours;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Reusable.Reusable;

public class MercuryToursLoginTest extends Reusable {
	public WebDriver driver;

	@Test(groups="Smoke")
	public void login() {
		System.out.println("MercuryTours333");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(MercuryToursObjects.userID).sendKeys("USerName");
		driver.findElement(MercuryToursObjects.password).sendKeys("password");
		driver.quit();
	}

}

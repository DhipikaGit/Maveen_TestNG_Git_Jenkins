package SocialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MercuryTours.MercuryToursObjects;
import Reusable.Reusable;

public class SocialMediaLoginTest extends Reusable{
	public WebDriver driver;

	@Test(groups="Smoke")
	public void openFB()
	{
		System.out.println("---FB---");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(SocialMediaObjects.fb);
		driver.manage().window().maximize();
		sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
	
	@Test(groups="Regression")
	public void openGmail()
	{
		System.out.println("-----Gmail------");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(SocialMediaObjects.gmail);
		driver.manage().window().maximize();
		sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}
	
}

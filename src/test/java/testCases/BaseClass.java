package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseClass {
	WebDriver driver;
	public Logger log;
	
	@BeforeClass
	//@Parameters("browser")
	public void setup()
	{
		log=Logger.getLogger("MyLoginLogger");
		PropertyConfigurator.configure("log4j.properties");
		//if(br.equals("chrome"))
		//{
		System.setProperty("webdriver.chrome.driver","D:/Maddy_Eclipse/Practice_Eclipse/MakeMyTrip/Drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		log.info("Opened browser");
		//}
		
		driver.get("https://www.facebook.com/");
		log.info("AUT page is opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		log.info("closed browser");
	}

}

package selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging {

	public static void main(String[] args) {
		// Create Logger instance
		
	Logger logger = Logger.getLogger("Log4JLogging");
	
	//Configure log4j properties file
	PropertyConfigurator.configure("C:\\Users\\VARSHA\\eclipse-workspace\\3April2023\\log4j.properties");
	
	//Open Browser Instance
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	logger.info("Chrome browser instance opened");

	//Maximize the window
	driver.manage().window().maximize();
	logger.info("Window Maximized");
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Open URL
	driver.get("https://www.facebook.com/");
	logger.info("Application opened");
	
	//Check if the web element is displayed or not (Each time delete the log folder after refreshing project we get.)
	try {
	driver.findElement(By.id("emails")).isDisplayed();
	logger.info("Web element Displayed");
	}
	catch(Exception e) {
		logger.info("Failure - 'emails' web element is not displayed");
	}
	
	
	}

}

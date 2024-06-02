package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args)throws Exception {
		//setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		
		//Lauching chrome browser Instance
		WebDriver driver = new ChromeDriver();
		
		//open URL using get() method
		driver.get("https://www.facebook.com/");
		
		//Maximise the window
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//Delete all cookies
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		//open URL using navigate() method
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		
		//refresh the page.
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//open new url using navigate method for youtube page
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		
		
		//navigate to 1 step back
		Thread.sleep(3000);
		driver.navigate().back();
		
		//navigate to forward
		Thread.sleep(2000);
	    driver.navigate().forward();
		
		//open new url using navigate method for instagram page
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		
		
		//fetch current URL
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		//get title of the web page
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		//close the browser
		driver.close();
	}

}

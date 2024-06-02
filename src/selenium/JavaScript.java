package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//JavaScriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		//Locate webelement by using javascript
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='123#abc'");
		
		//Scroll Down using JavaScript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,400)");
		
		//Scroll up using JavaScript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-400)");
		
	}

}

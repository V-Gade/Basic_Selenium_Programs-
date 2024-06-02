package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Enter username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		
		//fetch input box attribute value
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
		
		//Get height of input box - interview question.
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
		
		//Get width of input box
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
		
		//use explicit wait to check if password field is visible
		WebDriverWait wt=new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");
		
		
		driver.quit();

	}

}

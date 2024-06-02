package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		
		  
		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@value='1']")).click();
		 */
		
		
		  Thread.sleep(2000);
		  List<WebElement> R=driver.findElements(By.xpath("//input[@type='radio']"));
		  System.out.println("buttons ="+R.size());
		  R.get(1).click();
		  Thread.sleep(2000);
		 
		  
		 
		
		  /*Thread.sleep(2000);
		  
		  List<WebElement> radios =driver.findElements(By.xpath("//label[@class='_58mt']"));
		  System.out.println("Total radio buttons are:" + radios.size()); 
		  String expResult = "Male"; for (int i = 0; i < radios.size(); i++) {
		  if(radios.get(i).getText().equalsIgnoreCase(expResult)) {
		  radios.get(i).click(); System.out.println("radio button" + " " + expResult+" " + "clicked."); 
		  }*/
		  driver.quit();
		  }

	}



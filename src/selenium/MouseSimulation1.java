package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l')]")).click();
		Thread.sleep(2000);
		
		//create Electronics web Element Ref
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		//mouse Simulation using Actions class
		Actions act = new Actions(driver);
		
		//mouse Hover to Electronics
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		
		//Keyboard Operations
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement fash= driver.findElement(By.xpath("//*[text()='Fashion']"));
		Thread.sleep(2000);
		act.sendKeys(fash, Keys.ENTER).build().perform();
		System.out.println("Fashion option clicked.");
		
		//Right click on web page
		Thread.sleep(2000);
		act.contextClick().build().perform();
		
		//Right click on web page
		WebElement cart= driver.findElement(By.xpath("//*[text()='Cart']")); 
		Thread.sleep(2000);
		act.contextClick(cart).build().perform();
		System.out.println("cart option clicked.");
		
		

	}

}

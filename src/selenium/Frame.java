package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws Exception {
    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		//Find total number of frame present
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frame :"+allFrames);
		
		//Go inside each frame and check if the element is present
		for(int i=0; i<allFrames;i++)
		{
			driver.switchTo().frame(i);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();//also use //div[@class='watchVideoButton']
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(),'close')]")).click();
		}
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		System.out.println("Jumped to parent frame");
		Thread.sleep(2000);
		driver.close();

	}

}

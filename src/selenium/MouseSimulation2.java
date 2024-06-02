package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		//Switching Frame
		driver.switchTo().frame(0);
		System.out.println("Switched to frame");
		
		//Draggable Web Element
		WebElement drag=driver.findElement(By.id("draggable"));//instead of by,id u can use xpath("//div[@id='draggable']")
		//WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//Droppable Web Element
		WebElement drop=driver.findElement(By.id("droppable"));
		
		//Drag and Drop using Actions class
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		
		
	}

}

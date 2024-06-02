package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff Works");
		
		//Handling auto suggestion
		List<WebElement> AllSuggestion =driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		String expReult="how stuff works quiz";
		for(int i=0;i<AllSuggestion.size();i++) {
			if(AllSuggestion.get(i).getText().equalsIgnoreCase(expReult)) {
				AllSuggestion.get(i).click();
				break;
				
			}
		}

	}

}

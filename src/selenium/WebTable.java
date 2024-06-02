package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		//Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		//create List-All Companies
		List<WebElement> allcompanies =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies :"+allcompanies.size());
		
		//create List- current price
		List<WebElement> currentPrice =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total current price :"+currentPrice.size());
		
		String a="Orchasp";
		for(int i=0; i<allcompanies.size();i++)
		{
			if(allcompanies.get(i).getText().equalsIgnoreCase(a)) {
				
				System.out.println(allcompanies.get(i).getText()+"=="+currentPrice.get(i).getText());
				allcompanies.get(i).click();
				break;
				
			}
		}
		
		

	}

}

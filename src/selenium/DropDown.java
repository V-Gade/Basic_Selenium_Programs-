package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//For clicking create account.
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		  Thread.sleep(2000);
		
		  
		 //1st way
		List<WebElement> birthmonth =driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total Dropdown values :-"+birthmonth.size());
		birthmonth.get(8).click(); //sep
		
		//2nd way
		WebElement bm=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(bm);
		Thread.sleep(2000);
		month.selectByVisibleText("Apr"); //apr
		Thread.sleep(2000);
		month.selectByValue("5");//may
		Thread.sleep(2000);
		month.selectByIndex(8);//sep
		Thread.sleep(2000);
		System.out.println(month.getFirstSelectedOption().getText());//current selected text.
		
		//3rd way
		List<WebElement> dropdown= month.getOptions();
		for(int i=0;i<dropdown.size();i++) {
			if(dropdown.get(i).getText().equalsIgnoreCase("sep")) {
				dropdown.get(i).click();
			}
		}
		
	//4th way
		bm.sendKeys("Jun");
		
    //5th way
		Thread .sleep(2000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar"); //mar
		
		
		 driver.quit();
		
	   
	}

}

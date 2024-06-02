package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YearDropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//click on create new account
		WebElement b=driver.findElement(By.xpath("//a[contains(@id,'u_0')]"));
		b.click();
		Thread.sleep(2000);
		
		
		  //1st way
		List<WebElement> birthyear=driver.findElements(By.xpath("//select[@id='year']//option"));
		  System.out.println("Total number of index in dropdown:-"+birthyear.size());
		  birthyear.get(5).click();
		  
		  //2nd way
		  WebElement by=driver.findElement(By.xpath("//select[@id='year']"));
		  Select year= new Select(by);
		  year.selectByIndex(110);//1915
		  Thread.sleep(2000); year.selectByValue("1996");//1996
		  Thread.sleep(2000);
		  year.selectByVisibleText("1999");//1999
		  Thread.sleep(2000);
		  System.out.println(year.getFirstSelectedOption().getText());
		  Thread.sleep(2000);
		 
	    //3rd way
		 List<WebElement> dropdown= year.getOptions();
		  for(int i=0;i<dropdown.size();i++) {
		  if(dropdown.get(i).getText().equalsIgnoreCase("2013"))
		  {
		  dropdown.get(i).click();
		  }
		}
		  
	  //4th way
		  List<WebElement> dropdown1=driver.findElements(By.xpath("//select[@id='year']//option"));
		  for(int j=0; j<dropdown1.size();j++)
		  {
			  if(dropdown1.get(j).getText().equalsIgnoreCase("2012"))
			  {
				  dropdown1.get(j).click();
				  
			  }
		  }
		  
		  //5th way
		  by.sendKeys("2008");
		  
		  //6th way
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2005");
		  
		  
		  
		  driver.quit();
			  
	}

}

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	    //For clicking create account.
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		
		
		  //1st way:- hardcoded data. Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@value='1']")).click(); //female
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@value='2']")).click(); //male
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@value='-1']")).click();//custom
		 		
		//2nd way:-hardcoded data.By using list.
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("total radio button is :"+radios.size());
		System.out.println(radios.get(0).isEnabled()); //True
		System.out.println(radios.get(1).isSelected());//false
		System.out.println(radios.get(2).isDisplayed());//True
		
		Thread.sleep(2000);
		radios.get(1).click(); //male
		System.out.println("Male radio button clicked");
		
		
		//3rd way..V.IMP ...This method used in industries.
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("total radio button is:"+radios.size());
		String expResult ="Custom";
		for(int i=0; i<radios1.size();i++) {
	      if(radios1.get(i).getText().equalsIgnoreCase(expResult)) {
	    	  radios1.get(i).click();
	    	  System.out.println(expResult+" "+"clicked");
	    	  break;
	      }
		driver.quit();
		}
		}

	}


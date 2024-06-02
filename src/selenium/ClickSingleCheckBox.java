package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickSingleCheckBox {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		  List<WebElement> checkbox = driver.findElements(By.xpath("//label[@class='css-label_c t_c']"));
		  System.out.println("Total checkbox are:"+" "+checkbox.size());
			/*
			 * //1st way by for each loop // Iterate through the checkboxes and select the
			 * ones you want for(WebElement checkbox1 :checkbox) {
			 * if(!checkbox1.isSelected()) {
			 * 
			 * checkbox1.click(); driver.quit();
			 * 
			 * } }
			 */
	      
	      //2nd way by for loop.
	    String expResult ="Railway Pass Concession";
	    for(int i=0; i<checkbox.size();i++) {
	    	if(checkbox.get(i).getText().equalsIgnoreCase(expResult)) {
	    		checkbox.get(i).click();
		    	  System.out.println(expResult+" "+"clicked");
		    	  break;
		    	  
	    	}
	    }
	    driver.quit();
	      
		 
		
		
		}
	}

//label[@class='css-label_c t_c']


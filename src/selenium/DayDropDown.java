package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayDropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//for clicking create button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(2000);
		
		
		  //first way 
		List<WebElement> birthdate =driver.findElements(By.xpath("//select[@id='day']//option"));
		  System.out.println("Total number of day list :-"+birthdate.size());
		  birthdate.get(23).click();//24
		  
		  //Second way 
		  WebElement bd=driver.findElement(By.xpath("//select[@id='day']")); 
		  Select day=new Select(bd); 
		  Thread.sleep(2000);
		  day.selectByVisibleText("5"); //5
		  Thread.sleep(2000); 
		  day.selectByIndex(17);//18 Thread.sleep(2000);
		  day.selectByValue("6");//6 Thread.sleep(2000);
		  System.out.println(day.getFirstSelectedOption().getText());//current selected value i.e. 6.
		  
		  //Third way
		  
		  List<WebElement> dropdown= day.getOptions(); 
		  for(int i=0;i<dropdown.size();i++) {
		  if(dropdown.get(i).getText().equalsIgnoreCase("8")) {
		  dropdown.get(i).click(); } }
		 
		 //fourth way
		  List<WebElement> dropdown1=driver.findElements(By.xpath("//select[@id='day']//option"));
		  for(int j=0;j<dropdown1.size();j++) {
		  if(dropdown1.get(j).getText().equalsIgnoreCase("17")) {
		  dropdown1.get(j).click(); }
		  
		  }
		  
			
			//5th way
				bd.sendKeys("12");
				
		    //6th way
				Thread .sleep(2000);
				driver.findElement(By.xpath("//select[@id='day']")).sendKeys("6"); //6
		 
		driver.quit();

	}

}

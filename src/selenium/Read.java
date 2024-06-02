package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("C:\\Users\\VARSHA\\OneDrive\\Desktop\\VwoScenarioes.xlsx");

		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("sheetName");
		System.out.println(sh.getSheetName());
		
		System.out.println(sh.getRow(2).getCell(0).getStringCellValue());
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://app.vwo.com/#/login");
		  String ab=sh.getRow(3).getCell(3).getStringCellValue();
		  driver.findElement(By.id("login-username")).sendKeys(ab);
		  
		  
	}

}

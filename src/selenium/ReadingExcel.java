package selenium;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		// Specify the location of excel File
		//File src = new File("C:\\Users\\VARSHA\\OneDrive\\Desktop\\VwoScenarioes.xlsx");
		File src = new File("C:\\Users\\VARSHA\\OneDrive\\Documents\\Training Materials\\Short Notes.xlsx");
		
		//Load File
		FileInputStream fis = new FileInputStream(src);
		
		//Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Load WorkSheet
		//XSSFSheet sh = wb.getSheet("sheetName");
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//Print the loaded sheet name
		System.out.println(sh.getSheetName());
		
		//print OOPS Concept from Excel sheet
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
		
		
		  //print Java from Excel sheet
		  System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		  
		  //Print float /double from excel sheet
		  System.out.println(sh.getRow(8).getCell(0).getNumericCellValue());
		  
		  //Print integer from excel sheet
		  System.out.println((int)sh.getRow(2).getCell(0).getNumericCellValue());
		  
		  //Print Total number of row - 1st way
		  System.out.println("Total Rows :"+sh.getPhysicalNumberOfRows());
		  
		  //Print Total number of row - 2nd way
		  System.out.println("Total Rows :"+sh.getLastRowNum() + 1);
		  
		  //Print Total number of columns - 1st way
		  System.out.println("Total Rows :"+sh.getRow(1).getPhysicalNumberOfCells());
		  
		  //Print Total number of columns - 2nd way
		  System.out.println("Total Rows :"+sh.getRow(1).getLastCellNum());
		  
		  //Real Time implementation
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\VARSHA\\OneDrive\\Desktop\\G_Varsha\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/");
		  
		  //Enter data (Enter username using excel file) 
		  String abc = sh.getRow(1).getCell(1).getStringCellValue();
		  driver.findElement(By.id("email")).sendKeys(abc);
		 
						
		
		
		
		
		

	}

}

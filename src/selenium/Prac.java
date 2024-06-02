package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Prac {

	public static void main(String[] args) throws Exception {
		// Specify the location of excel File
				File src = new File("C:\\Users\\VARSHA\\OneDrive\\Documents\\Training Materials\\Short Notes.xlsx");
				
		//Load File
		FileInputStream fis = new FileInputStream(src);
				
		//Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
				
		//Load WorkSheet
		XSSFSheet sh = wb.getSheet("Sheet1");
				
		//Print the loaded sheet name
		System.out.println(sh.getSheetName());
				
		//print OOPS Concept from Excel sheet
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
				
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		
		//Print float /double from excel sheet
		//System.out.println((int)sh.getRow(0).getCell(0).getNumericCellValue());
		//System.out.println(sh.getRow(8).getCell(0).getStringCellValue());
		
		//System.out.println(sh.getRow(8).getCell(0).getNumericCellValue());
		
	}
//		System.out.println(sh.getRow(8).getCell(0).getStringCellValue());
//		Cell cell = sh.getRow(8).getCell(0);
//
//		if(cell.getCellType() == CellType.NUMERIC) {
//             double numericValue = cell.getNumericCellValue();
//             System.out.println("Numeric Value: " + numericValue);
//         } else {
//             System.out.println("Cell does not contain a numeric value.");
//         

	}



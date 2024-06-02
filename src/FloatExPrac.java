import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FloatExPrac {

	public static void main(String[] args) throws Exception {
		// Specify the location of excel File//wrong path
				 File src = new File("C:\\Users\\VARSHA\\OneDrive\\Documents\\Training Materials\\Short Notes.xlsx");
				
				//Load File
				FileInputStream fis = new FileInputStream(src);
				
				//Load Workbook
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				
				//Load WorkSheet
				XSSFSheet sh = wb.getSheet("Sheet1");
				
				//Print the loaded sheet name
				System.out.println(sh.getSheetName());
				
				int rows=sh.getLastRowNum();
				int cols=sh.getRow(0).getLastCellNum();
				
				for(int r=0;r<rows;r++) {
					XSSFRow row=sh.getRow(r);

					for(int c=0;c<cols;c++) {
						XSSFCell cell=row.getCell(c);
						switch(cell.getCellType()) 
						{
						case STRING :
							System.out.println(cell.getStringCellValue());
							break;
							
						case NUMERIC :
							System.out.println(cell.getNumericCellValue());
							break;
						case BOOLEAN :
							System.out.println(cell.getBooleanCellValue());
							break;
							
						case FORMULA :
							System.out.println(cell.getNumericCellValue());
							break;
						
						}
						System.out.print("|");
						}
					System.out.println();
				}

	}

}

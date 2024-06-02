import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\VARSHA\\OneDrive\\Documents\\Training Materials\\Short Notes.xlsx";
        
        try (FileInputStream fileInputStream = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);
            Cell cell = row.getCell(0);

            if (cell != null) {
                if (cell.getCellType() == CellType.NUMERIC) {
                    double numericValue = cell.getNumericCellValue();
                    System.out.println("Numeric Value: " + numericValue);
                } else if (cell.getCellType() == CellType.STRING) {
                    String stringValue = cell.getStringCellValue();
                    System.out.println("String Value: " + stringValue);
                } else {
                    System.out.println("Cell type not supported!");
                }
            } else {
                System.out.println("Cell is empty!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils(String excelPath, String sheetName) throws IOException {
        this.workbook = new XSSFWorkbook(excelPath);
        this.sheet = workbook.getSheet(sheetName);

    }

    public void getRowCount() throws IOException {

            int rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println(rowCount);

    }

    public String getCellDateString(int row, int column) throws IOException {

        String value1 = sheet.getRow(row).getCell(column).getStringCellValue();
        return value1;


    }

    public Double getCellDateNumber(int row, int column) throws IOException {

        Double value2 = sheet.getRow(row).getCell(column).getNumericCellValue();
        return value2;

    }
}

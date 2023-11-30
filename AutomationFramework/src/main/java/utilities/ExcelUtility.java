package utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtility {

    public static String[][] getExcelData() throws IOException {
        FileInputStream fis = new FileInputStream("src\\test\\resources\\testdata\\TestData.xlsx");
        //xssfworkbook ->is a class which is used to read .xlsx files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();
        //string array to save excel data
        String[][] data = new String[rowCount][colCount];
        DataFormatter formatter = new DataFormatter();
        //loop to iterate over rows
        for (int i = 0; i < rowCount; i++) {
            //loop to iterate over columns
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                //get cell value
                data[i][j] = formatter.formatCellValue(row.getCell(j));
            }
        }
        //return data
        return data;
    }

//    public static void main(String[] args) {
//        try {
//            String[][] data = getExcelData();
//            for (int i = 0; i < data.length; i++) {
//                for (int j = 0; j < data[i].length; j++) {
//                    System.out.print(data[i][j] + " ");
//                }
//                System.out.println();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}

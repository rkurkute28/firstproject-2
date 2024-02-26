package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelsheetHandling {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Setting the pathe Excelsheet
		String path = "D:\\Softwaretesting\\Testing Note\\Excelprogram\\ProgramExcel.xlsx";

	            FileInputStream file= new FileInputStream(path);
	            Object value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue()	;
	            System.out.println(value);
	            System.out.print(value);
	            
	}
}

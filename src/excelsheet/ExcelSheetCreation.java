package excelsheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

import zmq.ZError.IOException;

public class ExcelSheetCreation {

	public static void main(String[] args) throws java.io.IOException {
		// date
		//Create Workbook and Spreadsheet
		//Create Logic
		//Write
		int[] serial =new int[10];   // For Colunm 0
		for (int i = 0;i<serial.length;i++) {
			serial[i]=i+1;
		}
		//for Colunm 1
		String []  name=new String [10];
		name[0]="Students A";
		name[1]="Students B";
		name[2]="Students C";
		name[3]="Students D";
		name[4]="Students E";
		name[5]="Students F";
		name[6]="Students G";
		name[7]="Students H";
		name[8]="Students I";
		name[9]="Students J";
		
		String [] result=new String[10];
		result [0]="pass";
		result[1]="pass";
		result[2]="fail";
		result[3]="pass";
		result[4]="pass";
		result[5]="fail";
		result[6]="pass";
		result[7]="pass";
		result[8]="fail";
		result[9]="pass";
					// Logic
			// Create Workbook
			XSSFWorkbook var=new XSSFWorkbook();
			
			// Create SpreadSheet
			XSSFSheet sheet=var.createSheet("Sheet 1");
			
			// Create Row
			XSSFRow row; 
			row = sheet.createRow(0);
			
		XSSFCell cell0 = row.createCell(0);
		XSSFCell cell1 = row.createCell(1);
		XSSFCell cell2 = row.createCell(2);
	             
		// Logic
		


	
	for(int i = 0;i<serial.length;i++) {
		
		row=sheet.createRow(i=1);
		
		for(int j=0;j<3;j++) {
			
			XSSFCell cell=row.createCell(j);
			   if( cell.getColumnIndex()==0) {
				   
				   cell.setCellValue(serial(i));
				   
				     }
			   else if(cell.getColumnIndex()==1){
			   
				   
				  cell.setCellValue(name(i));
			   }
			   else if (cell.getColumnIndex()==2) {
				   
				   cell.setCellValue(result(i));
			   }
			
			
			
		}
		
	}
	           // Write IN Excel sheet
	
	String path="D:\\Softwaretesting\\Testing Note\\Excelprogram\\ProgramExcel2.xlsx";
	try
	{
		FileOutputStream out =new FileOutputStream(path);
		var.write(out);
		System.out.println("File is Generated......");
		out.close();
		
		
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
      catch(IOException e) {
    	  e.printStackTrace();
      }
	
	
	

		
		
		
		
		
	
		
		

	}

	private static Date name(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Date serial(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Date result(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}

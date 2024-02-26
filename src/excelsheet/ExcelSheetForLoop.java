package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForLoop {
            String path="D:\\Softwaretesting\\Testing Note\\Excelprogram\\ProgramExcel.xlsx";            
            public void First() throws EncryptedDocumentException, IOException {
            	FileInputStream f=new FileInputStream(path);
            	 org.apache.poi.ss.usermodel.Sheet r = WorkbookFactory.create(f).getSheet("Sheet2");
            
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
					String a = r.getRow(i).getCell(j).getStringCellValue();
					System.out.print(a+" ");
					}
					System.out.println();
            	
            	}
            	System.out.println("----------------------");
            	
            	
            }
            public void second() throws EncryptedDocumentException, IOException {
            	        FileInputStream s=new FileInputStream(path);
            	       org.apache.poi.ss.usermodel.Sheet b = WorkbookFactory.create(s).getSheet("Sheet2");
            	       for(int i=0;i<3;i++) {
            	    	   for(int j=0;j<3;j++) {
            	    		   String r = b.getRow(j).getCell(j).getStringCellValue();
            	    		   System.out.print(r+" ");
            	    		   
            	    		   
            	    		   
            	    	   }
            	    	   System.out.println();
            	    			
            	    	   
            	       }
            	       System.out.println("----------------------");
            	       
            	       
            	        
            	        
            	       
            }
            public void three() throws EncryptedDocumentException, IOException {
            	FileInputStream s= new FileInputStream(path);
            	org.apache.poi.ss.usermodel.Sheet b = WorkbookFactory.create(s).getSheet("Sheet2");
            	for(int i=0;i<3;i++) {
            		for(int j=0;j<3;j++) {
            			 String r = b.getRow(i).getCell(j).getStringCellValue();
            			System.out.println(r+  " "
);          			 
            	}
            	
            }
                        	
            	
            	
            } public static void main(String[]args) throws EncryptedDocumentException, IOException {
            	ExcelSheetForLoop t=new ExcelSheetForLoop();
            	t.First();
            	t.second();
            	t.three();

}
}
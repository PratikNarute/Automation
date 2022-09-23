package Apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExtractFileFromExcel 
{
	

	
	
   public static void main(String[] args) throws EncryptedDocumentException, IOException
   
   {
 		String path="C:\\Users\\prajwal narute\\Desktop\\SQL.xlsx"; // to extract the path of file from our system
 		
 		FileInputStream file=new FileInputStream(path); // To make copy in java because its not possible to direct access into system
 			
 		Sheet sheet=WorkbookFactory.create(file).getSheet("sheet1"); // to extract file and sheet from excel in apache poi
 	
 		
 		
 	
 	
   for (int a=0;a<=8;a++)   // 1
   {
     for(int b=4;b<=5;b++)  // 4,5
     {		
 		String value=sheet.getRow(a).getCell(b).getStringCellValue(); // to extract rows and cell from excel in apache poi
 		System.out.print(value+"  ");
     }
     System.out.println();
     
   }
   
   
   
 }
}

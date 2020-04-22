
/*
package Oct_2019;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittenExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String data=null;
	        try
	        {
	            FileInputStream input= new FileInputStream("E:\\selenium\\Nikhil.xlsx");
	            XSSFWorkbook wb=new XSSFWorkbook(input);
	            XSSFSheet sh=wb.getSheet("Erp");
	            Row r;
	            int rowc = sh.getLastRowNum();
	            for (int i = 0; i <=rowc; i++) {
	            	r=sh.getRow(i);
	          
				
	            XSSFRow row=sh.getRow(0);
	            row.getCell(1).toString();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	        return;
	    }

	public void writeDataFromExcel(int rowcount,int columncount,String filepath,String Sheetname,String value)
	{
	    try
	    {
	        FileInputStream input=new FileInputStream("E:\\selenium\\Nikhil.xlsx");
	        XSSFWorkbook wb=new XSSFWorkbook(input);
	        XSSFSheet sh=wb.getSheet("Erp");
	        XSSFRow row=sh.getRow(1);
	        FileOutputStream webdata=new FileOutputStream("E:\\selenium\\Nikhil.xlsx");
	        row.createCell(1).setCellValue(1);
	        wb.write(webdata);

	    }
	    catch(Exception e)
	    {

	    }

	}

	}
	
}

*/
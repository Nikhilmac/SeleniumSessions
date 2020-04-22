/**

package Oct_2019;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class Excel {
public static void main(String []args){
try {

File src=new File("E:\\selenium\\SampleExcel.xlsx");    
 FileInputStream fis=new FileInputStream(src);
 XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sh1= wb.getSheetAt(0);
/* // getRow() specify which row we want to read.
  // and getCell() specify which column to read.
  // getStringCellValue() specify that we are reading String data.
 */
/**
System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
 } catch (Exception e) {
 System.out.println(e.getMessage());
 }}}
}

**/

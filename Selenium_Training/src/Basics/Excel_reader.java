package Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\selenium downloads\\arun.xlsx"); //to convert physical file
		
		FileInputStream fis = new FileInputStream(file); // to read xcel from xcel sheet
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);  //to used content of workbook
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		XSSFRow row = sh.getRow(1);
		
		XSSFCell cell = row.getCell(0);
		
		
		System.out.println(cell.getStringCellValue());
		System.out.println(sh.getSheetName());
		System.out.println(row.getCell(0));
		System.out.println(row.getCell(1));
		
		
		
		
		

	}

}

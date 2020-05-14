package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_utility {
	String filename;


	public Excel_utility(String f){
		filename=f;

	}


	public String readStringFromExcel(int sh,int r,int c) throws IOException{
		File file = new File(filename);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sh);
		XSSFRow row = sheet.getRow(r);
		XSSFCell cell = row.getCell(c);

		return cell.getStringCellValue();


	}

	public String readStringFromExcel(String sh,int r,int c) throws IOException{
		File file = new File(filename);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sh);			// sheet name
		XSSFRow row = sheet.getRow(r);			 //  row name
		XSSFCell cell = row.getCell(c);			// cell name

		return cell.getStringCellValue();		

	}

	public int readNumericFromExcel(int sh,int r) throws IOException{
		File file = new File(filename);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sh);			// sheet name

		return sheet.getLastRowNum();


	}
	public int readNumOfUsedRows(int r) throws IOException{
		File file = new File(filename);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFRow row = sh.getRow(r);			 //  row name

		return row.getLastCellNum();
	}

	public void WriteStringToExcel(int sh, int r, int c,String data)throws IOException{
		File file =new File(filename);
		FileInputStream fis =new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sh);
		XSSFRow row = sheet.getRow(r);
		XSSFCell cell=row.createCell(c);
		cell.setCellValue(data);

		FileOutputStream fos =new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();

	}
}
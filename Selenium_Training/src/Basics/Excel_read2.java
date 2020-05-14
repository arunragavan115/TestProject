package Basics;

import java.io.IOException;

import utilities.Excel_utility;

public class Excel_read2 {
	
	public static void main(String[] args) throws IOException {
		Excel_utility m2= new Excel_utility("D:\\selenium downloads\\arun.xlsx");
		
		String str=m2.readStringFromExcel(0, 0, 0);
		System.out.println(str);
		
		String str2=m2.readStringFromExcel("sheet1", 0, 0);
		System.out.println(str2);
		
		int str3=m2.readNumericFromExcel(0, 0);
		System.out.println(str3);
		
		
	}
}

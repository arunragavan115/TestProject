package Basics;

import java.io.IOException;

import utilities.Excel_utility;
import utilities.Myselenium_Engine;

public class fb_login_DataDriven {
	
	public static void main(String[] args) throws IOException {
		
		Excel_utility m2= new Excel_utility("D:\\selenium downloads\\Book1.xlsx");
		Myselenium_Engine aa=new Myselenium_Engine();
		
		
		
				aa.launchChromebrowser();
				aa.launchurl("https://www.facebook.com/");
				aa.enterVal_id("u_0_m",m2.readStringFromExcel(0, 1, 0));
				aa.enterVal_name("lastname",m2.readStringFromExcel(0, 1, 1));
				aa.enterVal_name("reg_email__",m2.readStringFromExcel(0, 1, 2));
				aa.enterVal_name("reg_passwd__",m2.readStringFromExcel(0, 1, 3));
				aa.Dropdown_index_id("day",m2.readStringFromExcel(0, 1, 4));
				aa.Dropdown_index_id("month",m2.readStringFromExcel(0, 1, 5));
				aa.Dropdown_index_id("year",m2.readStringFromExcel(0, 1, 6));
				aa.click_Id("u_0_7");
				aa.click_Id("u_0_13");
				aa.close();
				
		}
		
		
	}




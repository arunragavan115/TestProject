package Basics;

import java.io.IOException;

import utilities.Excel_utility;
import utilities.MySelEngine;

public class KeyWord_Driven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Excel_utility m2= new Excel_utility("C:\\Users\\Arun Ragavan\\Documents\\KeyWord_Driven.xlsx");

		MySelEngine sel = new MySelEngine();

		for(int i =1; i <m2.readNumOfUsedRows(0); i++) {
			String keyword;
			String element = null;
			String input = null;


			keyword = m2.readStringFromExcel(0, i, 1);


			switch(keyword)

			{

			case "launchChromeBrowser" :sel.launchChromeBrowser();
			break;

			case "openurl1" : sel.openurl("http:www.fb.com/");
			break;

			case"entervaluebyId" : sel.enterValuebyId(element, input);
			break;
			
			case"clickbyid" : sel.clickbyId(element);
			break;

			}
		}

	}
		

}



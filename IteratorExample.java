package com.JavaTraining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("arun");
		
		list.add("prasath");

		list.add("partha");

		list.add("kumar");

		System.out.println(list);

		
		 Iterator ok=list.iterator();		//getting the Iterator 
		 while(ok.hasNext()) {				//check if iterator has the elements 
		 System.out.println(ok.next()); 	//printing the element and move to next 
		 }
		 
	}
	}



package com.xworkz.sriyana;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingArraytoArrayList {

	public static void main(String[] args) {
	String []arr={"Boston", "Dallas", "New York", "Chicago"};
	ArrayList<String> list= new ArrayList<>(Arrays.asList(arr));
   
	
	System.out.println("result :"+list);
	 
	list.add("Mumbai");
	list.add("Delhi");
	for (String str : list) {
		
	
		System.out.println(str);
	}
	}

}

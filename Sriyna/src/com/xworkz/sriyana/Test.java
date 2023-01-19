package com.xworkz.sriyana;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
	ArrayList<String> fruits=new ArrayList<>();
	
	fruits.add("apple");
	fruits.add("Apple");
	fruits.add("Appple");
	fruits.add("Applle");
	fruits.add("Applee");
	fruits.add("Aple");
	System.out.println(fruits);
	String[]arr=new String[fruits.size()];
	for (int i = 0; i <fruits.size(); i++) {
	arr[i]=fruits.get(i);	
	}
	for (String str : arr) {
		System.out.println("Array:-"+str);
	}
		
		

	}

}

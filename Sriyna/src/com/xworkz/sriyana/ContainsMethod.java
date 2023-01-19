package com.xworkz.sriyana;

import java.util.ArrayList;
import java.util.HashSet;

public class ContainsMethod {

	public static void main(String[] args) {
		   HashSet<Integer> ch = new HashSet<>();
		
		ch.add(1);
		ch.add(2);
		ch.add(3);
		ch.add(4);
		ch.add(5);
	System.out.println(ch);
	
	if(ch.contains(2)) {
		System.out.println("its contains of 2 hs");
	}else {
		System.out.println("its does not contains");
	}

	}

}

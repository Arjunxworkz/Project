package com.xworkz.sriyana;

import java.util.HashSet;
import java.util.Iterator;

public class HassetTrevers {
public static void main(String []args) {
	
	HashSet<String>hs=new HashSet<String>();
	hs.add("Aam");
	hs.add("Mango");
	hs.add("banana");
	hs.add("kela ");
	hs.add("Musammbi");
	hs.add("kelaa ");
	
	System.out.println("output :"+hs);
	
	Iterator<String>it=hs.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
	}
	
	
	
	
}
}

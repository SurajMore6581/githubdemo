package com.pack1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Collect {

	public static void main(String[] args) {

		String str = "" ;
		Scanner scan = new Scanner(System.in);

		List<String> listname = new ArrayList<String>();
		for(int i=1; i<=4; i++) {
			System.out.println("enter your name " + i + "  input");
			str=scan.next();
			listname.add(str);
			//listname.clear();
			

		}
		
		System.out.println(listname);
		
	    Set<String> newlist = new HashSet<String>(listname);
	    System.out.println(newlist);
	   boolean t = newlist.contains("suraj");
	   System.out.println(t);
	   
	   System.out.println(listname.get(3));	

	}

}

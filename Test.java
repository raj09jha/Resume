package com.cybrilla.main;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter Size of array");
	    int sizeOfArray = myObj.nextInt();
	    System.out.println("Enter values");
	    int val=0;
	    Integer[] a = new Integer[sizeOfArray];
	    for (int i = 0; i < sizeOfArray; i++) {
	    	System.out.println("Enter array Value");
	    	val = myObj.nextInt();
			a[i]= val;
		}
	    int maxVal=a[0];
	    int minVal=a[0];
	    for (Integer integer : a) {
			if(integer.intValue()<minVal)
				minVal = integer.intValue();
			if(integer.intValue()>maxVal)
				maxVal = integer.intValue();
		}
	    System.out.println("Max Value:-"+maxVal+"Min Value:-"+minVal);
	}
	
}

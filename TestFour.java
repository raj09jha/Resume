package com.cybrilla.main;

public class TestFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,6,8,9};
		int temp =23;
		int value = 0;
		for (int i = 0; i < a.length; i++) {
			value = 0;
			for (int j = i; j < a.length; j++) {
				value = a[j]+value;
				if(value==temp) {
					for (int k = i; k <= j; k++) {
						System.out.println(k);
					}
					i=a.length;
					break;
				}
			}
		}
	}
/*
 * for (int i = 0; i < a.length; i++) {
			if((i+1)==a.length) 
				break;
			if(a[i]+a[i+1]==temp)
				System.out.println("Sub array is :- "+i+" "+(i+1));
		}*/
}

package com.cybrilla.main;

import java.util.Scanner;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter Size of array");
		int sizeOfArray = myObj.nextInt();
		System.out.println("Enter values");
		int val = 0;
		Integer[] a = new Integer[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.println("Enter array Value");
			val = myObj.nextInt();
			a[i] = val;
		}
		int temp = 0;
		for (int i = 0, j = (sizeOfArray - 1); i < (sizeOfArray / 2); i++, j--) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		for (Integer integer : a) {
			System.out.println(integer.intValue());
		}
	}

}

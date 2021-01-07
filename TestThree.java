package com.cybrilla.main;

import java.util.ArrayList;
import java.util.List;

public class TestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madhavan"; 
		List<Character> uniqueList = new ArrayList<Character>();
		for (int i = 0; i < name.length(); i++) {
			if(!uniqueList.contains(name.charAt(i))) {
				uniqueList.add(name.charAt(i));
			}
		}
		System.out.println(uniqueList);
		int count = 0;
		for (Character character : uniqueList) {
			count=0;
			for (int i = 0; i < name.length(); i++) {
				if(character.charValue() == name.charAt(i))
					count++;
			}
			System.out.println("Count of "+character+" is :-"+count);
		}
	}

}

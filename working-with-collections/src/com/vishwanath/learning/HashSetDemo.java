package com.vishwanath.learning;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
HashSet<String> setOfNames = new HashSet<>();
		
		setOfNames.add("Mayank");
		setOfNames.add("Rajesh");
		setOfNames.add("Mayank");//Not added to the set
		setOfNames.add("Nikita");
		
		setOfNames.forEach(System.out::println);

	}

}

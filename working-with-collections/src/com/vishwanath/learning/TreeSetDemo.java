package com.vishwanath.learning;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
TreeSet<Integer> set = new TreeSet<>();
		
		set.add(23);
		set.add(121);
		set.add(56);
		set.add(121);
		set.add(1);
		
		System.out.println("Values in the set are : ");
		
		set.forEach(System.out::println);

	}

}

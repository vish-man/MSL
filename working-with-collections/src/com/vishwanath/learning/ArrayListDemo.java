package com.vishwanath.learning;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//list.add(780);
		
		list.add("Waleed");
		list.add("Harni");
		list.add("UMME");
		list.add("Harni");
		
		//list.add(false);
		
		System.out.println("Size of list : " + list.size());
		
		list.add("Nikita");
		//list.add(56.90);
		
		System.out.println("Now size : " + list.size());
		
		
		System.out.println("Value at index 2 is : " + list.get(2));
		
		System.out.println("List : " + list);
		
		list.remove(1);
		
		System.out.println("After deleting one object, list size :" +  list.size());
		
		System.out.println("List now looks like : " + list);
		

		System.out.println("-------------------");
		
		System.out.println("Values in list : ");

		//		Traverse throught the list using the traditional for :
//		for(int index = 0; index < list.size(); index++) {
//			System.out.println(list.get(index));
//		}
		
//		or With Iterator
//		Iterator iterator = list.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		Or java 5 enhanced for loop
//		for(String ref : list) {
//			System.out.println(ref);
//		}
		
//		Or with the java 8 forEach
		list.forEach(System.out::println);
		
		

	}

}

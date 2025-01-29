package com.mru.oops;

import java.util.ArrayList;

public class Java8Features {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(22);
		list1.add(33);
		list1.add(40);
		list1.add(50);
	
		//list.forEach(num -> System.out.println(num));
		
		//print even numbers
		list1.stream().filter(num->num%2==0).forEach(System.out::println);
		
		//print odd numbers
		list1.stream().filter(num->num%2!=0).forEach(System.out::println);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		list2.stream().map(num -> num*10).forEach(System.out::println);
	}

}

package com.mru.oops;

public class Demo3 {
public static void main(String[] args) {
	Adaptor adaptor = new Adaptor();
	Test11 obj1 = adaptor.getInstance1();
	String result1 = obj1.msg;
	System.out.println(result1);
	obj1.m1();
	
	Test12 obj2 = adaptor.getInstance2();
	String result2 = obj2.msg;
	System.out.println(result2);
	obj2.m2();
	
	
	
	

	}

}

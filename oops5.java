package com.mru.oops;

class Parent12{
	public void dbconn() {
	System.out.println("data from oracle soon..");
	}
}
class Child12 extends Parent12{
	public void dbconn() {
		System.out.println("data from mangodb soon..");
	}
}
public class oops5 {

	public static void main(String[] args) {
		Child12 obj = new Child12();
		obj.dbconn();
		
	}

}

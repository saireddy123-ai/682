package com.mru.oops;
class Test1 implements Interface1{
	@Override
	public void addition() {
		int num1 =100;
		int num2 = 50;
		int res = num1 + num2;
		System.out.println("Addition..."+res);
	}

	@Override
	public int subtraction(int num1, int num2) {
		// TODO Auto-generated method stub
		int result = num1*num2;
		System.out.println("Multiplication..."+result);
		return 0;
	}

	@Override
	public void multiplication(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int division() {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Test1 obj1 = new Test1();
		obj1.addition();
		
		int res1 = obj1.subtraction(100, 50);
		System.out.println("Subtraction..."+res1);
        obj1.multiplication(100, 50);
        
        int res2 = obj1.division();
        System.out.println("division..."+res2);
	}

}


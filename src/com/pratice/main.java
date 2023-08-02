package com.pratice;

public class main {

	public static void main(String[] args) {
		// 
		
		learing obj = new learing();
		obj.java();
		
		course obj1 = new learing();
		obj1.java();
		
		course obj2 = new course() {

			@Override
			public void java() {
				System.out.println("i am java");
				
			}
			
		};
		obj2.java();
		
		course obj3 = ()->System.out.println("i am java in lambda");
		obj3.java();
	}
}

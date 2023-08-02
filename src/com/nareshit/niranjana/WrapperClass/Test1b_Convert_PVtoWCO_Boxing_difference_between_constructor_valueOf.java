package com.nareshit.niranjana.WrapperClass;
public class Test1b_Convert_PVtoWCO_Boxing_difference_between_constructor_valueOf {
	public static void main(String[] args) {
	
		//Constructor
		Integer io1 = new Integer(5);
		Integer io2 = new Integer(5);
		System.out.println(io1==io2);
		//valueOf(-) -->cache concept/Object pooling concept applied
		Integer io3 =  Integer.valueOf(5);
		Integer io4 =  Integer.valueOf(5);
		System.out.println(io3==io4);
}
}

package com.nit.sisu.non_static;
class Non_static8
{
	void m1()
	{
		System.out.println("in m1 method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("in main method");
		//m1();		//errors
	}
}

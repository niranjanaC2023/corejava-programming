package com.nit.sisu.polymorphism;
//find out the error in this program
class Out
{
	 Out()
	{
		System.out.println("example zero-param");
	}
}
class Sample4 extends Out
{
	Sample4()
	{	
		
		System.out.println("sample zero-param");
	}
	public static void main(String[] args) 
	{
		Sample4 s1 = new Sample4();
	}
}

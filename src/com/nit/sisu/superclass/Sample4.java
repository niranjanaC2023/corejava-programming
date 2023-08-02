//find out the error in this program
package com.nit.sisu.superclass;
class Example4
{
	private Example4()
	{
		System.out.println("example zero-param");
	}
	Example4(int a)
	{
		System.out.println("example zero-param");
	}
}
class Sample4 extends Example4
{
	Sample4()
	{	
		//super();
		super(7);
		System.out.println("sample zero-param");
	}
	public static void main(String[] args) 
	{
		Sample4 s1 = new Sample4();
	}
}

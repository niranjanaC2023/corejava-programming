//find out the error in this program
package com.nit.sisu.superclass;
class Example5
{
	private Example5()
	{
		System.out.println("example zero-param");
	}
	Example5(int a)
	{
		System.out.println("Example int-param");
	}
}
class Sample5 extends Example5
{
	Sample5()
	{	
		//super();
		super(8);
		System.out.println("sample zero-param");
	}
	public static void main(String[] args) 
	{
		Sample5 s1 = new Sample5();
	}
}

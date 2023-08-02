package com.nit.sisu.polymorphism;
//find out the error in this program 
class Org
{
	Org(int a)
	{
		System.out.println("example int-param");
	}
	
	Org()
	{
		System.out.println("example non-param");
	}
}
public class Sample2 extends Org
{
	Sample2(int a)
	{	
		System.out.println("sample int-param");
	}
	public static void main(String[] args) 
	{
		Sample2 s1 = new Sample2(10);
	}
}

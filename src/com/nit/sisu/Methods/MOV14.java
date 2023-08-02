package com.nit.sisu.Methods;
class Risk
{
	void add(int a,int b)
	{
		System.out.println("Example int,int");
	}
	void add(String a,float b)
	{
		System.out.println("Example String,float");
	}
	int add(String s1,String s2)
	{
		System.out.println("Example String,String");
		return 10;
	}
}
class Sample extends Risk
{
	@Override
	void add(int x,int y)
	{
		System.out.println("Saample int,int");
	}
	float add(float a,int b)
	{
		System.out.println("Sample float,int");
		return a+b;
	}
	String add(String s1,double d)
	{
		System.out.println("Sample String,double");
		return s1+d;
	}
}
class MOV14
{
	public static void main(String[] args)
	{
		Sample s1 = new Sample();

		s1.add(10,20);
		s1.add("abc",20);
		//s1.add("abc","xyz");
		s1.add("10",20.0);
		//s1.add(10,20.0f);
	}
}

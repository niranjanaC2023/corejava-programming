package com.nit.sisu.Variables;
class Example
{
	int x=10;
	int y=20;
}
class Variable1 
{
	public static void main(String[] args) 
	{
		//primitive variable
		int p=50;
		int q=m1();
		//referenced variable
		String s1="a";
		String s2=new String("a");
		Example e1 = new Example();
		//System.out.println(x);
		//System.out.println(y);
		System.out.println(p);
		System.out.println(q);
	m1();
	
	}
	static int m1()
	{
			return 60;
	}
		
}

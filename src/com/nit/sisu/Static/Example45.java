package com.nit.sisu.Static;
class Example45
{
	
	//static int a=a;
	static int a=Example45.a;
	public static void main(String[] args) 
	{
		//int b=b;
		System.out.println("a:"+a);
		//s1System.out.println("b:"+b);
	}	
}

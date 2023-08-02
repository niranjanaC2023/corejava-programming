package com.nit.sisu.Static;
class Example38b
{
	static int a=10;
	static int b=a;
	//static int c=d;
	static int d=40;
	static int c=Example38b.d;
	public static void main(String[] args) 
	{
		System.out.println("from MM");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);	

	}
	
}

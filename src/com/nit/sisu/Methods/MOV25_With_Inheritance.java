package com.nit.sisu.Methods;
class With
{
	int x=m1();
	static int m1()
	{
		System.out.println("With m1");	
		return 50;
	}
};
class Without extends With
{
	int y=m1();
	static int m1()
	{
		System.out.println("Without m1");	
		return 60;
	}
};
class MOV25_With_Inheritance
{
	public static void main(String[] args)
	{
		Without s1 = new Without();
		System.out.println("x:"+s1.x);
		System.out.println("x:"+s1.y);
		
	}
}

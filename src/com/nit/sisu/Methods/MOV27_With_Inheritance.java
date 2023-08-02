package com.nit.sisu.Methods;
class All
{
	static int x=m1();
	static int m1()
	{
		System.out.println("All m1");
		x=50;
		return 60;
	}
};
class AllOut extends All
{
	static int x;
	static int m1()
	{
		System.out.println("AllOut m1");	
		x=70;
		return 80;
	}
};
class MOV27_With_Inheritance
{
	public static void main(String[] args)
	{
		AllOut s1 = new AllOut();
		All e1 = s1;
		System.out.println("x:"+s1.x);
		System.out.println("x:"+e1.x);
		
	}
}

package com.nit.sisu.Methods;
class Ram
{
	 int x=m1();
	 int m1()
	{
		System.out.println("Ram m1");
		x=50;
		return 60;
	}
};
class Ramesh extends Ram
{
	 int x;
	 @Override
	int m1()
	{
		System.out.println("Ramesh m1");	
		x=70;
		return 80;
	}
};
class MOV26_With_Inheritance
{
	public static void main(String[] args)
	{
		Ramesh s1 = new Ramesh();
		Ram e1 = s1;
		System.out.println("x:"+s1.x);
		System.out.println("x:"+e1.x);
		
	}
}

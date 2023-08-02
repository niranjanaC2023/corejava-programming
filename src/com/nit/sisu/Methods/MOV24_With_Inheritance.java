package com.nit.sisu.Methods;
class Taarak
{
	int x=m1();
	 int m1()
	{
		System.out.println("Taarak m1");	
		return 50;
	}
};
class Mehta extends Taarak
{
	int y=m1();
	@Override
	int m1()
	{
		System.out.println("Sample m1");	
		return 60;
	}
};
class MOV24_With_Inheritance
{
	public static void main(String[] args)
	{
		Mehta s1 = new Mehta();
		System.out.println("x:"+s1.x);
		System.out.println("x:"+s1.y);
		
	}
}

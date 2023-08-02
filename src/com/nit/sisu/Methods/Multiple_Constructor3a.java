package com.nit.sisu.Methods;
class Multiple_Constructor3a
{
	public static void main(String[] args) 
	{

		System.out.println("number of object created:"+Chun.count);

		System.out.println();
		Chun n1 = new Chun();
		Chun n2 = new Chun(4);
		Chun n3 = new Chun("M");
		Chun n4 = new Chun(6.0);

		System.out.println();
		System.out.println("number of object created:"+Chun.count);
		

	}
		
}
class Chun
{
	static int count=0;
	{
		count++;
	}
	Chun()
	{
	  System.out.println("object created by using NPC");
	}
	Chun(int a)
	{
		System.out.println("object created by using IPC");
	}
	Chun(String s)
	{
		System.out.println("object created by using SPC");
	}
	Chun(double d)
	{
		System.out.println("object created by using DPC");
	}

}

package com.nit.sisu.Methods;
class Multiple_Constructor4
{
	public static void main(String[] args) 
	{

		System.out.println();
		Hari n1 = new Hari();
		Hari n2 = new Hari(4);
		Hari n3 = new Hari("M");
		Hari n4 = new Hari(6.0);
		n1.wish();

	}
		
}
class Hari
{
	boolean executed = false;
	void wish()
	{
		if(executed)
		{
			throw new IllegalStateException("already Wished");
		}
		System.out.println("hello");
		executed = true;
	}

	Hari()
	{
	  System.out.print("object created by using NPC");
	  wish();
	}
	Hari(int a)
	{
		System.out.print("object created by using IPC");
		wish();
	}
	Hari(String s)
	{
		System.out.print("object created by using SPC");
		wish();
	}
	Hari(double d)
	{
		System.out.print("object created by using DPC");
		wish();
	}

}

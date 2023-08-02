package com.nit.sisu.Methods;
class Multiple_Constructor5
{
	public static void main(String[] args) 
	{

		System.out.println();
		Horo n1 = new Horo();
		Horo n2 = new Horo(4);
		Horo n3 = new Horo("M");
		Horo n4 = new Horo(6.0);
		n1.wish();

	}
		
}
class Horo
{
	boolean bo = false;
	void wish()
	{
		if(bo=false)
	
				System.out.println("hi");
	
		else
	
		       System.out.println("hello");
	   
	}

	Horo()
	{
	  System.out.print("object created by using Niranjana\t");
	  wish();
	}
	Horo(int a)
	{
		System.out.print("object created by using susanta\t");
		wish();
	}
	Horo(String s)
	{
		System.out.print("object created by using sisu\t");
		wish();
	}
	Horo(double d)
	{
		System.out.print("object created by using sisu\t");
		wish();
	}

}

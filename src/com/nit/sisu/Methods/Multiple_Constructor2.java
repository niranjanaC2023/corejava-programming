package com.nit.sisu.Methods;
class Multiple_Constructor2
{
	public static void main(String[] args) 
	{

		Naming n1 = new Naming();
		Naming n2 = new Naming(4);
		Naming n3 = new Naming("M");
		Naming n4 = new Naming(6.0);
		

	}
		
}
class Naming
{
	int x;
	{
		x=10;
		System.out.println("hhi");
	}
	void wish()
	{
		
		System.out.print("Hello!");
	}
	Naming()
	{
	  wish();
	  System.out.println("\tNiranjana");
	}
	Naming(int a)
	{
		wish();
		System.out.println("\tsusanta");
	}
	Naming(String s)
	{
		wish();
		System.out.println("\tsisu");
	}
	Naming(double d)
	{
		wish();
		System.out.println("\tsisu");
	}

}

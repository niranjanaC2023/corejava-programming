package com.nit.sisu.Methods;
class Multiple_Constructor
{
	public static void main(String[] args) 
	{

		Name n1 = new Name();
		Name n2 = new Name(4);
		Name n3 = new Name("M");
		Name n4 = new Name(6.0);
		

	}
		
}
class Name
{
	Name()
	{
	  System.out.print("Hi!");
	  System.out.println("\tNiranjana");
	}
	Name(int a)
	{
		System.out.print("Hello!");
		System.out.println("\tsusanta");
	}
	Name(String s)
	{
		System.out.print("Hyyye!");
		System.out.println("\tsisu");
	}
	Name(double d)
	{
		System.out.print("Hyyye!");
		System.out.println("\tsisu");
	}

}

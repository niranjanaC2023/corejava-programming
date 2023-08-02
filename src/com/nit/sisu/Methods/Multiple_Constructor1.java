package com.nit.sisu.Methods;
class Multiple_Constructor1
{
	public static void main(String[] args) 
	{

		Name n1 = new Name();
		Name n2 = new Name(4);
		Name n3 = new Name("M");
		Name n4 = new Name(6.0);
		

	}
		
}
class Names
{
	void wish()
	{
		
		System.out.print("Hello!");
	}
	Names()
	{
	  wish();
	  System.out.println("\tNiranjana");
	  
	}
	Names(int a)
	{
		wish();
		System.out.println("\tsusanta");
	}
	Names(String s)
	{
		wish();
		System.out.println("\tsisu");
	}
	Names(double d)
	{
		System.out.println("\tsisu");
		wish();
	}

}

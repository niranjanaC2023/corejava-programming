package com.nit.sisu.non_static;
class EXAMPLE29b
{
	int x=10;
	{
		System.out.println("NSB1");
	}
	EXAMPLE29b()
	{
		System.out.println("NPC");
	}
	EXAMPLE29b(int x)
	{
		System.out.println("IPC");
	}
	{
		System.out.println("NSB2");
	}
	int y=20;
	{
		System.out.println("NSB3");
	}
	
	public static void main(String[] args) 
	{
		EXAMPLE29b e1 = new EXAMPLE29b();	
	}
}

		
	
	


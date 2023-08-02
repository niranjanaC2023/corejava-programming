package com.nit.sisu.Methods;
class Multiple_Constructor3
{
	public static void main(String[] args) 
	{

		System.out.println("number of object created:"+Song.count);

		System.out.println();
		Song n1 = new Song();
		Song n2 = new Song(4);
		Song n3 = new Song("M");
		Song n4 = new Song(6.0);

		System.out.println();
		System.out.println("number of object created:"+Song.count);
		

	}
		
}
class Song
{
	static int count=0;
	Song()
	{
	 count++;
	  System.out.println("object created by using NPC");
	}
	Song(int a)
	{
		count++;
		System.out.println("object created by using IPC");
	}
	Song(String s)
	{
		  count++;
		System.out.println("object created by using SPC");
	}
	Song(double d)
	{
	    count++;
		System.out.println("object created by using DPC");
	}

}

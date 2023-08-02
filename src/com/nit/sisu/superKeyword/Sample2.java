package com.nit.sisu.superKeyword;
class Tested  //NSB always excutes before constructor..//NSB excutes some logic in every object creation..//
{
	Tested()
	{
		System.out.println("Hi ..I'm Non-arg Constructor");
	}
	 
	{
		System.out.println("Hi ..I'm NSB");
	}
		
}

class Sample2
{

	public static void main(String[]args)
	{
		Tested t1 = new Tested();
		
	}
}



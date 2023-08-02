package com.nit.sisu.non_static;
class Non_static30
{
	int x=10;
	int y=20;
	void m1()
	{
		System.out.println(this.x);
		System.out.println(this.y);
	}
	
	public static void main(String[] args) 
	{
		
		//System.out.println(this.x);
		//System.out.println(this.y);			//error

	}
}




		



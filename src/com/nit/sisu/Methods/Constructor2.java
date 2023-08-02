package com.nit.sisu.Methods;
class Constructor2 
{
	public static void main(String[] args) 
	{
		Chinku e1 = new Chinku();
		Chinku e2 = new Chinku();
		e1.setm(10);
		e1.setn(20);
		e2.setm(30);
		e2.setn(40);
		e1.display();
		e2.display();
		e1.setm(15);
		e1.setn(16);
		e2.setm(18);
		e2.setn(19);
		e1.display();
		e2.display();

	}
}
class Chinku
{
	int x;
	int y;
void setm(int x)
	{
		this.x=x;

	}
void setn(int y)
	{
		this.y=y;
	}
void display()
	{
		System.out.println(x);				//(output: 10,20,30,40,15,16,18,19)
		System.out.println(y);
	}
}

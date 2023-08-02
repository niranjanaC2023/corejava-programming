package com.nit.sisu.Methods;
class Constructor1 
{
	public static void main(String[] args) 
	{
		Home e1 = new Home();
		Home e2 = new Home();
		e1.set(10,20);
		e2.set(30,40);
		e1.display();
		e2.display();
		e1.set(15,16);
		e2.set(18,19);
		e1.display();
		e2.display();

	}
}
class Home
{
	int x;
	int y;
void set(int x,int y)
	{
		x=x;
		y=y;

	}
void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
}

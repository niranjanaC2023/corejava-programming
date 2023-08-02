package com.nit.sisu.polymorphism;
class Mango
{
	int x=10;
	int y=20;
}
class Fruit extends Mango
{
	int p=30;
	int q=40;
}
class Sample7
{

	public static void main(String[] args) 
	{
		Fruit b1 = new Fruit();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.p);
		System.out.println(b1.q);
	}
}

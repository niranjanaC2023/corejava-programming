package com.nit.sisu.polymorphism;
//Static execution flow
class Parent
{
	static void m1()
	{
		System.out.println("A m1");
	}
	static void m2()
	{
		System.out.println("A m2");
		m1();
	}
}
class Child extends Parent
{
	static void m1()
	{
		System.out.println("B m1");
	}
	void m3()
	{
		System.out.println("B m3");
		m1();
		super.m2();
	}
}
class Childish extends Child
{
	static void m2()
	{
		System.out.println("C m2");
		//m4();	//m4() not avavilable in parent class
	}
}
public class D_Sample11 extends Childish
{
	static void m1()
	{
		System.out.println("D m1");
	}
	static void m2()
	{
		System.out.println("D m2");
	}
	static void m4()
	{
		System.out.println("D m4");
	}

	public static void main(String[]args)
	{
		D_Sample11 d1 = new D_Sample11();
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m4();
	}
}

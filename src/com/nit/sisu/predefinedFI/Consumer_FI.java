package com.nit.sisu.predefinedFI;
/*
import java.util.function.*;
interface Test
{
	public abstract void m1(String s);
}
class Test1 implements Test
{
	 public void m1(String s)
	{
		System.out.println("hi");
	}
}

public class Consumer_FI
{
	public static void main(String[] args)
	{
		Test1 t1 = new Test1();
		t1.m1("sisu");	//hi
	}
}
*/

//WAP to find length of a string by using Functional Functional interface with Lambda Exp
import java.util.function.Consumer;
class Consumer_FI
{
	public static void main(String[] args)
	{
		Consumer<String> c = s->System.out.println(s);
		c.accept("Niranjana");
		c.accept("Niranjana charty");
	}
}


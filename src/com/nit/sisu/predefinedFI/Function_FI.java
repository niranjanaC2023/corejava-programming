//WAP to find square of number by using interface
package com.nit.sisu.predefinedFI;
/*
interface Test
{
	public abstract int m1(int x);
}
class Test1 implements Test
{
	public int m1(int x)
	{
		int y;
		y=x*x;
		return y;
	}	
	
}
public class Function_FI
{
	public static void main(String[] args)
	{
		Test1 t1 = new Test1();
		System.out.println(t1.m1(6));//36
	}
}
*/
/*
//WAP to find square of number by using using Functional interface with Lambda Exp

interface Test
{
	public abstract int m1(int x);
}
public class Function_FI
{
	public static void main(String[] args)
	{
		Test t1 = x->x*x;;
		System.out.println(t1.m1(6));
	}
}
*/
/*

//WAP to find square of number by using using Functional Functional interface with Lambda Exp
import java.util.function.*;
class Function_FI
{
	public static void main(String[] args)
	{
		Function<Integer,Integer> f = x->x*x;
		System.out.println(f.apply(5));
		System.out.println(f.apply(6));
	}
}
*/
/*
//WAP to find length of a string by using Functional Functional interface with Lambda Exp
import java.util.function.*;
class Function_FI
{
	public static void main(String[] args)
	{
		Function<String,Integer> f = x->x.length();
		System.out.println(f.apply("Hello"));
		System.out.println(f.apply("sisu"));
	}
}
*/
/*
//WAP to get the uppercase of a string by using Functional Functional interface with Lambda Exp
import java.util.function.*;
class Function_FI
{
	public static void main(String[] args)
	{
		Function<String,String> f = x->x.toUpperCase();
		System.out.println(f.apply("Hello"));
		System.out.println(f.apply("sisu"));
	}
}
*/
//=================================
//Q) Difference betwen "andThen" and "compose"
import java.util.function.Function;
class Function_FI
{
	public static void main(String[] args)
	{
		Function<Integer,Integer> f1=i->2*i;
		Function<Integer,Integer> f2=i->i*i*i;
		System.out.println(f1.andThen(f2).apply(2));//64
		System.out.println(f1.compose(f2).apply(2));//16
	}
}
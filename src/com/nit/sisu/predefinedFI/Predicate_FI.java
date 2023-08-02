package com.nit.sisu.predefinedFI;
//WAP to find a number is greater than 10 or not using interface
/*
interface Test
{
	public abstract boolean test(int x);
}
class Test1 implements Test
{
	public boolean test(int x)
	{
		if (x>10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
}
public class Predicate_FI
{
	public static void main(String[] args)
	{
		Test1 t1 = new Test1();
		System.out.println(t1.test(26));//true
	}
}
*/
//WAP to find a number is greater than 10 or not using Functional interface with Lambda Exp
/*
interface Test
{
	public abstract boolean test(int x);
}
public class Predicate_FI
{
	public static void main(String[] args)
	{
		Test t1 = x->x>10;
		System.out.println(t1.test(26));
	}
}
*/
/*
//WAP to find a number is greater than 10 or not using Predicate Functional interface with Lambda Exp
import java.util.function.*;
class Predicate_FI
{
	public static void main(String[] args)
	{
		Predicate<Integer> p = i->i>10;
		System.out.println(p.test(27));
		System.out.println(p.test(8));
	}
}
*/
//=============================================================================================
/*
//WAP to find a number is evenn or not using Predicate Functional interface with Lambda Exp
import java.util.function.*;
class Predicate_FI
{
	public static void main(String[] args)
	{
		Predicate<Integer> p = i->i%2==0;
		System.out.println(p.test(27));
		System.out.println(p.test(8));
	}
}
*/
//=========================================================================================
//WAP to find a String startWith letter "k" using Predicate Functional interface with Lambda Exp
/*
import java.util.function.*;
class Predicate_FI
{
	public static void main(String[] args)
	{
		String[] s = {"kajol", "mouni", "trupti"};
		Predicate<String> p = s1->s1.charAt(0)=='k';
		for(String s2:s)
		{
			if(p.test(s2))
			{
				System.out.println(s2);
			}
		}
	}
}
*/
//WAP for valid login-password using Predicate Functional interface with Lambda Exp
import java.util.Scanner;
import java.util.function.Predicate;
class User
{
	String username;
	String pwd;
	User(String username,String pwd)
	{
		this.username=username;
		this.pwd=pwd;
	}
}
class Predicate_FI
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter user name:");
		String username = scn.next();
		System.out.println("enter pw name:");
		String pwd = scn.next();
		User user1 = new User(username,pwd);
		Predicate<User> p = user->user.username.equals("sisu") && user.pwd.equals("susi");
		if(p.test(user1))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("in-valid");
		}
	}
}
package com.nit.sisu.sh.methods;
//reverse a String
/*
public class StringReverse
{
	public static void main(String[] args)
	{
		String s1 = "Hello";
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.append(s1));
		sb.reverse();
		System.out.println(sb); //olleH
	}
}
*/
//reverse a string using for-loop
public class StringReverse
{
	public static void main(String[] args)
	{
		String s1 = "Hello";
		String rev = "";
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev = rev+s1.charAt(i);
		}
		System.out.println(rev); //olleH
	}
}






/*import java.util.Scanner;
public class String_Pallindrome
{
	public static void main(String[] args)
	{
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a string::");
	String s1 = scn.nextLine();
	System.out.println(s1.length());
	int s2 = s1.length();
	String rev = " ";
	for(int i=s2-1; i>=0;i--)
	{
	rev = rev+s1.charAt(i);
}
	if (s1.equals(rev))
		System.out.println(s1+" is a pallindrome");
	else
		System.out.println(s1+"is not apallindrome");
	
	}
}*/
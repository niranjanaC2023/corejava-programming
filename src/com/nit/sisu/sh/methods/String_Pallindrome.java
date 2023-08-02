//check string is pallindrome or not
package com.nit.sisu.sh.methods;
import java.util.Scanner;
public class String_Pallindrome
{
	public static void main(String[] args)
	{
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a string::");
	String s1 = scn.nextLine();
	String rev = "";
	for(int i=s1.length()-1; i>=0;i--)
	{
	rev = rev+s1.charAt(i);
	}
	if (s1.equals(rev))
		System.out.println(s1+" is a pallindrome");
	else
		System.out.println(s1+" is not a pallindrome");
	}
}

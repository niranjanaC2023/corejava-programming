package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Check_String_EmptyOrNot //public boolean isEmpty()
{
	public static void main(String[] args) 
	{
		String s1 = "";
		System.out.println("is s1 empty:"+s1.isEmpty());

		String s2 = " ";
		System.out.println("is s2 empty:"+s2.isEmpty());

		String s3 = "a";
		System.out.println("is s3 empty:"+s3.isEmpty());

		String s4 = new String();
		System.out.println("is s4 empty:"+s4.isEmpty());

		String s5 = new String("");
		System.out.println("is s5 empty:"+s5.isEmpty());

		String s6 = new String(" ");
		System.out.println("is s6 empty:"+s6.isEmpty());

		String s7 = new String("a");
		System.out.println("is s7 empty:"+s7.isEmpty());

		String s8 = null;
		//System.out.println("is s8 empty:"+s8.isEmpty());	//RE: NPE

		String s9;
		//System.out.println("is s9 empty:"+s9.isEmpty());

		Scanner scn = new Scanner(System.in);
		System.out.println("\n Enter string1:");
		System.out.println(scn.nextLine().isEmpty());


		System.out.println("\nEnter string2:");
		System.out.println(scn.nextLine().isEmpty());

		System.out.println("\nEnter string3:");
		System.out.println(scn.nextLine().isEmpty());
	}
}

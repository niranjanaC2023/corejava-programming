package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Check_String_Length		//public int length()
{
	public static void main(String[] args) 
	{
		

		String s1 = "";
		System.out.println("is s1 empty:"+s1.length());

		String s2 = " ";
		System.out.println("is s2 empty:"+s2.length());

		String s3 = "ab";
		System.out.println("is s3 empty:"+s3.length());

		String s4 = new String();
		System.out.println("is s4 empty:"+s4.length());

		String s5 = new String("");
		System.out.println("is s5 empty:"+s5.length());

		String s6 = new String(" ");
		System.out.println("is s6 empty:"+s6.length());

		String s7 = new String("ab");
		System.out.println("is s7 empty:"+s7.length());

		String s8 = null;
		System.out.println("is s8 empty:"+s8.length());  //RE:NPE

		String s9="null";
		System.out.println("is s9 empty:"+s9.length());  //RE:NPE

		String s10;											//value not initialized
		//System.out.println("is s10 empty:"+s10.length());

		
		//System.out.println("is s11 length:"+s11.length());  //RE:NPE
	    //System.out.println("is s11 length:"+s11.isEmpty()); //RE:NPE


		Scanner scn = new Scanner(System.in);
		System.out.println("\n Enter string1:");
		System.out.println("you entered"+scn.nextLine().length()+"characters");


		System.out.println("\nEnter string2:");		
		System.out.println("you entered"+scn.nextLine().length()+"characters");


		System.out.println("\nEnter string:");
		System.out.println("you entered"+scn.nextLine().length()+"characters");
		

		String s12 = "Hari";
		String[] s13 =  {"Hari","NIT"};
		//System.out.println(s12.length);  //STRING TYPE WE NEED METHOD
		System.out.println(s12.length());  // ARRAY TYPE WE DON'T NEED METHOD
		System.out.println(s13.length);
		//System.out.println(s13.length());

	}

	static String s11;
}

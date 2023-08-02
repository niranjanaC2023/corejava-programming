package com.nit.sisu.sh.methods;
class String_Constructor	// 8 constructor of string class out of 15
{
	
	public static void main(String[] args) 
	{
		//1.String()
		String s1 = new String();
		System.out.println(s1);

		//2.String(String Value)
		String s2 = "abc";
		String s3 = new String(s2);	// string copy
		String s4 = new String("bbc");	//creating string with string literl
		String s5 = s4;	// string assignment
		System.out.println("s2:"+s2);		//s2:abc
		System.out.println("s3:"+s3);		 //s3:abc										
		System.out.println("s4:"+s4);	   //s3:bbc
		System.out.println(s2==s3);			//false
		System.out.println(s4==s5);

		//3.String(StringBuffer sb)
		//4.String(StringBuilder sb)

		//5.String(char[]ch)
		char[] ch = {'a','b','c','d','e','f'};
		String s6 = new String(ch);
		System.out.println("s6:"+s6);

		//6.String(char[] ch,int offset,int count)
		char[] ch1 =  {'a','b','c','d','e','f'};
		String s7 = new String(ch,2,3);
		System.out.println("s7:"+s7);


		//7.String(byte[]b)
		byte[] b = {97,98,99};
		String s8 = new String(b);
		System.out.println(s8);

		//8.String(byte[] b,int offset,int count)
		byte[] b1 = {97,98,99};
		String s9 = new String(b,1,1);
		System.out.println("s9:"+s9);

		
		
	}
}

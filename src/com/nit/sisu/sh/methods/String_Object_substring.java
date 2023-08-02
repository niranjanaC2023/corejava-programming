package com.nit.sisu.sh.methods;
class String_Object_substring
{
	public static void main(String[] args) 
	{
		String s1 = "Java Programming Language";
		System.out.println(s1.substring(5));
		System.out.println();

		System.out.println(s1.substring(5,11));
		System.out.println();

		System.out.println(s1.substring(5,12));
		System.out.println();

		System.out.println(s1.substring(5,5));
		System.out.println();

		//System.out.println(s1.substring(12,5));	//RE:
		System.out.println();

		//System.out.println(s1.substring(-1,12));	//RE:
		System.out.println();

		//System.out.println(s1.substring(4,27));	//RE:
		System.out.println();

		System.out.println(s1.substring(5,25));
		System.out.println();

		//System.out.println(s1.substring(5,26));	//RE:StringIndexOutOfBoundsException
		System.out.println();

		String s2 = "Java Programming Language";
		System.out.println(s2.substring(5,12));
		System.out.println();
	

		int start = s2.indexOf("Program");
		int end = start+7;
		System.out.println(s2.substring(start,end));
	}
}

		
	

		
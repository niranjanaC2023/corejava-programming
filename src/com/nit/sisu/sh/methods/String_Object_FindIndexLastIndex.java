package com.nit.sisu.sh.methods;
class String_Object_FindIndexLastIndex  	
{
	public static void main(String[] args) 
	{
		String s1 = "Java Programming Language";
		System.out.println(s1.length());
		System.out.println();

		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println();
	
		
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.lastIndexOf('A'));
		System.out.println(s1.lastIndexOf('g'));
		System.out.println();
	
		
		System.out.println(s1.indexOf("Program"));
		System.out.println(s1.lastIndexOf("Program"));
		System.out.println();
	
		
		System.out.println(s1.indexOf('a',5));
		System.out.println(s1.lastIndexOf('a',5));
		System.out.println();
	
		
		System.out.println(s1.indexOf('a',1));
		System.out.println(s1.lastIndexOf('a',1));
		System.out.println();
	
		
		System.out.println(s1.indexOf('a',0));
		System.out.println(s1.lastIndexOf('a',0));
		System.out.println();
	
		
		System.out.println(s1.indexOf('a',24));
		System.out.println(s1.lastIndexOf('a',24));
		System.out.println();
	
		
		System.out.println(s1.indexOf('a',30));
		System.out.println(s1.lastIndexOf('a',30));
		System.out.println();
	
		
		System.out.println(s1.indexOf('a',-5));
		System.out.println(s1.lastIndexOf('a',-5));
		System.out.println();
	
		String s2="javaHariKrishna";
		System.out.println(s2.indexOf("hari"));

		String s3 = s2.toLowerCase();
		System.out.println(s3.indexOf("hari"));
		System.out.println(s2);
		System.out.println(s3);
	}
}

		
	

		
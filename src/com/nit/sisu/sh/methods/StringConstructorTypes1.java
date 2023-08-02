package com.nit.sisu.sh.methods;
class StringConstructorTypes1 
{
	public static void main(String[] args) 
	{
		String s2="abc";		
		System.out.println(s2);
		
		String s3=new String(s2);
		System.out.println(s3);

		String s4 = new String("bbc");
		System.out.println(s4);

		String s5 = s4;
		System.out.println(s5);

		System.out.println(s2==s3);
		System.out.println(s4==s5);
	}
}

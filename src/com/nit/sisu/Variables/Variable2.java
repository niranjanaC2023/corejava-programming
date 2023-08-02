package com.nit.sisu.Variables;
class Variable2 
{
	public static void main(String[] args) 
	{
		int a=50;
		System.out.println("a:"+a);
		
		a=70;
		System.out.println("a:"+a);
		

		Variable2 v2 = new Variable2();
		System.out.println("v2:"+v2);

		v2=new Variable2();
		System.out.println("v2:"+v2);

		Variable2 v3 = new Variable2();
		System.out.println("v3:"+v3);
	}
}	

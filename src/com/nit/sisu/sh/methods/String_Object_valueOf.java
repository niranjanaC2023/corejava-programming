package com.nit.sisu.sh.methods;
class String_Object_valueOf	//operation 17	
{
	public static void main(String[] args) 
	{

		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.67));
		System.out.println(String.valueOf('a'));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf("abc"));
		System.out.println(String.valueOf(new char[]{'a','b'}));
		System.out.println(String.valueOf(null));
		System.out.println(String.valueOf((String)null));
		System.out.println(String.valueOf((A1)null));
		System.out.println(String.valueOf(new A1()));
		System.out.println(String.valueOf(new B1()));
		Integer.toString(10);
		
	}
}
class A1
{
}
class B1
{
		@Override
		public String toString()
		{
			return "HI";
		}
}
class Examples
{
		int x;
		Examples(int x)
		{
			this.x=x;
		}
	String m1()
	{
		return
		//""+x;
		//Integer.toString(x);
		String.valueOf(x);
	}
}
		
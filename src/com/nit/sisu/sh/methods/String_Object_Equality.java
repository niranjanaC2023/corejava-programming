package com.nit.sisu.sh.methods;

class String_Object_Equality   //case or without case	
{
	public static void main(String[] args) 
	{
		String s11 = "a";
		String s2 = "a";
		String s3 = new String("a");
		String s4 = new String("a");
		
		StringBuffer sb1 = new StringBuffer("a");
		StringBuffer sb2 = new StringBuffer("a");
		
		System.out.println(s11==s2);
		System.out.println(s3==s4);
		System.out.println(sb1==sb2);
		System.out.println();

		System.out.println();

		System.out.println(s11.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(sb1.equals(sb2));

		String s5 = "a"; 
		String s6 = "A";
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));

		Example e1 = new Example(5);
		Example e2 = new Example(5);
		Example e3 = new Example(6);
		Example e4=e3;
		System.out.println(e1==e2);
		System.out.println(e2==e3);
		System.out.println(e3==e4);

		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e4));

		Sample s1 = new Sample();
		//System.out.println(e1==s1);
		System.out.println(e1.equals(s1));
		System.out.println(s1.equals(e1));
		System.out.println(s1==null);
		System.out.println(s1.equals(null));
		System.out.println(s1==null);
		System.out.println(s1.equals(null));
		System.out.println(e1==null);
		System.out.println(e1.equals(null));
	}
}
class Example
{
	int x;
	Example(int x)
	{
		this.x=x;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Example)
		{
			Example e = (Example)obj;
			return (this.x==e.x);
		}
		return false;
	}
}
class Sample
{
}
		
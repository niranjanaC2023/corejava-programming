package com.nit.sisu.sh.methods;

public final class ImmutableClass
{
	final  String empname;
	public ImmutableClass(String empname)
	{
		this.empname=empname;
	}
	public static void main(String[] args)
	{
		ImmutableClass i1 = new ImmutableClass("sisu");
		System.out.println(i1);
		System.out.println(i1.empname);
		
	}
}


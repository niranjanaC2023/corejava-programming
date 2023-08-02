package com.nit.sisu.dp;
public class SingletonByUsingNew
{
	private static SingletonByUsingNew INSTANCE;
	private SingletonByUsingNew()
	{
		System.out.println("Constructor");
	}
	public static SingletonByUsingNew factoryMethod()
	{
		if(INSTANCE==null)
		INSTANCE=new SingletonByUsingNew();
		return INSTANCE;
	}
		
	public static void main(String[] args) 
	{
		SingletonByUsingNew s1 = SingletonByUsingNew.factoryMethod();
		System.out.println(s1);
		SingletonByUsingNew s2 = SingletonByUsingNew.factoryMethod();
		System.out.println(s2);
//**********************************************
		System.out.println(s1.hashCode()==s2.hashCode());
		System.out.println(s1==s2);
	}
}

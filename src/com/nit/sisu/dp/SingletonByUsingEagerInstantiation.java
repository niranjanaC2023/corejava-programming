package com.nit.sisu.dp;
public class SingletonByUsingEagerInstantiation
{
	private static SingletonByUsingEagerInstantiation INSTANCE=new SingletonByUsingEagerInstantiation();
	private SingletonByUsingEagerInstantiation()
	{
		System.out.println("Constructor");
	}
	public static SingletonByUsingEagerInstantiation factoryMethod()
	{
		//if(INSTANCE==null)
		//INSTANCE=new SingletonByUsingNew();
		return INSTANCE;
	}
		
	public static void main(String[] args) throws Exception
	{
		Class.forName("SingletonByUsingEagerInstantiation");
//***********************************************************************
	}
}

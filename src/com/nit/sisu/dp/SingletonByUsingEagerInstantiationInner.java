package com.nit.sisu.dp;
public class SingletonByUsingEagerInstantiationInner
{
	public static class InnerClass
	{
		private static SingletonByUsingEagerInstantiationInner INSTANCE=new SingletonByUsingEagerInstantiationInner();
	}
	private SingletonByUsingEagerInstantiationInner()
	{
		System.out.println("Constructor");
	}
	public static SingletonByUsingEagerInstantiationInner factoryMethod()
	{
		return InnerClass.INSTANCE;
	}
		
	public static void main(String[] args) throws Exception
	{
		Class.forName("SingletonByUsingEagerInstantiationInner");
		System.out.println("main class");
	}
}

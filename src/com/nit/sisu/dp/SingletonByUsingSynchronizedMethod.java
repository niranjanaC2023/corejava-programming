package com.nit.sisu.dp;
public class SingletonByUsingSynchronizedMethod
{
	private static SingletonByUsingSynchronizedMethod INSTANCE;
	private SingletonByUsingSynchronizedMethod()
	{
		System.out.println("Constructor");
	}
	public static synchronized SingletonByUsingSynchronizedMethod factoryMethod()
	{
		if(INSTANCE==null)
		INSTANCE=new SingletonByUsingSynchronizedMethod();
		return INSTANCE;
	}
		
	public static void main(String[] args) throws Exception
	{
		SingletonByUsingSynchronizedMethod s1 = SingletonByUsingSynchronizedMethod.factoryMethod();
		System.out.println("main class");
		System.out.println(s1);
		SingletonByUsingSynchronizedMethod s2 = SingletonByUsingSynchronizedMethod.factoryMethod();
		System.out.println("main class");
		System.out.println(s2);
	}
}

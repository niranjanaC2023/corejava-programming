package com.nit.sisu.dp;
public class SingletonByUsingSynchronizedBlock
{
	private static SingletonByUsingSynchronizedBlock INSTANCE;
	private SingletonByUsingSynchronizedBlock()
	{
		System.out.println("Constructor");
	}
	public static SingletonByUsingSynchronizedBlock factoryMethod()
	{
		synchronized(SingletonByUsingSynchronizedBlock.class)
		{
		if(INSTANCE==null)
		INSTANCE=new SingletonByUsingSynchronizedBlock();
		return INSTANCE;
		}
	}
		
	public static void main(String[] args) throws Exception
	{
		SingletonByUsingSynchronizedBlock s1 = SingletonByUsingSynchronizedBlock.factoryMethod();
		System.out.println("main class");
		System.out.println(s1.hashCode());
		SingletonByUsingSynchronizedBlock s2 = SingletonByUsingSynchronizedBlock.factoryMethod();
		System.out.println("main class");
		System.out.println(s2.hashCode());
	}
}

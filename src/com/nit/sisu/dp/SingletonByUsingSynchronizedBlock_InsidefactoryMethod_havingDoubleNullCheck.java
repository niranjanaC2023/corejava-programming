package com.nit.sisu.dp;
public class SingletonByUsingSynchronizedBlock_InsidefactoryMethod_havingDoubleNullCheck
{
	private static SingletonByUsingSynchronizedBlock_InsidefactoryMethod_havingDoubleNullCheck INSTANCE;
	private SingletonByUsingSynchronizedBlock_InsidefactoryMethod_havingDoubleNullCheck()
	{
		System.out.println("Constructor");
	}
	public static SingletonByUsingSynchronizedBlock_InsidefactoryMethod_havingDoubleNullCheck factoryMethod()
	{
		if(INSTANCE==null)
		{
			synchronized(SingletonByUsingSynchronizedBlock_InsidefactoryMethod_havingDoubleNullCheck.class)
			{
			if(INSTANCE==null)
			INSTANCE=new SingletonByUsingSynchronizedBlock_InsidefactoryMethod_havingDoubleNullCheck();
			return INSTANCE;
			}
		}
		return INSTANCE;
	}
		
	public static void main(String[] args) 
	{
		SingletonByUsingSynchronizedBlock_InsidefactoryMethod_havingDoubleNullCheck s1 = SingletonByUsingSynchronizedBlock_InsidefactoryMethod_havingDoubleNullCheck.factoryMethod();
		System.out.println("main class");
		System.out.println(s1.hashCode());
		SingletonByUsingSynchronizedBlock_InsidefactoryMethod_havingDoubleNullCheck s2 = SingletonByUsingSynchronizedBlock_InsidefactoryMethod_havingDoubleNullCheck.factoryMethod();
		System.out.println("main class");
		System.out.println(s2.hashCode());
	}
}

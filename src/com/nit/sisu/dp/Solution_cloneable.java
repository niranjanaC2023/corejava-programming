//Solution :Using Cloneable(I) interface, we can create singleton java class objects
package com.nit.sisu.dp;
class Car implements Cloneable
{
	@Override
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class Bus extends Test
{
	private static Bus INSTANCE ;
	private Bus()
	{
		System.out.println("0-param constructor");
	}
	public static Bus factoryMethod()
	{
			if(INSTANCE==null)
			INSTANCE=new Bus();
			return Bus.INSTANCE;
	}
	@Override
	public Object clone()throws CloneNotSupportedException
	{
		throw new RuntimeException("Object is already created");
	}
		
}
public class Solution_cloneable
{
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Bus t1 = Bus.factoryMethod();
		System.out.println(t1);
		Bus t2 = (Bus)t1.clone();
		System.out.println("clone object is created");
		System.out.println(t1.hashCode()+" "+t2.hashCode());
		System.out.println(t1==t2);
		//System.out.println(t1.equals()==t2.equals());//not allowed
		
	}
}
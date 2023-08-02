//Problems :Using Cloneable(I) interface, we can create multiple objects
package com.nit.sisu.dp;
class Test implements Cloneable
{
	@Override
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class Test1 extends Test
{
	private static Test1 INSTANCE ;
	private Test1()
	{
		System.out.println("0-param constructor");
	}
	public static Test1 factoryMethod()
	{
			if(INSTANCE==null)
			INSTANCE=new Test1();
			return Test1.INSTANCE;
	}
}
public class Problems_Cloneable
{
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Test1 t1 = Test1.factoryMethod();
		System.out.println(t1);
		Test1 t2 = (Test1)t1.clone();
		System.out.println("clone object is created");
		System.out.println(t1.hashCode()+" "+t2.hashCode());
		System.out.println(t1==t2);
		//System.out.println(t1.equals()==t2.equals());//not allowed
		
	}
}
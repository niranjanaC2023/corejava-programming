//Using Reflection API , we can access private member from outer class..and create multiple objects
package com.nit.sisu.dp;
import java.lang.reflect.Constructor;
class Printer1
{
	public static Printer1 INSTANCE = new Printer1();
	private Printer1()
	{
		if(INSTANCE!=null)
			throw new RuntimeException("Object already created");
		System.out.println("0-param constructor");
	}
	public static Printer1 factoryMethod()
	{
		return INSTANCE;
	}
	
}
public class  ReflectionAPI_Solution
{
	public static void main(String[] args) 
	{
		Printer1 p1 = Printer1.factoryMethod();
		System.out.println(p1);
		System.out.println();
		try{
		Class c = p1.getClass();
		System.out.println(c);
		System.out.println();
		//Access constructor of Printer1 class
		Constructor cons[] =c.getDeclaredConstructors();
		cons[0].setAccessible(true);			
		//create object using accessed private constructor
		Printer1 p2 = (Printer1)cons[0].newInstance();
		System.out.println(p2.hashCode());
		System.out.println();
		Printer1 p3 = (Printer1)cons[0].newInstance();
		System.out.println(p3.hashCode());
		}
		catch(InstantiationException ie)
		{
				ie.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}

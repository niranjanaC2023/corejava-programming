//Using Reflection API , we can access private member from outer class..and create multiple objects
package com.nit.sisu.dp;
import java.lang.reflect.Constructor;
class Printer
{
	public static Printer INSTANCE = new Printer();
	private Printer()
	{
		System.out.println("0-param constructor");
	}
	public static Printer factoryMethod()
	{
		return INSTANCE;
	}
	
}
public class  ReflectionAPI
{
	public static void main(String[] args) 
	{
		Printer p1 = Printer.factoryMethod();
		System.out.println(p1);
		System.out.println();
		try{
		Class c = p1.getClass();
		System.out.println(c);
		System.out.println();
		//Access constructor of Printer class
		Constructor cons[] =c.getDeclaredConstructors();
		cons[0].setAccessible(true);			
		//create object using accessed private constructor
		Printer p2 = (Printer)cons[0].newInstance();
		System.out.println(p2.hashCode());
		System.out.println();
		Printer p3 = (Printer)cons[0].newInstance();
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

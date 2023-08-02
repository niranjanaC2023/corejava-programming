package com.nit.sisu.Methods;
class Modify_data4
{
	public static void main(String[] args) 
	{
		 Chair s1 = new Chair();
		Chair s2 = new Chair();
		
		s1.display();
		s2.display();
		
		System.out.println("insert data in s1");
		s1.set(1);
		s1.set("sisu","html");
		s1.set(2000);
		s1.display();
		
		System.out.println("insert data in s2");
		s2.set(2);
		s2.set("susanta","php");
		s2.set(4000);
		s2.display();
		
		System.out.println();
		System.out.println("modify data in s1");
		s1.set(1);
		s1.set("sisu","css");
		s1.set(3000);
		s1.display();
		
		System.out.println();
		System.out.println("modify data in s2");
		s2.set(2);
		s2.set("susanta","oracle");
		s2.set(5000);
		s2.display();
	}
}
class Chair
{
	int Sno;
	String Sname;
	String Scourse;
	double Sfee;
void set(int sno)
	{
		this.Sno=sno;
	}
void set(String sname,String scourse)
	{
		this.Sname=sname;
		this.Scourse=scourse;
	}

	/*void set(String scourse)
	{
		this.Scourse=scourse;
	} */

void set(double sfee)
	{
		this.Sfee=sfee;
	}
void display()
	{
		System.out.println(Sno);
		System.out.println(Sname);
		System.out.println(Scourse);
		System.out.println(Sfee);
		

	}
}


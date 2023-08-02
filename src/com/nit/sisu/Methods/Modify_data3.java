package com.nit.sisu.Methods;
class Modify_data3
{
	public static void main(String[] args) 
	{
		Hunk s1 = new Hunk();
		Hunk s2 = new Hunk();
		
		s1.display();
		s2.display();
		
		System.out.println("insert data in s1");
		s1.set(1,"sisu","html",2000);
		
		System.out.println("insert data in s2");
		s2.set(2,"sisu","php",4000);
		
		s1.display();
		s2.display();
		
		System.out.println();
		System.out.println("modify data in s1");
		s1.set(1,"sisu","css",3000);
		
		System.out.println();
		System.out.println("modify data in s2");
		s2.set(2,"sisu","oracle",5000);
		s1.display();
		s2.display();
	}
}
class Hunk
{
	int Sno;
	String Sname;
	String Scourse;
	double Sfee;
void set(int sno,String sname, String scourse,double sfee)
	{
		this.Sno=sno;
		this.Sname=sname;
		this.Scourse=scourse;
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


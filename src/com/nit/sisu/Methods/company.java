package com.nit.sisu.Methods;
//Develop a program to create real world object employee in a programming world with the properties Eno,Ename,Esal,Eemail,Emobno.
//Initialize Eno,Ename,Esal vua constructor. Except for Eno the remain app properties define setter() for modifying and initializing.
//for all properties define getter() and display().create main method class one emplyee object initialize with some initial value .
//Increase salary of an this employee is 30%.Display the updated salary ?

class  company
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(101,"sisu",99999);
		e1.display();

		System.out.println();
		e1.setB("manager");
		e1.setD("niranjanacharty2013@gmail.com");
		e1.setE(9583172160L);
		e1.display();
			
		System.out.println();
		System.out.println("name:\t"+e1.getA());
		System.out.println("dept:\t"+e1.getB());
		System.out.println("sal:\t"+e1.getC());
		System.out.println("email:\t"+e1.getD());
		System.out.println("mobno:\t"+e1.getE());
	
	
	
	}
}
class Employee
{
	Employee(int Eno,String Ename,double Esal)
	{
		this.Eno=Eno;
		this.Ename=Ename;
		this.Esal=Esal;
	}
	int Eno;
	String Ename;
	String Edept;
	double Esal;
	String Eemail;
	long Emobno;

void setA(String name)
	{
		this.Ename=name;
	}
String getA()
	{
		return Ename;
	}
void setB(String dept)
	{
		this.Edept=dept;
	}
String getB()
	{
		return Edept;
	}

void setC(double sal)
	{
		this.Esal=sal;
	}
double getC()
	{
		return Esal;
	}


void setD(String email)
	{
		this.Eemail=email;
	}
String getD()
	{
		return Eemail;
	}
void setE(long mobno)
	{
		this.Emobno=mobno;
	}
long getE()
	{
		return Emobno;
	}
void display()
	{
		System.out.println(Eno);
		System.out.println(Ename);
		System.out.println(Edept);
		System.out.println(Esal);
		System.out.println(Eemail);
		System.out.println(Emobno);
	}

			

}

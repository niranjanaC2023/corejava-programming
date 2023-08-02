package com.nit.sisu.Methods;
class  Constructor5
{
	public static void main(String[] args) 
	{
		Junk s1 = new Junk(101,"sisu","core java",2000);

		System.out.println("Sno\t"+s1.getA());
		System.out.println("Sname\t"+s1.getB());
		System.out.println("Course\t"+s1.getC());
		System.out.println("Fee\t"+s1.getD()); 

	}
}
class Junk
{
	Junk(int Sno,String Sname,String Course,double Fee)
	{
		this.Sno=Sno;
		this.Sname=Sname;
		this.Course=Course;
		this.Fee=Fee;
	}
	int Sno;
	String Sname;
	String Course;
	double Fee;
void setA(int sno)
	{
		this.Sno=sno;
	}
int getA()
	{
		return Sno;
	}

void setB(String sname)
	{
		this.Sname=sname;
	}
String getB()
	{
		return Sname;
	}

void setC(String course)
	{
		this.Course=course;
	}
String getC()
	{
		return Course;
	}

void setD(double fee)
	{
		this.Fee=fee;
	}
double getD()
	{
		return Fee;
	}

void display()
	{
		System.out.println(Sno);
		System.out.println(Sname);
		System.out.println(Course);
		System.out.println(Fee);
	}

			

}

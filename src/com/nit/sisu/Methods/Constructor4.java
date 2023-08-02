package com.nit.sisu.Methods;
class  Constructor4
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setA(101);
		s1.setB("sisu");
		s1.setC("core java");
		s1.setD(2000);

		System.out.println("Sno\t"+s1.getA());
		System.out.println("Sname\t"+s1.getB());
		System.out.println("Course\t"+s1.getC());
		System.out.println("Fee\t"+s1.getD());
		System.out.println();
		s1.display();

	}
}
class Student
{
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

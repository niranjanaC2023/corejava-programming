package com.nit.sisu.Methods;
class  Constructor6
{
	public static void main(String[] args) 
	{
		Link s1 = new Link();
		s1.display();
		
		s1.setA(101);
		s1.setB("sisu");
		s1.setC("core java");
		s1.setD(2000);
		System.out.println("n s1 object value");
		System.out.println("Sno:\t"+s1.getA());
		System.out.println("Sname:\t"+s1.getB());
		System.out.println("Course:\t"+s1.getC());
		System.out.println("Fee:\t"+s1.getD());

		System.out.println();
		//updating course of the value
		
		s1.setC(s1.getC()+"\tAJ");

		s1.setD(s1.getD()+1000);
		
		System.out.println("updated Course");
		
		System.out.println("Sno\t"+s1.getA());
		System.out.println("Sname\t"+s1.getB());
		System.out.println("Course\t"+s1.getC());
		System.out.println("Fee\t"+s1.getD());
		System.out.println();
		s1.display();


	}
}
class Link
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

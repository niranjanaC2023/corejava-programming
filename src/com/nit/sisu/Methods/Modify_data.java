package com.nit.sisu.Methods;
class Modify_data
{
	public static void main(String[] args) 
	{
		Dear s1 = new Dear();
		Dear s2 = new Dear();
		
		System.out.println("s1.Sno:"+s1.Sno);
		System.out.println("s1.Sname:"+s1.Sname);
		System.out.println("s1.Scourse:"+s1.Scourse);
		System.out.println("s1.Sfee:"+s1.Sfee);
		
		System.out.println();
		System.out.println("insert data of first student:");
		s1.Sno=1;
		s1.Sname="sisu";
		s1.Scourse="core java";
		s1.Sfee=3000;
		System.out.println("s1.Sno:"+s1.Sno);
		System.out.println("s1.Sname:"+s1.Sname);
		System.out.println("s1.Scourse:"+s1.Scourse);
		System.out.println("s1.Sfee:"+s1.Sfee);

		System.out.println();
		System.out.println("first sudent data modify like course and fee:-");
		s1.Scourse="advance java";
		s1.Sfee=4000;
		System.out.println("s1.Scourse:"+s1.Scourse);
		System.out.println("s1.Sfee:"+s1.Sfee);
		
		System.out.println();
		System.out.println("insert data of second student:");
		s2.Sno=2;
		s2.Sname="susanta";
		s2.Scourse="advance java";
		s2.Sfee=4000;
		System.out.println("s2.Sno:"+s2.Sno);
		System.out.println("s2.Sname:"+s2.Sname);
		System.out.println("s2.Scourse:"+s2.Scourse);
		System.out.println("s2.Sfee:"+s2.Sfee);
		
		System.out.println();
		System.out.println("second student data modify like corse and fee:-");
		s2.Scourse="corejava";
		s2.Sfee=3000;
		System.out.println("s2.Scourse:"+s2.Scourse);
		System.out.println("s2.Sfee  :"+s2.Sfee);

	}
}
class Dear
{
	int Sno;
	String Sname;
	String Scourse;
	double Sfee;
}

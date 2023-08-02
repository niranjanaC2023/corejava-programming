package com.nit.sisu.superclass;
class A4
{
	static int a=10;
	int x=20;
}
class B4 extends A4
{
	static int a=30;
	int x=40;
	
}

/*class Sample12
{
	public static void main(String[] args) 
	{
		B b1  =  new B();
		A a1  =  new B();

		System.out.println(b1.a+"..........."+b1.x);		//if we access a variable using sub class refernced variable then it is executed  from sub class
																
		System.out.println(a1.a+"........"+a1.x);			//if we access a variable using super class refernced variable then it is executed  from super class
		System.out.println(B.a+"........."+A.a);

		b1.x=5;
		a1.x=6;


		System.out.println(b1.a+"..........."+b1.x);
		System.out.println(a1.a+"........"+a1.x);
		System.out.println(B.a+"........."+A.a);

	}*/




class Sample12
{
	public static void main(String[] args) 
	{
		B4 b1  =  new B4();
		A4 a1  =  b1;

		System.out.println("a:"+b1.a);
		System.out.println("a:"+a1.a);

		System.out.println("x:"+b1.x);
		System.out.println("x:"+a1.x);
	}

}

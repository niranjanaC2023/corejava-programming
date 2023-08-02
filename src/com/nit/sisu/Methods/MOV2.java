package com.nit.sisu.Methods;
class MOV2 
{
	
	void m1(int a)
	{
		System.out.println("int-arg:"+a);
	}
	void m1(char ch)
	{
		System.out.println("char-arg:"+ch);
	}
	
	public static void main(String[] args) 
	{
		MOV2 m2= new MOV2();
		m2.m1(99);
		m2.m1('c');
		m2.m1((char)100);
		m2.m1((int)'d');

		int i1=97;
		int i2='a';
		char ch1=98;
		char ch2='b';

		m2.m1(i1);
		m2.m1(i2);
		m2.m1(ch1);
		m2.m1(ch2);

		m2.m1((char)i1);
		m2.m1((int)ch1);

		m2.m1(i1+i2);
		m2.m1(ch1+ch2);

		m2.m1(10+'a');
		m2.m1('a'+'b');
		m2.m1((char)('a'+'b'));
		m2.m1('a'+'b');

		m2.m1(m2());
		m2.m1(m3());
	}
	static int m2()
	{
		return 'a';
	}
	static int m3()
	{

		return 97;
	}

}

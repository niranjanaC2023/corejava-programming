package com.nit.sisu.operators;
class literalcheck
{
	public static void main(String[] args)
	{
		//boolean bo = 5;		//(error:int can't converted to boolean)

		//boolean bo = 5L;       	 //(error:long can't converted to boolean)

		//boolean bo = 5.0;		//(error:double can't converted to boolean)

		//boolean bo = 5.0F;		//(error:float can't converted to boolean)

		//boolean bo = 'a';		//(error:char can't converted to boolean)

		//String s = true;		//(error:boolean can't converted to string)

		//boolean bo = String.class;	//(error:class can't converted to boolean)

		//int i1 = null;		//(error:null can't converted to int)

		//int i2 = (String)null;	//(error:string can't converted to int)
		
		//byte b2 = 500;		//(error:int can't converted to byte)

		//short s2 = 500000;		//(error:int can't converted to short)

		//int i2 = 5L;		//(error:long can't converted to int)

		//int i1 = 5;

		//long l1 = 5;
		//System.out.println(l1);
		
		//long i1 = 5;

		//int l3 = 12345678909;	//(integer number too large)

		//long l4 = 12345678909L;
		//System.out.println(l4);	//(output:-12345678909)

		//int i2 = (int)10.0;		//(int to int)
		//System.out.println(i2); 	//(output: 10)

		//float f2 = 10.0f;
		//double d2 = 10.0;
		//char ch1 = 'a';
		//char ch2 = '1';
		//char ch3 = '@';

		//char ch4 = 'ab';		//(error: more than one character in a single code)

		//char ch5 = '10';		
		//char ch6 ='@&';		//(error: more than one character in a single code)

		//char ch7 = '';		//(error: blank/empty not occur in a single code)

		//char ch8 = ' ';

		//char ch9 = '  ';		//(error: more than one space not occur in character in a single code)
		
		//byte b1 = 5;		//(int converted to byte)
		//System.out.println(b1); 	//(output: 5)
	
		//int i1 = (byte)5;		//(byte converted to int)
		//System.out.println(i1);	//(output: 5)
	
		//short s1 = 5;		//(int converted to short)
		//System.out.println(s1);	//(output: 5)

		//int i1 = (short)5;		//(short converted to int)
		//System.out.println(i1);	//(output: 5)

		//long l1 = 5;		//(int converted to long)
		//System.out.println(l1);	//(output: 5)

		//int i2 = 5L;		//(error:long can't converted to int)

		//float i2 = 5;		//(int converted to float)
		//System.out.println(i2);	//(output: 5.0)

		//int i2 = 5.0F;		//(error: float can't converted to int)
				
		//char c1 = 5;		//(compiled)
		//System.out.println(c1);

		//int i1 = 'a';		//(char converted to int)
		//System.out.println(i1);	//(output: 97)

	 	//byte a = 123;
		//System.out.println(a);	//(output: 123)
		
		//byte b = 0123;
		//System.out.println(b);	//(output: 83)

		//byte c = 0xA1;		//(error: incompatible types: possible lossy conversion from int to byte)
		//System.out.println(c);

		//byte d = 0b1101;
		//System.out.println(d);	//(output: 13)

		//int i2 = 0xa1;
		//System.out.println(i2);	//(output:161)

		//int i3 = 0xa1L;	 	//(error: incompatible types: possible lossy conversion from long to int)

		//long l2 = 0xa1L;
		//System.out.println(L2);	//(output:161)

	   	//long l3 = 0b0101L;
		//System.out.println(L3);	    //(output: 5)

		//long L4 = 0123L;
		//System.out.println(L4);	//(output: 83)

		//int i3 = 0xa1L;	 	//(error: incompatible types: possible lossy conversion from long to int)	

		//int i4 = 0xa1f;
		//System.out.println(i4);	//(output: 2591)

		//int i5 = 0xa1d;
		//System.out.println(i5);	//output: 2589)

		//int i6 = 0xa1dl;		//(error: incompatible types: possible lossy conversion from long to int)

		//long L7 = 0xa1dL;
		//System.out.println(L7);	//(output: 2589)

		//float f5 = 0xa1.0f;		//(error: malformed floating point literal)

		//double d5 = 0xa1.0;	 //(error: malformed floating point literal)

		//int a = 5L;	 	//(error: incompatible types: possible lossy conversion from long to int)

		//int b = 5f;	 	//(error: incompatible types: possible lossy conversion from long to int)

		//int d = 5d;	 	//(error: incompatible types: possible lossy conversion from long to int)

		//int i8 = 0123L;		 //(error: incompatible types: possible lossy conversion from long to int)

		//long L7 = 0123L;
		//System.out.println(L7);	//(output: 83)

	/**	long L9 = 012389L;		 //(error: integer number too large: 012389)

		double d8 = 0b1010.0;	 //(error: ';' expected)

	    double d8 = 0b1010.0f;	*/ //(error: ';' expected)

		//double d8 = 0123d;
		//System.out.println(d8);	//(output: 123.0)

		//double d8 = 0123.0;
		//System.out.println(d8);	//(output: 123.0)

		//double d8 = 0123.0f;
		//System.out.println(d8);	//(output: 123.0)

		//double d8 = 012389f;
		//System.out.println(d8);	//(output: 12389.0)

		//int x = 123;
		//System.out.println(x);	//(output: 123)

		//int x = 0123;
		//System.out.println(x);	//(utput: 83)

		//int x = 0x123;
		//System.out.println(x);	//(output: 291)

		//int x = 0b1010;
		//System.out.println(x);	//(output: 10)

		//int i3 = 0b1010;
		//System.out.println(i3);	//(output: 10)

		//double amt1 = 100000;
		//System.out.println(amt1);	//(output: 100000.0)

		//double amt1 = 1,00,000;
		//System.out.println(amt1);	//(error: illegal start of expression)

		double amt1 = 1_00_000;
		System.out.println(amt1);	//(output: 100000.0)

		//double d1 = 1_00_000;
		//System.out.println(d1);	//(output: 100000.0)

		//double d1 = _100000;
		//System.out.println(d1);	//( error: cannot find symbol)

		//double d1 = 100000_;
		//System.out.println(d1);	//(error: illegal underscore)	//(NOTE:- underscope is placed between two digit only)

		//double d1 = 100___000;
		//System.out.println(d1);	//(output: 100000.0)

		//double d1 = 100000.65;
		//System.out.println(d1);	//(output: 100000.65)

		//double d1 = 1_00_000.6_5;
		//System.out.println(d1);	//(output: 100000.65)

		//double d1 = 100000_.65;
		//System.out.println(d1);	//(error: illegal underscore)

		//double d1 = 100000._65;
		//System.out.println(d1);	//(error: illegal underscore)

		//double d1 = 100000d_;
		//System.out.println(d1);	//(error: illegal underscore)

		//double d1 = 1_00_000d;
		//System.out.println(d1);	//(output: 100000.0)

		//double d1 =  0_b1010;
		//System.out.println(d1);	//(error: illegal underscore)

		//int i3 = _0x1234;
		//System.out.println(i3);	//(error: illegal underscore)

		//int i3 = 0_x1234;
		//System.out.println(i3);	//(error: illegal underscore)

		//int i3 = 0x_1234;
		//System.out.println(i3);	//(error: illegal underscore)

		//int i3 = 0x1_234;
		//System.out.println(i3);	//(output: 4660)

		int i3 = 0xa_b23;
		System.out.println(i3);	//(output: 43811)

		//int i3 = 0b_1010;
		//System.out.println(i3);	//(error: illegal underscore)

		//int i3 = 0b10_10;
		//System.out.println(i3);	//(output: 10)

		//int i3 = 0_123;
		//System.out.println(i3);	//(output: 83)

		//int i3 = _01234;
		//System.out.println(i3);	//(error: illegal underscore)

		//float f1 = 10000_f;
		//System.out.println(f1);	//(error: illegal underscore)

		//float f1 = 10000f_;
		//System.out.println(f1);	//(error: illegal underscore)
		
	      /*int m = 10;
		int n = m+20;
		System.out.println(n);	//(output: 30)  */

	   /*int a =5;
		System.out.println(a);	//(output: 5)  */

	  /*	int a =5;
		System.out.println(5);	//(output: 5)
		System.out.println('5');	//(output: 5)
		System.out.println("5");	//(output: 5)    */

		//int a =10;
		//System.out.println(a);
		//System.out.println(d5);

	    //double d5 = 10.435;
     	//System.out.println(d5);

		
		


		
		
		

		
	}


	

}

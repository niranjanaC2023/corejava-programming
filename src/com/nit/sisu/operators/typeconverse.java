package com.nit.sisu.operators;
class typeconverse
{
	public static void main(String[] args)
	{
		//int i1 = 10.0;	//(error: incompatible types: possible lossy conversion from double to int)
		//System.out.println(i1);

		//float f1 = 10;
		//System.out.println(f1);	//(output: 10.0)

		//long l1 = 5;
		//int i1 = l1;
		//System.out.println(i1);	 //(error: incompatible types: possible lossy conversion from long to int)

		//long l1 = 5
		//int i1 = (int)l1;
		//System.out.println(i1);	//(output: 5)
	
		//float f1 = 10;
		//System.out.println(f1);	//(output: 10.0)

		//int i1 = true;
		//System.out.println(i1);	//(error: incompatible types: boolean cannot be converted to int)

		//int i1= 5;
		//System.out.println(i1);	//(output: 5)

		//int i1 = 10.0;			//(error: incompatible types: possible lossy conversion from double to int)

		//int i2= (int)10.0;
		//System.out.println(i2);	//(output: 10)

		//byte b1 = 10.0;
		//System.out.println(b1);	//(error: incompatible types: possible lossy conversion from double to byte)

		/*//byte b1 = 10.0;
		byte b1 = (byte)10.0;
		System.out.println(b1);*/	//(output: 10)

	 /*	int i2 = 254;
		byte b2 = (byte)i2;
		System.out.println(b2);	      //(output: -2)
		System.out.println(i2);  */	 //(output: 254)

	 /*	int i2 = 254;
		byte b2 = (byte)i2;
		System.out.println(b2); */	  //(output: -2)

	  /* byte b6 = (short)10;
         System.out.println(b6);  */	//(output: 10)
		
	 /*	int i8 = 10;
		byte b3 =(byte)i8;
		System.out.println(b3);  */		//(output: 10)

     /*	int i9 = 5;
		byte b7 = (byte)i9;
		System.out.println(b7);  */ 	//(output: 5)

	 /*	int i1 = 1000;
		byte b1 = (byte)i1;
		System.out.println(i1);	        //(output: 1000)
		System.out.println(b1);   */	//(output: -24)

	 /*	int a = 10+20+30;
		System.out.println(a); */		//(output: 60)

	 /*	int a=97;
		byte b = (byte)(short)a;
		System.out.println(b);   */		//(output: 97)

	 /*	int a=97;
		byte b = (byte)(short)(char)(float)(double)a;
		System.out.println(b);  */		//(output: 97)

	 /*	int a=97;
		byte b = (byte)(short)(boolean)(int)a;
		System.out.println(b); */		//(error: incompatible types: int cannot be converted to boolean)

	 /*	int a = 97;
		byte b = (short)(byte)a;
		System.out.println(b);  */		//(output: error: incompatible types: possible lossy conversion from short to byte)

     /*	 int i4 = 254;
		short s = (short)i4;
		System.out.println(s);  */		 //(output: 254)

	 /*	int i4 = 254;
		short s = (short)(byte)i4;
		System.out.println(s);    */      //(output: -2)

	 /*	int i3 = 10;
		byte b5 = (byte)(short)i3;
		System.out.println(b5);    */	  //(output: 10)

	 /*	int i3 = 10;
		byte b5 = (byte)(short)(char)(double)i3;
		System.out.println(b5);   */		//(output: 10)

	 /*	byte b1 = 5;
		System.out.println(b1);   */ 	    //(o/p: 5)
	/*  int i1 = 5;
		byte b2 = i1;
		System.out.println(b2);    */  	   //(error: incompatible types: possible lossy conversion from int to byte)

	 /* int i1 = 5;
		byte b2 = (byte)i1;
		System.out.println(b2);  */	      //(output:5)

	 /* char ch1 =  97;
		System.out.println(ch1);*/	       //(output: a)
	
     /*	int i1 = 97;
		char ch = i1;
		System.out.println(ch);  */	       //( error: incompatible types: possible lossy conversion from int to char)

     /*	int i1 = 97;
		char ch = (char)i1;
		System.out.println(ch);   */          //(output: a)

	 /*	long l1 = 5;
		System.out.println(l1);   */	     //(output: 5)

	 /*	long l1 = 5;
		float f1 = l1;
		System.out.println(f1);   */	    //(output: 5.0)	//(long to float can be converted)

	 /*	float f2 = 10;
		long l2 = f2;
		System.out.println(l2);   */	    //( error: incompatible types: possible lossy conversion from float to long)   //(float to long can not be converted)			

	 /*	float f2 = 10;
		long l2 = (long)f2;
		System.out.println(l2);   */	       //(output: 10)

	 /*	long l4 = 92238456789218516788;
		System.out.println(l4);    */		//(integer number too large: 92238456789218516788)

	 /*	long l5 =  9223372036854775807L;
		System.out.println(l5); */	        //(output: 9223372036854775807)

	 /*	float f5 = 9223372036854775807;
		System.out.println(f5);   */	    //(integer number too large: 92238456789218516788)


	 /*	float f5 = 9223372036854775807L;
		System.out.println(f5);  */		    //(output: 9223372036854775807)

	//char literal (97) ---> b/s/i/l/f/d

	 /*	char ch =  'a';
		System.out.println(ch);   */	   //(output: a)

     /*	byte b1 = 'a';
		System.out.println(b1);   */	    //(output: 97)

	 /*	short s1 = 'a';
		System.out.println(s1);   */	    //(output: 97)			//(char is compatible to all datatype:- byte,short,int,long,float   only)

	 /*	int i1 = 'a';
		System.out.println(i1);   */	     //(output: 97)

	 /*	long l1 = 'a';
		System.out.println(l1);   */	     //(output: 97)

     /*	float f1 = 'a';
 		 System.out.println(f1);  */         //(output: 97.0f)

	 /*	double d1 = 'a';
		System.out.println(d1);  */	          //(output: 97.0)

	 /*	boolean bo = 'a';
		System.out.println(bo);  */	     //(error: incompatible types: char cannot be converted to boolean)        //(char is not compatible in datatyte are :- boolean.string)

	 /*	String s1 = 'a';
		System.out.println(s1);      */  	//( error: incompatible types: char cannot be converted to String)


	//char variable--------> i/l/f/d

     /*	char ch = 'a';
		byte b1 = ch;
		System.out.println(b1);    */	    //(error: incompatible types: possible lossy conversion from char to byte)
		
     /*	char ch = 'a';
		byte b1 = (byte)ch;
		System.out.println(b1);     */ 	//(output: 97)		//( char not compatible with datatype are:-byte/short    and    it can compatible using casting)

	 /*	char ch = 'a';
		short s1 = ch;
		System.out.println(s1);    */	//(error: incompatible types: possible lossy conversion from char to byte)

	 /*	char ch = 'a';
		short s1 = (short)ch;
		System.out.println(s1);    */	//(output: 97)

	 /*	char ch = 'a';
		int i1 = ch;
		System.out.println(i1);    */   //(output: 97)		//( char compatible with datatype are:- int,long/float/double)

	 /*	int i1 = 97;
		char ch = i1;
		System.out.println(ch);  */	//( error: incompatible types: possible lossy conversion from int to char)

	 /*	int i1 = 97;
		char ch = (char)i1;
		System.out.println(ch);   */		//(output: a)    

	 /*	byte b1= 97;
		char ch = b1;
		System.out.println(ch);    */		//(error: incompatible types: possible lossy conversion from byte to char)

	 /*	byte b1 = 97;
		char ch = (char)b1;
		System.out.println(ch);   */	//(output: a)

     /*	short s1 = 97;
		char ch = s1;
		System.out.println(ch);  */		//(error: incompatible types: possible lossy conversion from short to char)

     /*	char ch1 = 97;
		System.out.println(ch1);  */	//(output: a)

	 /*	char ch2 = 260;
		System.out.println(ch2);  */	//(output:   ?   )

     /*	char ch3 = 65000;
		System.out.println(ch3);  */	//(output:    ?    )

	 /*	char ch4 = 66000;
		System.out.println(ch4);  */	//(error)
		
     /*	char ch4 = 98;
		System.out.println(ch4); */    //(output: b)
	
		char ch4 = '0';
		System.out.println(ch4);

		char ch5 = '1';
		System.out.println(ch5);

	 /*	char ch4 = '10';
		System.out.println(ch4);   */	//(error)

	 /*	char ch4 = 1;
		System.out.println(ch4);  */   	//(output: smiley face)

     /*	char ch4 = 10;
 		System.out.println(ch4);  */	//(output: blank which not visible)

	 /*	char ch4 = 250;
		System.out.println(ch4);   */	//(output: u~  )


	 /*	char ch4 = -97;
		System.out.println(ch4);   */	//(char is not -ve range)

     /*	char ch4 = 66000;
		System.out.println(ch4);   */	//(char is over range)
 
     /*	int i3 = -97;
		char ch2 = i3;
		System.out.println(ch2);   */	//(erroer)

     /*	int i3 = -97;
		char ch2 = (char)i3;
		System.out.println(ch2);	     //(output:  ?)  
		System.out.println(i3);    */	//(output:  -97  )

		 
	
		
		
		
	













	}
}
		
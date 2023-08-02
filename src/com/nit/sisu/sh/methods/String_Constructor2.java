package com.nit.sisu.sh.methods;
class String_Constructor2	
{
	
	public static void main(String[] args) 
	{
		//RULE 1
		byte[] b ={97,98,99};
		//String s10 = new String(b,1,4);


		char[] ch = {'a','b','c','d','e'};
		
		//String s7 = new String(ch,-2,4);
		//System.out.println("s7 chars:"+s7);
		//System.out.println("s7 length:"+s7.length());
		
		//String s8 = new String(ch,2,-4);		//all r run time error
		//System.out.println("s8 chars:"+s8);
		//System.out.println("s8 length:"+s8.length());

		String s9 = new String(ch,2,8);
		//System.out.println("s9 chars:"+s9);
		//System.out.println("s9 length:"+s9.length());  //R.E
		
		String s10 = new String(ch,2,6);
		//System.out.println("s10 chars:"+s10);		//R.E
		System.out.println("s10 length:"+s10.length());
		
		String s11 = new String(ch,2,5);
		System.out.println("s11 chars:"+s11);
		//System.out.println("s11 length:"+s11.length());	//R.E

		String s12 = new String(ch,2,4);
		System.out.println("s12 chars:"+s12);
		//System.out.println("s12 length:"+s12.length());	//R.E


		//String s13 = new String(ch,6,4);
		//System.out.println("s13 chars:"+s13);
		//System.out.println("s13 length:"+s13.length());


		/*String s14 = new String(ch,6,-4);
		System.out.println("s14 chars:"+s14);
		System.out.println("s14 length:"+s14.length());*/


		//String s15 = new String(ch,6,0);
		//System.out.println("s15 chars:"+s15);
		//System.out.println("s15 length:"+s15.length());

		String s16 = new String(ch,2,0);
		System.out.println("s16 chars:"+s16);
		System.out.println("s16 length:"+s16.length());

		String s17 = new String(ch,2,1);
		System.out.println("s17 chars:"+s17);
		System.out.println("s17 length:"+s17.length());

		String s18 = new String(ch,0,2);
		System.out.println("s18 chars:"+s18);
		System.out.println("s18 length:"+s18.length());



		//RULE 2
		
		//String s19 = new String(null);
		//System.out.println("s19 chars:"+s19);
		//System.out.println("s19 length:"+s19.length());

		
		//RULE 3
		String s20 = null;
		System.out.println("s20 chars:"+s20);
		System.out.println("s20 length:"+s20.length());

		String s21 = new String(s20);
		System.out.println("s21 chars:"+s21);
		System.out.println("s21 length:"+s21.length());

		String s22 = new String((StringBuffer)null);
		System.out.println("s22 chars:"+s22);
		System.out.println("s22 length:"+s22.length());

		//String s23 = new String(null);
		//System.out.println("s23 chars:"+s23);
		//System.out.println("s23 length:"+s23.length());


		String s24 = new String((String)null);
		System.out.println("s24 chars:"+s24);
		System.out.println("s24 length:"+s24.length());

		String s25 = ("null");
		System.out.println("s25 chars:"+s25);
		System.out.println("s25 length:"+s25.length());

		
		String s26 =new String("null");
		System.out.println("s26 chars:"+s26);
		System.out.println("s26 length:"+s26.length());


		// empty string object creation
		String s27 = "";
		System.out.println("s27 chars:"+s27);
		System.out.println("s27 length:"+s27.length());

		String s28 = new String();
		System.out.println("s28 chars:"+s28);
		System.out.println("s28 length:"+s28.length());

		String s29 = new String("");
		System.out.println("s29 chars:"+s29);
		System.out.println("s29 length:"+s29.length());
		
		//null string referenced variablr creation
		String s30 = null;
		System.out.println("s30 chars:"+s30);
		System.out.println("s30 length:"+s30.length());

		// we can not create null string object
		//String s31 = new String(null);
		//System.out.println("s31 chars:"+s31);
		//System.out.println("s31 length:"+s31.length());

		String s32 = new String((String)null);
		System.out.println("s32 chars:"+s32);
		System.out.println("s32 length:"+s32.length());

		String s33 = new String(s30);
		System.out.println("s33 chars:"+s33);
		System.out.println("s33 length:"+s33.length());

		// null is not value
		String s34 = new String("null");
		System.out.println("s34 chars:"+s34);
		System.out.println("s34 length:"+s34.length());

		//String copy
		String s35 = new String("A");
		System.out.println("s35 chars:"+s35);
		System.out.println("s35 length:"+s35.length());

		String s36 = new String(s35);
		System.out.println("s36 chars:"+s36);
		System.out.println("s36 length:"+s36.length());

		String s37 = new String("B");
		System.out.println("s37 chars:"+s37);
		System.out.println("s37 length:"+s37.length());

		//string referenced variable
		String s38 = s37;
		System.out.println("s38 chars:"+s38);
		System.out.println("s38 length:"+s38.length());

		

		

		
		
		
	}
}

package com.nit.sisu.sh.methods;
class StringConstructorRules
{
	public static void main(String[] args) 
	{
		//RULE 1 char[] and byte[] offset and count rang( 0 to string length-1)
		
		char[] ch = {'a','b','c','d','e','f'};
		//byte[] b = {97,98,99};
		//String s10 =  new String(b,1,4);
		//System.out.println(s10);

		//String s7 = new String(ch,-2,4)
		//System.out.println(s7);

		//String s8 = new String(ch,2,-4)
		//System.out.println(s8);

		//String s9 = new String(ch,2,8);
		//System.out.println(s9);

		//String s10 = new String(ch,2,6);
		//System.out.println(s10);

		//String s12 = new String(ch,2,5);
		//System.out.println(s12);

		String s11 = new String(ch,2,4);
		System.out.println(s11);
		System.out.println("s11 chars:"+s11);
		System.out.println("s11 length:"+s11.length());

		//String s13 = new String(ch,6,4);
		//System.out.println(s13);

		//String s14 = new String(ch,6,-4);
		//System.out.println(s14);

		String s15 = new String(ch,6,0);
		System.out.println(s15);
		System.out.println("s15 chars:"+s15);
		System.out.println("s15 length:"+s15.length());

		String s16 = new String(ch,2,0);
		System.out.println(s16);
		System.out.println("s16 chars:"+s16);
		System.out.println("s16 length:"+s16.length());

		String s17 = new String(ch,0,2);
		System.out.println(s17);
		System.out.println("s17 chars:"+s17);
		System.out.println("s17 length:"+s17.length());
	
		//RULE 2 we can pass null as argument directly to string constructor
		
		//String s18 = new String(null);   //ambiguous error
		//System.out.println("s18 chars:"+s18);
		//System.out.println("s18 length:"+s18.length());

		//String s181 = new String((String)null);
		//System.out.println("s181 chars:"+s181);
		//System.out.println("s181 length:"+s181.length());

		//String s182 = new String(s18);


		//RULE 3 we can create string object with null leads RE:
		
		//String s20 = new String(s19);
		//String s21 = new String((StringBuffer)null); //RE:NPE

		String s19 = null;
		System.out.println(s19);
		System.out.println("s19 chars:"+s19);
		//System.out.println("s19 length:"+s19.length());
		System.out.println();

		String s22 = "null";
		System.out.println(s22);
		System.out.println("s22 chars:"+s22);
		System.out.println("s22 length:"+s22.length());
		System.out.println();

		String s23 = new String("null");
		System.out.println(s23);
		System.out.println("s23 chars:"+s23);
		System.out.println("s23 length:"+s23.length());

		String s24 = "";
		System.out.println(s24);
		System.out.println("s24 chars:"+s24);
		System.out.println("s24 length:"+s24.length());

		String s25 = " ";
		System.out.println(s25);
		System.out.println("s25 chars:"+s25);
		System.out.println("s25 length:"+s25.length());
		
		String s26 = new String();
		System.out.println(s26);
		System.out.println("s26 chars:"+s26);
		System.out.println("s26 length:"+s26.length());

		String s27 = new String("");
		System.out.println(s27);
		System.out.println("s27 chars:"+s27);
		System.out.println("s27 length:"+s27.length());
		System.out.println();

		String s28 =null;
		System.out.println(s28);
		System.out.println("s28 chars:"+s28);
		//System.out.println("s28 length:"+s28.length());
		System.out.println();

		String s29 = new String("A");
		System.out.println(s29);
		System.out.println("s29 chars:"+s29);
		System.out.println("s29 length:"+s29.length());
		System.out.println();

		String s30 = new String(s29);
		System.out.println(s30);
		System.out.println("s30 chars:"+s30);
		System.out.println("s30 length:"+s30.length());
		System.out.println();

		System.out.println(s29==s30);

		String s31 = new String("B");
		System.out.println(s31);
		System.out.println("s31 chars:"+s31);
		System.out.println("s31 length:"+s31.length());
		System.out.println();

		String s32 = s31;
		System.out.println(s32);
		System.out.println("s32 chars:"+s32);
		System.out.println("s32 length:"+s32.length());
		System.out.println();

		System.out.println(s32==s31);

		

		

		

		



		



	}
}

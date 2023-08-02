package com.nit.sisu.sh.methods;
class String_Object_concat	//operation 18
{
	public static void main(String[] args) 
	{

		String s1 = "Hari";
		System.out.println(s1);
		System.out.println();

		String s2 = s1.concat("Krishna");
		System.out.println(s2);
		System.out.println();

		String s3 = "a";
		s3.concat("b");
		System.out.println("s3:"+s3);
		System.out.println();

		String s4 = s3.concat("c");
		System.out.println("s4:"+s4);
		System.out.println(s3==s4);
		System.out.println();

		s3=s3.concat("c");
		System.out.println();

		System.out.println(s3.concat("e"));
		System.out.println(s3);
		System.out.println();
		
		System.out.println(s3=s3.concat("f"));
		System.out.println();

		String s5 = s3.concat("");
		System.out.println("s3:"+s3);
		System.out.println("s5:"+s5);
		System.out.println(s3==s5);
		System.out.println();

		String s6 = "";	
		String s7 = s6.concat("");
		System.out.println("s6:"+s6);
		System.out.println("s7:"+s7);
		System.out.println(s6==s7);
		System.out.println();

		String s8 = "p";
		System.out.println("s6:"+s6);
		System.out.println();

		String s9 = s8+"q";
		System.out.println("s9:"+s9);
		System.out.println();

		String s10 = s8+"";
		System.out.println("s10:"+s10);
		System.out.println();

		String s11 = ""+s8;
		System.out.println("s11:"+s11);
		System.out.println();
	
		System.out.println(s8==s9);
		System.out.println(s8==s10);
		System.out.println(s10==s11);
		System.out.println();	

		String s12 = "a";
		String s13 = "b";
		String s14 = "c";

		String s15 = "abc";
		String s16 = "a"+"b"+"c";
		String s17 = "a".concat("b").concat("c");
		
		System.out.println(s15==s16);
		System.out.println(s15==s17);

		String s18 = "a";
		String s19 = s18.concat("b");
		String s20 = s18.concat("b");
		System.out.println(s19==s20);

		String s21 = s18.concat("");
		String s22 = s18.concat("");
		System.out.println(s18==s20);
		System.out.println(s18==s21);
		System.out.println(s21==s22);

	}

		
}
		
package com.nit.sisu.non_static;
class Non_static5
{
	int eid;
	String ename;
	String company;

	public String toString()
	{
		return "eid:"+eid+"\n"+"ename:"+ename+"\n"+"company:"+company+"\n";
	}
	public static void main(String[] args) 
	{
		Non_static5 obj1 = new Non_static5();
		int eid=7279;
		String ename="Harikrishna";
		String company="Nareshit";
		System.out.println(obj1);


		//System.out.println(obj1.eid);
		//System.out.println(eid);

	}
}

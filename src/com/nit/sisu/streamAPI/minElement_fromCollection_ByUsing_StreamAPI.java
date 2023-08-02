package com.nit.sisu.streamAPI;
import java.util.ArrayList;
public class minElement_fromCollection_ByUsing_StreamAPI
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(27);
		al.add(4);
		al.add(6);
		al.add(7);
		al.add(12);
		System.out.println(al);
		//min by using StreamAPI(find even number)//min method used for retrieve some objects from Group of objects..
		int minimum = al.stream().min((i1,i2)->i1.compareTo(i2)).get();//ascending
		System.out.println(minimum);
		int minimum1 = al.stream().max((i1,i2)->i1.compareTo(i2)).get();//ascending
		System.out.println(minimum1);
		System.out.println();
		int minimum2 = al.stream().min((i1,i2)->i2.compareTo(i1)).get();//descending
		System.out.println(minimum2);
		int minimum3 = al.stream().max((i1,i2)->i2.compareTo(i1)).get();//descending
		System.out.println(minimum3);
	}
}

//In ascending, min is lowest value and max is highest value
//In descending, min is highest value and max is lowest value..

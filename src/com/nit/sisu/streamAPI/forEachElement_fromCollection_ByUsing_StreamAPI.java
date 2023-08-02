package com.nit.sisu.streamAPI;
import java.util.ArrayList;
import java.util.function.Consumer;
public class forEachElement_fromCollection_ByUsing_StreamAPI
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
		al.stream().forEach(System.out::println);
		System.out.println();
	//find square of it by using forEach method..process-------1  (or)
		Consumer<Integer> cnm = i->{
								System.out.println("The square of "+i+ "is :"+(i*i));
								};
		
		al.stream().forEach(cnm);
	//find square of it by using forEach method..process-----------2
	al.stream().forEach(i->{
								System.out.println("The square of "+i+ "is :"+(i*i));
							});
		
		
	}
}



/*
 Difference between map() and flatMap()
 =>Both are use for data transformation.
 map(): retrieves single value for each input values.it has One-To-One mapping.
 flatMap() : retrieves multiple values for each input values.it has One-To-Many mapping.
 */


package com.nit.sisu.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question22 
{

	public static void main(String[] args) 
	{
		List<Long> rajaPhoneNumber = new ArrayList<>();
		rajaPhoneNumber.add(9881777171L);
		rajaPhoneNumber.add(9231567171L);
		
		List<Long> ramaPhoneNumber = new ArrayList<>();
		ramaPhoneNumber.add(922123471L);
		ramaPhoneNumber.add(9114567171L);
		
		List<Long> raniPhoneNumber = new ArrayList<>();
		raniPhoneNumber.add(955123471L);
		raniPhoneNumber.add(9004567171L);
		
		List<Customer> customer = Arrays.asList(new Customer(101,"raja@gmail.com","raja",rajaPhoneNumber),
				                            new Customer(102,"rani@gmail.com","rani",raniPhoneNumber),
				                            new Customer(103,"rama@gmail.com","rama",raniPhoneNumber));
		List<String> getEmail = customer.stream().map(n->n.getEmail()).collect(Collectors.toList());
		System.out.println("Get Email: "+getEmail);
		List<List<Long>> getPhoneNo = customer.stream().map(n->n.getPhone()).collect(Collectors.toList());
		System.out.println("Get PhoneNo: "+getPhoneNo);
		System.out.println();
		
		//using flatMap()
		List<Long> getPhoneNo2 = customer.stream().flatMap(n->n.getPhone().stream()).collect(Collectors.toList());
		System.out.println("Get PhoneNo2: "+getPhoneNo2);
		System.out.println();

	}

}

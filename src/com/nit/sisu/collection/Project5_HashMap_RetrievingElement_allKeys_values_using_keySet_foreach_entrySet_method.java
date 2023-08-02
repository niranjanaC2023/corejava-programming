package com.nit.sisu.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Project5_HashMap_RetrievingElement_allKeys_values_using_keySet_foreach_entrySet_method {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<>();
		System.out.println(hm.size()); //0
		System.out.println(hm);
		System.out.println();
//******adding one entries :- public V   put(K  k,V v)******
		hm.put("a",  0);
		hm.put(6,  2);
		hm.put("c", 3);
		hm.put(null, 7);
		hm.put(true, 3); 
		hm.put("x", null);
		System.out.println(hm.size());  //5
		System.out.println(hm);
		System.out.println();
//********retrieving all keys at a time:  public Set<K> keySet() ***********
		//by using foreach loop
		Set<Object> keys = hm.keySet();
		for(Object key : keys)
		{
			System.out.println(key);
		}
		System.out.println();	
//*******retieving all values :- public Collection<V> values() ********
		//by using foreach loop
		Collection<Object> values = hm.values();
		for(Object value : values)
		{
			System.out.println(value);
		}
		System.out.println();		
//********retrieving all entries(key & values) :- public Set<Map.Entry<K,V>>entrySet()*********
		//by using enytrySet with  foreach loop
		Set<Map.Entry<Object, Object>> entries = hm.entrySet();
		for(Map.Entry<Object,  Object> entry : entries)
		{
			System.out.println(entry);
		}
		System.out.println();	
		//by using entrySet with forEach method
		Set<Map.Entry<Object, Object>> entries1 = hm.entrySet();
		entries1.forEach(System.out::println); //method reference concept
		System.out.println();	
//********retrieving all entries(key & values) :-  public Set<K> keySet() and retrieving only values :- public V get(K k)  *********
		Set<Object> keys2 = hm.keySet();
		for(Object key : keys2)
		{
			Object value = hm.get(key);
			System.out.println(key+":"+value);
		}
	}
}

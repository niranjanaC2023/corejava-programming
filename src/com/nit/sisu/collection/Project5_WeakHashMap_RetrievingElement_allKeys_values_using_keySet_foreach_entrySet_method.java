package com.nit.sisu.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class Project5_WeakHashMap_RetrievingElement_allKeys_values_using_keySet_foreach_entrySet_method {
	public static void main(String[] args) {
		WeakHashMap<Object, Object> whm = new WeakHashMap<>();
		System.out.println(whm.size()); //0
		System.out.println(whm);
		System.out.println();
//******adding one entries :- public V   put(K  k,V v)******
		whm.put("a",  0);
		whm.put(6,  2);
		whm.put("c", 3);
		whm.put(null, 7);
		whm.put(true, 3); 
		whm.put("x", null);
		System.out.println(whm.size());  //5
		System.out.println(whm);
		System.out.println();
//********retrieving all keys at a time:  public Set<K> keySet() ***********
		//by using foreach loop
		Set<Object> keys = whm.keySet();
		for(Object key : keys)
		{
			System.out.println(key);
		}
		System.out.println();	
//*******retieving all values :- public Collection<V> values() ********
		//by using foreach loop
		Collection<Object> values = whm.values();
		for(Object value : values)
		{
			System.out.println(value);
		}
		System.out.println();		
//********retrieving all entries(key & values) :- public Set<Map.Entry<K,V>>entrySet()*********
		//by using enytrySet with  foreach loop
		Set<Map.Entry<Object, Object>> entries = whm.entrySet();
		for(Map.Entry<Object,  Object> entry : entries)
		{
			System.out.println(entry);
		}
		System.out.println();	
		//by using entrySet with forEach method
		Set<Map.Entry<Object, Object>> entries1 = whm.entrySet();
		entries1.forEach(System.out::println); //method reference concept
		System.out.println();	
//********retrieving all entries(key & values) :-  public Set<K> keySet() and retrieving only values :- public V get(K k)  *********
		Set<Object> keys2 = whm.keySet();
		for(Object key : keys2)
		{
			Object value = whm.get(key);
			System.out.println(key+":"+value);
		}
	}
}

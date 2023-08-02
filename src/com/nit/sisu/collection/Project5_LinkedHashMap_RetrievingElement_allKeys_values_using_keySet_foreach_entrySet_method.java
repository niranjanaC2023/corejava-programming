package com.nit.sisu.collection;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class Project5_LinkedHashMap_RetrievingElement_allKeys_values_using_keySet_foreach_entrySet_method {
	public static void main(String[] args) {
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		System.out.println(lhm.size()); //0
		System.out.println(lhm);
		System.out.println();
//******adding one entries :- public V   put(K  k,V v)******
		lhm.put("a",  0);
		lhm.put(6,  2);
		lhm.put("c", 3);
		lhm.put(null, 7);
		lhm.put(true, 3); 
		lhm.put("x", null);
		System.out.println(lhm.size());  //5
		System.out.println(lhm);
		System.out.println();
//********retrieving all keys at a time:  public Set<K> keySet() ***********
		//by using foreach loop
		Set<Object> keys = lhm.keySet();
		for(Object key : keys)
		{
			System.out.println(key);
		}
		System.out.println();	
//*******retieving all values :- public Collection<V> values() ********
		//by using foreach loop
		Collection<Object> values = lhm.values();
		for(Object value : values)
		{
			System.out.println(value);
		}
		System.out.println();		
//********retrieving all entries(key & values) :- public Set<Map.Entry<K,V>>entrySet()*********
		//by using enytrySet with  foreach loop
		Set<Map.Entry<Object, Object>> entries = lhm.entrySet();
		for(Map.Entry<Object,  Object> entry : entries)
		{
			System.out.println(entry);
		}
		System.out.println();	
		//by using entrySet with forEach method
		Set<Map.Entry<Object, Object>> entries1 = lhm.entrySet();
		entries1.forEach(System.out::println); //method reference concept
		System.out.println();	
//********retrieving all entries(key & values) :-  public Set<K> keySet() and retrieving only values :- public V get(K k)  *********
		Set<Object> keys2 = lhm.keySet();
		for(Object key : keys2)
		{
			Object value = lhm.get(key);
			System.out.println(key+":"+value);
		}
	}
}

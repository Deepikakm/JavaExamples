package javaCollections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableExample {

	public static void main(String[] args) {
		Hashtable<String,String>ht=new Hashtable<String,String>();
		ht.put("1", "one");
		ht.put("2", "two");
		ht.put("3", "three");
		ht.put("4", "four");
		System.out.println(ht);
		ht.remove("1");
		System.out.println(ht);
		String str=ht.get("2");
		System.out.println(str);
		//copying one hash table to the other
		Hashtable<String,String>ht1=new Hashtable<String,String>();
		ht1.put("5", "Five");
		ht1.put("6", "six");
		Hashtable ht2=new Hashtable();
		ht2.put("seven", new Integer(7));
		System.out.println(ht2);
		System.out.println(ht1);
		ht1.putAll(ht);
		System.out.println(ht1);
		//get the keys from the hashtable
		Set<String>keys=ht1.keySet();
		for(String key:keys)
		{
			System.out.println(key);
		}
		//iterating through the hashtable
		
		Enumeration<String> e=ht1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
				
		
		
		
		

	}

}

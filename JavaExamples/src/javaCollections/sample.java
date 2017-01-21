package javaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class sample {

	public static void main(String[] args) {
		List<Integer>li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		ListIterator iterator=li.listIterator();
		System.out.println("iterating in forward directions");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("iterating in backward directions");
		while(iterator.hasPrevious())
		{
			System.out.println(iterator.previous());
			
		}
		

	}

}

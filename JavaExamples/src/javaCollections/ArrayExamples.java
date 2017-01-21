package javaCollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayExamples {

	public static void main(String[] args) {
		boolean[] array1=new boolean[] {true,false};
		boolean[] array2=new boolean[] {false,true};
		if(array1.equals(array2))
		{
			System.out.println("arrays are equal");
		}
        //creating collection from Arrays
		String[] array=new String[] {"abc","def","efg"};
		List list=Arrays.asList(array);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
	}

}

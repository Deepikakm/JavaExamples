package javaCollections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
	 ArrayList<String> array=new ArrayList<String>();
	 array.add("deepa");
	 array.add("tinky");
	 array.add("keshav");
	 array.add("shweta");
	 System.out.println("Actual array"+array);
	 @SuppressWarnings("unchecked")
	 //to create clone array
	ArrayList<String>arr=(ArrayList<String>) array.clone();
     System.out.println("Cloned array"+arr);
     //arraylist operations
     int size=array.size();
     System.out.println(size);
     boolean items=array.isEmpty();
     System.out.println(items);
     array.remove(1);
     array.add(1, "anjana");
     System.out.println(array);
     array.contains(1);
     
     
	}

}

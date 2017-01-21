package javaCollections;

public class StringExamples {
	public static String reverse(String str)
	{
		if((str==null)||str.length()<=1 )
		{
			return str;
				
		}
		return reverse(str.substring(1)) +str.charAt(0);
	}
	public String reverseString(String str)
	{
		StringBuilder sb=new StringBuilder(str);
		char [] charArray=str.toCharArray();
		for(int i=charArray.length-1;i>=0; i--)
		{
			sb.append(charArray[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) 
	{
		//Compare two strings
		String str1="Java World";
		String str2="Java world";
		int value = str1.compareTo(str2);
		boolean b = str1.equalsIgnoreCase(str2);
		System.out.println(value);
		System.out.println(b);
       //reverse the string using recursion 
		StringExamples strobj=new StringExamples();
		String stroj="Deepika";
		System.out.println(stroj + strobj.reverse(stroj));
		//reverse string using iteration
		System.out.println(strobj.reverseString(stroj));
	}

	
}

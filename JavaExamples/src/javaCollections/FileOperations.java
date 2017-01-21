package javaCollections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		String FileName="C:\\Users\\Deepika\\Desktop\\framework details.txt";
		BufferedReader br=new BufferedReader(new FileReader(FileName) );
		String currentLine;
		while((currentLine=br.readLine())!=null)
		{
			System.out.println(currentLine);
		}
		
     
	}

}

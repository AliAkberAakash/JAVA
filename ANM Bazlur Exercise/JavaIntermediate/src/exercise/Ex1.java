package exercise;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.FileInputStream;

class Ex1 {

	public static void main(String[] args) {
		
		String path;
		Scanner scn = new Scanner(System.in);
		File file;
		FileInputStream fileStream=null;
		
		System.out.println("Enter the file path!");
		
		path = scn.nextLine();
		
		file = new File(path);
		
		if(!file.exists())
		{
			System.err.println("No such file or directory!");
			scn.close();
			return;
		}
		
		try
		{
			int characters,words,lines;
			characters = words = lines = 0;
			fileStream = new FileInputStream(path);
			int c;
			
			while((c=fileStream.read())!=-1)
			{
				char ch = (char) c;
				if(ch==' ')
					words++;
				else if(ch=='\n' || ch=='\r')
				{
					lines++;
					words++;
				}
				else
				{
					System.out.print(ch+"-");
					characters++;
				}
			}
			
			System.out.println("\nNumber of Characters: "+ characters);
			System.out.println("Number of Words: "+ words);
			System.out.println("Number of Lines: "+ lines);
			
		}
		catch(IOException e)
		{
			System.err.println("Couldn't read the File!");
		}
		finally
		{
			if(fileStream != null)
			{
				try
				{
					fileStream.close();
				}
				catch (IOException e)
				{
					System.err.println("Couldnt close the file.");
				}
			}
		}
		
		
		scn.close();
	}

}

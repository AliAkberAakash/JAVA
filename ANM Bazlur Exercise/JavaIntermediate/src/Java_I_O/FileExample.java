package Java_I_O;

import java.io.File;
import java.io.IOException;

public class FileExample {
	
	public static void main(String[] args)
	{
		File file = new File("Hello.txt");
		if(file.exists())
		{
			System.out.println("File exists already!!");
		}
		else
		{
			System.out.println("Creating new file...");
			
			try
			{
				file.createNewFile();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}


}

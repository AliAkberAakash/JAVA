package Java_I_O;

import java.io.File;
import java.io.IOException;

public class FileRenaming {

	public static void main(String[] args) {
		
		File oldFile = new File("old_hello.txt");
		File newFile = new File("new_hello.txt");
		
		if(!oldFile.isFile())
		{
			try
			{
				oldFile.createNewFile();
			}
			catch(IOException e)
			{
				e.getStackTrace();
			}
		}
		
		boolean fileRenamed = oldFile.renameTo(newFile);
		
		if(fileRenamed)
		{
			System.out.println(oldFile+" renamed to "+ newFile);
		}
		else
		{
			System.out.println("Renaming "+oldFile+ " to "+ newFile+ " failed.");
		}
	}

}

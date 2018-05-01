package exercise;

import java.io.File;

public class ex2 {
	
	public static void main(String args[])
	{
		String currentDirectory = System.getProperty("user.dir");
	
	File home = new File(currentDirectory);
	
	File [] rootList = home.listFiles();
	
	System.out.println("Number of files are: "+ rootList.length);
	}

}

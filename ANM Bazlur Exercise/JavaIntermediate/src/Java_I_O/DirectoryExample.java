package Java_I_O;

import java.io.File;
import java.io.IOException;

public class DirectoryExample {

	public static void main(String[] args) throws IOException{
		
		String myDir = System.getProperty("user.dir");
		
		System.out.println(myDir);
		
		File dir = new File(myDir+File.separator+"newDir");
		
		dir.mkdir();
		
		String dirPath = dir.getPath();
		
		System.out.println("Directory Path: "+ dirPath);
		
		String fileName = "hello.txt";
		File file = new File(dirPath+File.separator+fileName);
		
		try
		{
			file.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		String filePath = file.getPath();
		System.out.println("File path: "+filePath);
	}

}

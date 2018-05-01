package Java_I_O;

import java.io.File;

public class ListingFiles {

	public static void main(String[] args) {
		
		String currentDir = System.getProperty("user.dir");
		
		File home = new File(currentDir);
		
		File[] listRoots = home.listFiles();
		
		for(File file: listRoots)
		{
			System.out.println(file.getPath());
		}

	}

}

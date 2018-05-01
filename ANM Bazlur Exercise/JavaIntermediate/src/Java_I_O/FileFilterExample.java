package Java_I_O;

import java.io.File;
import java.io.FileFilter;

public class FileFilterExample {

	public static void main(String[] args) {
		
		File home = new File(System.getProperty("user.dir"));
		
		FileFilter txtFilter = new FileFilter()
		{
			@Override
			public boolean accept(File pathname)
			{
				String fileName = pathname.getName();
				if(fileName.endsWith(".txt"))
					return true;
				return false;
			}
			
		};
	
		File[] listRoots = home.listFiles(txtFilter);
		
		for(File file: listRoots)
		{
			System.out.println(file.getPath());
		}
		
		

	}

}

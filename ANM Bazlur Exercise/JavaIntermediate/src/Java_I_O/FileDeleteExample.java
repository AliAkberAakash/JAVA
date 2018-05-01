package Java_I_O;

import java.io.File;


public class FileDeleteExample {

	public static void main(String[] args) {
		
		File file1 = new File("hello.txt");
		file1.delete();
		
		File file2 = new File("hello.txt");
		
	    file2.deleteOnExit();

	}

}

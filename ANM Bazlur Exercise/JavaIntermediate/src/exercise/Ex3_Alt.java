package exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3_Alt {

	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		byte buffer[] = new byte[1024];
		
		try
		{
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output3.txt");
			
			int length;
			
			while((length = in.read(buffer)) != -1)
			{
				out.write(buffer, 0, length);
			}
			
			in.close();
			out.close();
			
		}
		catch (IOException e)
		{
			
		}

	}

}

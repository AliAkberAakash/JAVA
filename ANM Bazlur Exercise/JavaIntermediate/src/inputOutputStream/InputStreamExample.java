package inputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		
		try
		{
			in = new FileInputStream("input.txt");
			int c;
			while((c = in.read()) != -1)
				System.out.print((char)c+ ",");
		}
		catch (IOException e)
		{
			System.err.println("Could not read the file!");
		}
		finally
		{
			if(in!=null)
			{
				try
				{
					in.close();
				}
				catch(IOException e)
				{
					System.err.println("Could not close input stream!");
				}
			}
		}
		

	}

}

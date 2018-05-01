package inputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {

	public static void main(String[] args) {
		
		String destFile = "output.txt";
		String data = "yo yo yo";
		
		try
		{
			FileOutputStream fos = new FileOutputStream(destFile);
			fos.write(data.getBytes());
			fos.flush();
			fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}

package inputOutputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		
		Writer writer;
		String text = "My name is Aakash "+ "and I'm an ENGINEER!";
		
		try
		{
			writer = new FileWriter("output2.txt");
			writer.write(text);
			writer.flush();
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		

	}

}

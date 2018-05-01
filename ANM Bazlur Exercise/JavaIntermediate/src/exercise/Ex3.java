package exercise;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex3 {

	public static void main(String[] args) {
		
		FileReader in = null;
		FileWriter out = null;
		String content="";
		
		//reading part
		
		try
		{
			in = new FileReader("input.txt");
			int c;
			
			while((c=in.read()) != -1)
			{
				content+=(char)c;
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
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
					e.printStackTrace();
				}
			}
		}
		//reading part starts
		
		//writing part
		try
		{
			out =  new FileWriter("output2.txt");
			out.write(content);
			out.flush();
			out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		//writing part ends

	}

}

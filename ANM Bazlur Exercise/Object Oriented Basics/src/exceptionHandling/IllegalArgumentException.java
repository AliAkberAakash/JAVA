package exceptionHandling;

import java.util.*;

public class IllegalArgumentException {
	
	public void takesUrl(String url) throws CheckedException
	{
		if(url==null)
			throw new CheckedException("Url not found");
	}
	
}

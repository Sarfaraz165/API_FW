package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandling 
{

	public static Properties ReadProperties(String path) throws IOException
	{
		File f=new File(path);
		FileInputStream fi=new FileInputStream(f);
		Properties pr=new Properties();
		pr.load(fi);
		return pr;
		
				
	}
	
}

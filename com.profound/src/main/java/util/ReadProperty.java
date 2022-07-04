package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class ReadProperty {
	
	static FileInputStream   file;
	public static String read(String Key) throws IOException {
		
		try {
			file=new FileInputStream("./property.properties");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties prop=new Properties();
		
		
	
			prop.load(file);
		
		
		String value=prop.getProperty(Key);
		
		
		
		
		
		return value;
		
		
		
	}
	
}

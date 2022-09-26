package Properities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class example {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		// FileInputStream file= new FileInputStream("src/Properities/db.properties");

		p.load(new FileInputStream("src/Properities/db.properties"));
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("pass"));
		System.out.println(p.getProperty("user"));
	}
}

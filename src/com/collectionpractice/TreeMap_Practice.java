package com.collectionpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.TreeMap;

public class TreeMap_Practice {
	
	
	public static void main(String[] args) throws IOException {
		
		TreeMap hm = new TreeMap();
		

	 
		
		hm.put(102, "Napa");
		
		hm.put(103, "Balaji");
		
		hm.put(104, "Nirmala");
		
		hm.put(101, "Bharath");
		
		System.out.println(hm);
		
		File f = new File("C:\\Users\\lenovo\\Javapractice\\JavaProject\\src\\com\\collectionpractice\\test.properties");
	
		FileInputStream fis = new FileInputStream(f);
		
		Properties p = new Properties();
		
        p.load(fis);
        
        String st = p.getProperty("pant");
        
        System.out.println(st);
        
        
        p.setProperty("pant", "2000");
        
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lenovo\\Javapractice\\JavaProject\\src\\com\\collectionpractice\\test.properties");
	
       
        p.store(fos, st);
	}

}

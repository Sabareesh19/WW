package ww_q1_dictionary;

import java.nio.file.Files;
import java.nio.file.Paths;

public class From_files {
	
	public static String doFileExists(String path) throws Exception {
	String data = ""; 
	try {
	    data = new String(Files.readAllBytes(Paths.get(path)));	
	    if(!data.isEmpty()) { 
	    	System.out.println("The specified file is found in the location");		
	    }
	}
	catch(Exception e) {
	    	System.out.println("The file do not exist, please enter a valid path");
	    }
	    return data; 
		
	}  
	
	
	public static void main(String[] args) throws Exception 
	{ 
		//Enter path of the file here
		doFileExists("S:\\Sampletext.txt"); 
	} 
}
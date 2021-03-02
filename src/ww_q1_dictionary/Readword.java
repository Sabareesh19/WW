package ww_q1_dictionary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
public class Readword {
public static void main( String[] args ) throws Exception
{	
   // Enter the path of the file
   String filePath = "S:\\Sampletext.txt";
   String line;
   HashMap<String, String> map = new HashMap<String, String>();
   try {
   BufferedReader reader = new BufferedReader(new FileReader(filePath));
   while ((line=reader.readLine()) != null)
   {
    // Split the sentence into key, value when hyphen is found
    String[] parts = line.split("–"); 
       if (parts.length > 1)
       {      
    	   String trim_spaces = parts[0].trim();
    	   String key = trim_spaces;
           String value = parts[1];
           map.put(key, value);
       } else {
           System.out.println("Do no meet given requirement, ignoring this line --> " + line);
       }
   }

   for (String key : map.keySet())
   {  
       System.out.println(key);

       String[] dictionary_list = map.get(key).split(",");
       for(String dict:dictionary_list) {
    	   System.out.println(dict.trim());
       }   
   }
   reader.close();
   } catch(Exception e) {
	   System.out.println("Sorry, please enter a readable file, that exists in valid path.");
   }
}
}
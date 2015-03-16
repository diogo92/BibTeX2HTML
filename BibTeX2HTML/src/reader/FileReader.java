package reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileReader {
	static Path file;
	static ArrayList <String> entry = new ArrayList<String>();
	static String current;
	
	public static void main(String args[]){
		file = Paths.get(args[0]);
		current = "";
		int i=0;
		
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	while(!line.endsWith("}"))
		    	{
		    		current+=line;
		    	}
		    	entry.add(i, current);
		    	i++;
		    	current = "";
		    }
		    for(int a=0; a<entry.size(); a++)
		    {
		    	System.out.println(entry.get(a));
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
	}
}

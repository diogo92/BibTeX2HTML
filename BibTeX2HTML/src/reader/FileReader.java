package reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class FileReader {
	static ArrayList <String> entry = new ArrayList<String>();
	static String current;
	
	public static boolean checkExtension(String file){
		String bibExt = "bib";
		String ext = file.substring(file.lastIndexOf(".") + 1, file.length());
		if(!bibExt.equals(ext)){
			return false;
		}
		else return true;
		
	}
	public static InputStream getFile(String file) throws FileNotFoundException,FileException{
		if (file==""){
			throw new FileException("Empty filename");
		}
		if (!checkExtension(file)){
			throw new FileException("Please select a file with the .bib extension");
		}
		return new FileInputStream(new File(file));
	}
	
	public static String getString(InputStream targetStream) throws IOException{
		int curr=0;
		String res="";
		while((curr=targetStream.read())!=-1){
			res+=((char)curr);	
		}
		targetStream.close();
		return res;
	}
	
}

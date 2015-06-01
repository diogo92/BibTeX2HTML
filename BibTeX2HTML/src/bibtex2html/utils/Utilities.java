package bibtex2html.utils;

public class Utilities {

	public static boolean contains(int[] arr, int targetValue) {
		for(int i = 0;i<arr.length;i++){
			if((arr[i]) == targetValue){
				return true;
			}
		}
		return false;
	}
	
	public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	}
}

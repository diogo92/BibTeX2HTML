package data;

public class BookletData extends BibData {
	public String author;
	public String title;
	public String howpublished;
	public Integer year;
	public String address;
	public String month;
	public String note;
	public String key;
	
	// Standard Constructor
	public BookletData(){
		citationKey = null;
		author = null;
		title = null;
		howpublished = null;
		year = null;
		address = null;
		month = null;
		note = null;
		key = null;
	}
	
	// Required Data Constructor
	public BookletData(String ck,String t){
		citationKey = ck;
		author = null;
		title = t;
		howpublished = null;
		year = null;
		address = null;
		month = null;
		note = null;
		key = null;
	}
	
	// Full Data Constructor
	public BookletData(String ck, String a, String t, String j, 
			Integer y,
			String pa, String mo, String no, String k){
		citationKey = ck;
		author = a;
		title = t;
		howpublished = j;
		year = y;
		address = pa;
		month = mo;
		note = no;
		key = k;
	}
	
	// Gets for FreeMarker HTML Parse
	public String getAuthor(){
		return author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getHowpublished(){
		return howpublished;
	}
	
	public Integer getYear(){
		return year;
	}
	
	
	public String getAddress(){
		return address;
	}
	
	public String getMonth(){
		return month;
	}
	
	public String getNote(){
		return note;
	}
	
	public String getKey(){
		return key;
	}
	
	public String toString(){
		return super.toString() 
				+ "," + author
				+ "," + title
				+ "," + howpublished
				+ "," + year
				+ "," + address
				+ "," + month
				+ "," + note
				+ "," + key;
	}
}

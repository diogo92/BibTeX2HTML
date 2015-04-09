package data;

public class BookData extends BibData {
	public String author;
	public String title;
	public String publisher;
	public Integer year;
	public Integer volume;
	public Integer number;
	public Integer edition;
	public String series;
	public String address;
	public String month;
	public String note;
	public String key;
	
	// Standard Constructor
	public BookData(){
		citationKey = null;
		author = null;
		title = null;
		publisher = null;
		year = null;
		volume = null;
		number = null;
		series = null;
		edition = null;
		address = null;
		month = null;
		note = null;
		key = null;
	}
	
	// Required Data Constructor
	public BookData(String ck, String a, String t, String j, 
			Integer y){
		citationKey = ck;
		author = a;
		title = t;
		publisher = j;
		year = y;
		volume = null;
		number = null;
		edition = null;
		series = null;
		address = null;
		month = null;
		note = null;
		key = null;
	}
	
	// Full Data Constructor
	public BookData(String ck, String a, String t, String j, 
			Integer y, Integer v, Integer n, Integer ed, String ser,
			String pa, String mo, String no, String k){
		citationKey = ck;
		author = a;
		title = t;
		publisher = j;
		year = y;
		volume = v;
		number = n;
		edition = ed;
		series = ser;
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
	
	public String getPublisher(){
		return publisher;
	}
	
	public Integer getYear(){
		return year;
	}
	
	public Integer getVolume(){
		return volume;
	}
	
	public Integer getNumber(){
		return number;
	}
	
	public String getSeries(){
		return series;
	}
	
	public Integer getEdition(){
		return number;
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
				+ "," + publisher
				+ "," + year
				+ "," + volume
				+ "," + number
				+ "," + series
				+ "," + edition
				+ "," + address
				+ "," + month
				+ "," + note
				+ "," + key;
	}
}

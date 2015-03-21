package data;

public class ArticleData extends BibData {
	public String author;
	public String title;
	public String journal;
	public Integer year;
	public Integer volume;
	public Integer number;
	public String pages;
	public String month;
	public String note;
	public String key;
	
	// Standard Constructor
	public ArticleData(){
		citationKey = null;
		author = null;
		title = null;
		journal = null;
		year = null;
		volume = null;
		number = null;
		pages = null;
		month = null;
		note = null;
		key = null;
	}
	
	// Required Data Constructor
	public ArticleData(String ck, String a, String t, String j, 
			Integer y){
		citationKey = ck;
		author = a;
		title = t;
		journal = j;
		year = y;
		volume = null;
		number = null;
		pages = null;
		month = null;
		note = null;
		key = null;
	}
	
	// Full Data Constructor
	public ArticleData(String ck, String a, String t, String j, 
			Integer y, Integer v, Integer n,
			String pa, String mo, String no, String k){
		citationKey = ck;
		author = a;
		title = t;
		journal = j;
		year = y;
		volume = v;
		number = n;
		pages = pa;
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
	
	public String getJournal(){
		return journal;
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
	
	public String getPages(){
		return pages;
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
				+ "," + journal
				+ "," + year
				+ "," + volume
				+ "," + number
				+ "," + pages
				+ "," + month
				+ "," + note
				+ "," + key;
	}
}

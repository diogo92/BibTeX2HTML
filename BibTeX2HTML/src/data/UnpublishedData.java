package data;

public class UnpublishedData extends BibData {

	//standard constructor
	public UnpublishedData(){
		super();
	}
	
	//required data constructor
	public UnpublishedData(String _author, String _title, String _note){
		author = _author;
		title = _title;
		note = _note;
		month = null;
		year = null;
		key = null;
	}
	
	//optional data constructor
	public UnpublishedData(String _author, String _title, String _note, String _month, Integer _year, String _key){
		author = _author;
		title = _title;
		note = _note;
		month = _month;
		year = _year;
		key = _key;
	}
	
	// Gets for FreeMarker HTML Parse
	public String getAuthor(){
		return author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getNote(){
		return note;
	}
	
	public String getMonth(){
		return month;
	}	
	
	public Integer getYear(){
		return year;
	}
	
	public String getKey(){
		return key;
	}
	
	
	public String toString(){
		return super.toString() 
				+ "," + author
				+ "," + title
				+ "," + note				
				+ "," + month
				+ "," + year
				+ "," + key;
	}
}

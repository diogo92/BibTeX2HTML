package data;

public class MastersthesisData extends BibData {
	//standar Constructor
	public MastersthesisData(){
		super();
	}
	
	//required data constructor
	public MastersthesisData(String _author, String _title, String _school, Integer _year){
		author = _author;
		title = _title;
		school = _school;
		year = _year;
		type = null;
		address = null;
		month = null;
		note = null;
		key = null;
		
	}
	
	//optional data constructor
	public MastersthesisData(String _author, String _title, String _school, Integer _year, String _type, String _address, String _month, String _note, String _key){
		author = _author;
		title = _title;
		school = _school;
		year = _year;
		type = _type;
		address = _address;
		month = _month;
		note = _note;
		key = _key;
	}
	
	// Gets for FreeMarker HTML Parse
	public String getAuthor(){
		return author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getSchool(){
		return school;
	}
	
	public Integer getYear(){
		return year;
	}
	
	public String getType(){
		return type;
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
				+ "," + school
				+ "," + year
				+ "," + type
				+ "," + address
				+ "," + month
				+ "," + note
				+ "," + key;
	}
}

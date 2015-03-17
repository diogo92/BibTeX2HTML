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

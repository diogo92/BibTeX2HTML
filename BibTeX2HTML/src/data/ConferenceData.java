package data;

public class ConferenceData extends BibData {

	public ConferenceData() {
		super();
	}

	// Required data constructor
	public ConferenceData(String au, String ti, String bt, Integer ye) {
		author = au;
		title = ti;
		booktitle = bt;
		year = ye;
	}

	// Optional data constructor

	public ConferenceData(String au, String ti, String bt, Integer ye,
			String ed, Integer vol, Integer num, String ser, String pag,
			String addr, String mon, String org, String pub, String no) {
		author = au;
		title = ti;
		booktitle = bt;
		year = ye;
		editor = ed;
		volume = vol;
		number = num;
		series = ser;
		pages = pag;
		address = addr;
		month = mon;
		organization = org;
		publisher = pub;
		note = no;
	}
}

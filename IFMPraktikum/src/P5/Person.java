package P5;

import java.util.GregorianCalendar;

public class Person {
	private String name;
	private String adresse;
	private GregorianCalendar birthday;
	
	Person(String name, String adresse, int day, int month, int year){
		setName(name);
		setAdresse(adresse);
		setBirthday(day, month, year);				
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}	
	public String getAdresse() {
		return adresse;
	}
	public void setBirthday(int day, int month, int year) {
	    this.birthday = new GregorianCalendar(year, month, day);
	}
	public GregorianCalendar getBirthday() {
	    return birthday;
	}
}

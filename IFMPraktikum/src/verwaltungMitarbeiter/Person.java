package verwaltungMitarbeiter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person extends CounterClass{
	final String surName, firstName;
	String street, city;
	int zip;
	final GregorianCalendar birthDay;
	final GregorianCalendar today;
	int number;

	public Person(String surName, String firstName, String street, String city, int zip, int day, int month, int year) {
		this.surName = surName;
		this.firstName = firstName;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.birthDay = new GregorianCalendar(year,month-1, day);
		this.today = new GregorianCalendar();
		counter++;
		number = counter;
	}
	
	public Person(String surName, String firstName, GregorianCalendar birthday) {
		this.surName = surName;
		this.firstName = firstName;
		this.birthDay = birthday;
		this.today = new GregorianCalendar();
		counter++;
		number = counter;
	}
	
	public Person(String surName, String firstName, int day, int month, int year) {
		this.surName = surName;
		this.firstName = firstName;
		this.birthDay = new GregorianCalendar(year,month-1, day);
		this.today = new GregorianCalendar();
		counter++;
		number = counter;
	}
	
	public int getAge() {
		int age = today.get(Calendar.YEAR)-birthDay.get(Calendar.YEAR);
		if (today.get(Calendar.MONTH) < birthDay.get(Calendar.MONTH)) {
			age--;
		} else if (today.get(Calendar.MONTH) == birthDay.get(Calendar.MONTH)) {
			if (today.get(Calendar.DATE) < birthDay.get(Calendar.DATE)) {
				age--;
			}
		}
		return age;
	}
	
	public String toString() {
		return String.format("%s %19s %11s %4d", number, surName, firstName, this.getAge());
	}

}

package verwaltungMitarbeiter;

public class AngeMitarbeiter extends Mitarbeiter {

	private double healthInsurance = 7.3;
	private double nursingCareInsurance;
	private boolean hasKids;

	public AngeMitarbeiter(String surName, String firstName, String street, String city, int zip, int day, int month, int year, double salary, boolean hasKids) {
		super(surName, firstName, street, city, zip, day, month, year, salary);
		
		if (this.getAge() >= this.ageThreshold  && !this.hasKids) {
			this.healthInsurance = nursingCareWithoutKids ;
		} else {
			this.healthInsurance = nursingCareWithKids; 
		}
		
	}
	
	private final double getSocialInsuranceFaktor() {
		return 100 -(healthInsurance+ nursingCareInsurance + unemploymentInsurance+retirementInsurance);
	}
	
	public double getNetto() {
		double retVal = (salary * getSocialInsuranceFaktor()/100); 
		return retVal;
	}
	
	public boolean haveToPayTaxes() {
		return getNetto() * 12 > TAXEXEMPTION;
	}
	
}

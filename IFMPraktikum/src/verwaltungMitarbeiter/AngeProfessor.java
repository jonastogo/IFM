package verwaltungMitarbeiter;

public class AngeProfessor extends Professor {

	private double nursingCareInsurance;
	private double healthInsurance = 7.3;
	private final boolean hasKids;

	public AngeProfessor(String surName, String firstName, String street,
			String city, int zip, int day, int month, int year, double salary,
			boolean hasKids) {
		super(surName, firstName, street, city, zip, day, month, year, salary);
		this.hasKids = hasKids;

		if (this.getAge() >= this.ageThreshold && !this.hasKids) {
			this.healthInsurance = nursingCareWithoutKids;
		} else {
			this.healthInsurance = nursingCareWithKids;
		}
	}

	private final double getSocialInsuranceFaktor() {
		double retVal = (100 - (healthInsurance + nursingCareInsurance
				+ unemploymentInsurance + retirementInsurance)) / 100;
		return retVal;
	}

	public double getNetto() {
		return salary * getSocialInsuranceFaktor();
	}

	public boolean haveToPayTaxes() {
		return getNetto() * 12 > TAXEXEMPTION;
	}

}

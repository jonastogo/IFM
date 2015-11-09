package P5;

public class Hilfskraft extends Person {
	private double wstunden;
	
	Hilfskraft(String name, String adresse, int day, int month, int year, double wstunden) {
		super(name, adresse, day, month, year);
		setWstunden(wstunden);
	}
	public void setWstunden(double wstunden) {
		if(wstunden > 10 )
			this.wstunden = 10;
		else
			this.wstunden = wstunden;
	}

	public double getWstunden() {
		return wstunden;
	}
}

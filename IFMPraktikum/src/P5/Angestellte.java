package P5;

public class Angestellte extends Person{
	private double steuersatz;
	private boolean kind;
	
	Angestellte(String name, String adresse, int day, int month, int year, boolean kind) {
		super(name, adresse, day, month, year);
		this.kind = kind;
		setSteuersatz();
	}
	public void setSteuersatz() {
		if(kind) //
			this.steuersatz = 20.35;
		else
			this.steuersatz = 20.5;
	}
	
	public double getSteuersatz() {
		return steuersatz;
	}
}

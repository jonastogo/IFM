package P5;

public class Mitarbeiter extends Angestellte{
	boolean verbeamtet;
	
	Mitarbeiter(String name, String adresse, int day, int month, int year, boolean kind, boolean verbeamtet) {
		super(name, adresse, day, month, year, kind);
		setVerbeamtet(verbeamtet);
	}

	public boolean isVerbeamtet() {
		return verbeamtet;
	}

	public void setVerbeamtet(boolean verbeamtet) {
		this.verbeamtet = verbeamtet;
	}

}

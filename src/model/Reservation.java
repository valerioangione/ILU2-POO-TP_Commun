package model;

public abstract class Reservation {
	private int mois;
	private int jour;
	
	public Reservation(int mois, int jour) {
		this.mois=mois;
		this.jour=jour;
	}
	
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	
	public abstract void toString();
	

}

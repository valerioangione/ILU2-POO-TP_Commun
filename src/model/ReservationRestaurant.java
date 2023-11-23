package model;

public class ReservationRestaurant extends Reservation{
	private int service;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int service, int numTable) {
		super(mois,jour);
		this.service=service;
		this.numTable=numTable;		
	}
	
	public void toString() {
		System.out.println("Réservation pour le "+getJour()+"/"+getMois()+" au service "+service+" à la table " + numTable);
	}

}

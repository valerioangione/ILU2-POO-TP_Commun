package model;

public class CalendrierAnnuel {
	private Mois[] cal;
	
	public CalendrierAnnuel() {
		cal = new Mois[12];
		String[] nom = {"janvier","février","mars","avril","mai","juin","juillet","août","septembre","octobre","novembre","décembre"};
		int[] taille = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i=0;i<12;i++) {
			cal[i] = new Mois(nom[i],taille[i]);
		}
	}
	
	public boolean estLibre(int jour, int mois) {
		return cal[mois].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		
		
		return false;
	}
	
	
	////////////////////////// Classe interne ////////////////////////////////////////////////
	
	private static class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			jours = new boolean[nbJours];
			for (int i=0; i<nbJours;i++) {
				jours[i]=false;
			}
		}
		
		private boolean estLibre(int jour) {
			return jours[jour-1];
		}
		
		private void reserver(int jour) {
			jours[jour-1]=true;
		}
	}
	

}

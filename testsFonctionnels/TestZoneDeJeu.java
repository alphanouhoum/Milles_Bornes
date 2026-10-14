package testsFonctionnels;

import jeu.ZoneDeJeu;
import cartes.Borne;
import cartes.DebutLimite;
import cartes.FinLimite;

public class TestZoneDeJeu {

	public static void main(String[] args) {
		ZoneDeJeu zoneDeJeu = new ZoneDeJeu();
		
		zoneDeJeu.deposer(new Borne(25));
		zoneDeJeu.deposer(new Borne(50));
		zoneDeJeu.deposer(new Borne(75));	
		
		
		
		System.out.println("Total des bornes : "+ zoneDeJeu.donnerKmParcourus());
		
		System.out.println("Limite : " + zoneDeJeu.donnerLimitationVitesse());
		zoneDeJeu.deposer(new DebutLimite());	
		System.out.println("Limite : " + zoneDeJeu.donnerLimitationVitesse());
		zoneDeJeu.deposer(new FinLimite());	
		System.out.println("Limite : " + zoneDeJeu.donnerLimitationVitesse());
	

	
	}
}

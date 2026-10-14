package jeu;

import java.util.ArrayList;
import java.util.List;

import cartes.Bataille;
import cartes.Borne;
import cartes.Carte;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.Limite;

public class ZoneDeJeu {
	private List<Limite> pileLimites = new ArrayList<>();
	private List<Bataille> pileBatailles = new ArrayList<>();
	private List<Borne> collectionBornes = new ArrayList<>();
	
	public int donnerLimitationVitesse() {
		if (pileLimites.isEmpty() || pileLimites.getLast() instanceof FinLimite) {
			return 200;
		}
		return 50;
	}
	
	public int donnerKmParcourus() {
		int kmTotal = 0;
		
		for (Borne borne : collectionBornes) {
			kmTotal += borne.getKm();
		}
		
		return kmTotal;
	}
	
	public void deposer(Carte carte) {
		if (carte instanceof Borne borne) {
			collectionBornes.add(borne);
		}
		
		if (carte instanceof Limite limite) {
			pileLimites.add(limite);
		}
		
		if (carte instanceof Bataille bataille) {
			pileBatailles.add(bataille);
		}
		System.out.println("Deposer carte "+ carte.toString());
	}

}

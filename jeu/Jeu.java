package jeu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cartes.JeuDeCartes;
import utils.GestionCartes;
import cartes.Carte;

public class Jeu {
	private Sabot sabot;
	

	public Jeu() {
		JeuDeCartes jeuDeCarte = new JeuDeCartes();
		List<Carte> listeCartes = new ArrayList<Carte>();
		
		Collections.addAll(listeCartes, jeuDeCarte.donnerCartes());
		listeCartes = GestionCartes.melanger(listeCartes);
		
		this.sabot = new Sabot(listeCartes.toArray(new Carte[0]));
		
	}
	
	
}

package testsFonctionnels;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import cartes.Carte;
import cartes.JeuDeCartes;
import jeu.Jeu;
import utils.GestionCartes;

public class TestMethodeGestionCarte {
	
	public static void main(String[] args) {
		JeuDeCartes jeu = new JeuDeCartes();
		List<Carte> listeCarteNonMelanger = new LinkedList<>();
		
		for(Carte carte : jeu.donnerCartes()) {
			listeCarteNonMelanger.add(carte);
		}
		
		List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelanger);
		System.out.println(listeCartes);
		listeCartes = GestionCartes.melanger(listeCartes);
		System.out.println(listeCartes);
		System.out.println("liste mélangée sans erreur ?"
				+ GestionCartes.verifierMelange(listeCarteNonMelanger, listeCartes));
		listeCartes = GestionCartes.rassembler(listeCartes);
		System.out.println(listeCartes);
		System.out.println("liste rassemblée sans erreur ? "
				+ GestionCartes.verifierRassemblement(listeCartes));
		
	}

}

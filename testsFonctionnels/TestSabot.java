package testsFonctionnels;

import java.util.Iterator;

import cartes.Carte;
import cartes.JeuDeCartes;
import jeu.Sabot;

public class TestSabot {
	public static void main(String[] args) {
		JeuDeCartes jeu = new JeuDeCartes();
		Carte[] cartes = jeu.donnerCartes();
		Sabot sabot = new Sabot(cartes);
		
		for (int i = 0; i < cartes.length; i++) {
			System.out.println("-" + (i+1) +" je pioche "+ sabot.piocher().toString());			
		}
		
		System.out.println("Boucle b) \n");
		Carte[] cartes2 = jeu.donnerCartes();
		Sabot sabot2 = new Sabot(cartes2);
		Iterator<Carte> iter = sabot2.iterator();
		
		while(iter.hasNext()) {
			System.out.println(" je pioche "+ iter.next().toString());
				iter.remove();
		}
		
		
	}

}

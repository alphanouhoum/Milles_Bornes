package jeu;

import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;

public class Sabot implements Iterator<Carte>{
	private int nbCartes;
	private Carte[] cartes;
	private int indiceIterator = 0;
	private boolean nextEffectue = false;

	public Sabot(Carte[] cartes) {
		this.cartes = cartes;
		this.nbCartes = cartes.length;  //initialement toutes les cartes du jeu.
	}
	
	public boolean estVide() {
		return nbCartes == 0;
	}
	
	public void ajouterCarte (Carte carte) {
		if (nbCartes == cartes.length) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
			cartes[nbCartes] = carte;
			nbCartes++;
		}
	}

	@Override
	public boolean hasNext() {
		return indiceIterator < nbCartes;
	}

	@Override
	public Carte next() {
		if (hasNext()) {
			Carte carte = cartes[indiceIterator];
			indiceIterator++;
			nextEffectue = true;
			return carte;
		}else {
			throw new NoSuchElementException();
		}
	}
	
	@Override
	public void remove() {
		if (nbCartes < 1 || !nextEffectue) {
			throw new IllegalStateException();
		}
		for (int i = indiceIterator - 1; i < nbCartes - 1; i++) {
			cartes[i] = cartes[i + 1];
		}
		nextEffectue = false;
		indiceIterator--; // indice du prochain élément à visiter (s’il existe)			
		nbCartes--;
		
	}
	
	public Carte piocher() {
		try {
			Carte cartePiocher = next();
			remove();
			return cartePiocher;
			
		} catch  (NoSuchElementException e) {
			System.out.println("La pioche est Vide");
			//e.getMessage();
			return null;
		}
		
	}
	
	
}

package testsFonctionnels;

import cartes.Attaque;
import cartes.Borne;
import cartes.Type;
import cartes.Carte;
import cartes.Parade;


public class TestMethodeEquals {

	public static void main(String[] args) {
		Borne borne1 = new Borne(25);
		Borne borne2 = new Borne(25);
		
		System.out.println("Borne 1 : " + borne1);
		System.out.println("Borne 2 : " + borne2);
		boolean egaux = borne1.equals(borne2);
		System.out.println(egaux);
		
		Carte feuRouge1 = new Attaque(Type.FEU);
		Carte feuRouge2 = new Attaque(Type.FEU);
		Carte feuVert = new Parade(Type.FEU);
		
		System.out.println("Feu rouge egaux ? " + feuRouge1.equals(feuRouge2));
		System.out.println("Feu rouge Feu vert egaux ? " + feuRouge1.equals(feuVert));
	}

}

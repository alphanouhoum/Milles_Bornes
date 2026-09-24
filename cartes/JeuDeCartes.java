package cartes;

public class JeuDeCartes {
	private Configuration[] typesDeCartes = {
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(50), 10),
			new Configuration(new Borne(70), 10),
			new Configuration(new Borne(100), 10),
	};
	
	
	
	//////////////Classe Interne////////////////////
		 
	private static class Configuration {
		private int nbExemplaires;
		private Carte carte;
		
		
		private Configuration(Carte carte, int nbExemplaires) {
			this.nbExemplaires = nbExemplaires;
			this.carte = carte;
		}
		
		
		private int getNbExemplaires() {
			return nbExemplaires;
		}
		
		
		private Carte getCarte() {
			return carte;
		}
	
	}
	//////////////Fin Classe Interne////////////////
	
	

	
	
	public String affichageJeuDeCartes () {
		StringBuilder string = new StringBuilder();
		//string.append("JEU:" + "\n\n");
		for (Configuration configuration : typesDeCartes) {
			if (configuration != null) {
				string.append(configuration.getNbExemplaires() + " ");
				string.append(configuration.getCarte() + "\n");
			}
			
		}
		return string.toString();
	}
	
	public Carte[] donnerCartes() {
		int nbTotaCartes = 0;
		for (Configuration configuration : typesDeCartes) {
			if (configuration != null) {
				nbTotaCartes += configuration.getNbExemplaires();
				
			}
		}
		
		Carte[] cartes = new Carte[nbTotaCartes];
		int indiceCarte = 0;
		
		for (Configuration configuration : typesDeCartes) {
			if (configuration != null) {
				int nbExmplaire = configuration.getNbExemplaires();
				Carte carte = configuration.getCarte();
				
				for (int i = 0; i < nbExmplaire; i++) {
					cartes[indiceCarte] = carte;
					indiceCarte++;
				}
			}
		}
		
		return cartes;
		
	}
	
	

}

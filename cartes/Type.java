package cartes;

public enum Type {
	/*Attack, Parade, botte*/
	FEU ("Feu rouge", "Feu Vert", "Prioritaire"),
	ESSENCE ("Panne d’Essence", "Essence", "Citerne d’Essence"), 
	CREVAISON ("Crevaison", "Roue de Secours", "Increvable"), 
	ACCIDENT("Accident", "Réparations", "As du Volant");
	
	private final String attaque;
	private final String parade;
	private final String botte;
	
	private Type(String attaque, String parade, String botte) {
		this.attaque = attaque;
		this.parade = parade;
		this.botte = botte;
	}

	public String getAttaque() {
		return attaque;
	}

	public String getParade() {
		return parade;
	}

	public String getBotte() {
		return botte;
	}
	
}

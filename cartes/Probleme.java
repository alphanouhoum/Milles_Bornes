package cartes;

public class Probleme extends Carte {
	private Type type; 
	
	public Probleme(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Attaque attaque) {
			return type == attaque.getType();
		}
		
		return false;
	}
}

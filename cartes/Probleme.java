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
		if (obj instanceof Parade parade) {
			return type.equals(parade.getType());
		}
		if (obj instanceof Attaque attaque) {
			return type.equals(attaque.getType());
		}
		if (obj instanceof Botte botte) {
			return type.equals(botte);
		}
		System.out.println("passer");
		
		return false;
	}
}

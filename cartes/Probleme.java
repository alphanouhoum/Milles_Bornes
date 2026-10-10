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
	    if (this == obj) return true;
	    
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Probleme probleme = (Probleme) obj;
	    return type == probleme.type;
	}
}

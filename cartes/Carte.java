package cartes;

public class Carte {
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Carte carte) {
			return obj.equals(carte);
		}
		return false;
	}

	
}

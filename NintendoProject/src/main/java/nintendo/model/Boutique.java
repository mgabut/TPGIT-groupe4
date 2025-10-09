package nintendo.model;

public class Boutique {

	String nom;
	String Adresse;
	
	public Boutique(String nom, String adresse) {
		super();
		this.nom = nom;
		this.Adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		this.Adresse = adresse;
	}

	
	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + Adresse + "]";
	}
	
	
}

package nintendo.model;

import java.time.LocalDate;
public abstract class Console {

	private String nom;
	private double prix;
	private LocalDate dateSortie;
	

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	public Console(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Console(String nom, double prix, LocalDate dateSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Console " + this.getClass().getSimpleName() + " [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}
	
	
	
	
	
	
	
	
}




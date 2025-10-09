package nintendo.model;

import java.time.LocalDate;
import java.util.Date;

public class Achat {
	private Jeu jeu;
	private LocalDate date;
	private double prix;
	
	public Achat(Jeu jeu, LocalDate date, double prix) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}

	public Jeu getJeu() {
		return jeu;
	}

	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}

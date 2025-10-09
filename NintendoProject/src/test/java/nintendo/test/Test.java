package nintendo.test;

import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console Switch = new Salon("Switch");
<<<<<<< Updated upstream
		Console PS5 = new Salon("PS5");
=======
		Console PS5 = new Hybride("PS5");
>>>>>>> Stashed changes
		
		Jeu SmashBros = new Jeu("Smash Bros", Switch);
		Jeu MarioKart = new Jeu("Mario Kart", Switch);
		Jeu BOTW = new Jeu("Breath Of The Wild", Switch);
		Jeu FIFA25 = new Jeu("FIFA 25", PS5);
		Jeu COD = new Jeu("Call Of Duty", PS5);
		
		Client c1 = new Client("John", "Doe");
		Client c2 = new Client("Jane", "Doe");
		
		System.out.println(COD);
	}

}

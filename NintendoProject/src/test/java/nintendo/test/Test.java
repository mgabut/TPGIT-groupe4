package nintendo.test;

import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console Switch = new Console("Switch");
		Console PS5 = new Console("PS5");
		
		Jeu SmashBros = new Jeu("Smash Bros", Switch);
		Jeu MarioKart = new Jeu("Mario Kart", Switch);
		Jeu BOTW = new Jeu("Breath Of The Wild", Switch);
		Jeu FIFA25 = new Jeu("FIFA 25", PS5);
		Jeu COD = new Jeu("Call Of Duty", PS5);
		
		System.out.println(COD);
	}

}

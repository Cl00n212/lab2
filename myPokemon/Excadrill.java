package myPokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import myPokemon.myPokemonMove.BrutalSwing;

public class Excadrill extends Drilbur {
	//https://veekun.com/dex/pokemon/Excadrill
	public Excadrill(String name, int level) {
		
		super(name, level);
		
		super.setType(Type.GROUND);
		
		super.setStats(60, 85, 40, 30, 45, 68);
		
		myAddMove();
	}
	protected void myAddMove(){
		super.myAddMove();
		
		BrutalSwing brutalSwing = new BrutalSwing(60,100);
		
		super.addMove(brutalSwing);
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar;C:\Users\cloon\Desktop  *.java
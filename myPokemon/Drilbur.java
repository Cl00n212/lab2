package myPokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import myPokemon.myPokemonMove.PoisonJab;
import myPokemon.myPokemonMove.Slash;
import myPokemon.myPokemonMove.Bulldoze;

public class Drilbur extends Pokemon {
	//https://veekun.com/dex/pokemon/Drilbur
	public Drilbur(String name, int level) {
		super(name, level);
		
		super.setType(Type.GROUND);
		
		super.setStats(60, 85, 40, 30, 45, 68);
		
		myAddMove();
		
	}
	protected void myAddMove(){
		PoisonJab poisonJab = new PoisonJab(80,100);
		Slash slash = new Slash(70,100);
		Bulldoze bulldoze = new Bulldoze(60,100);
		
		super.setMove(poisonJab, slash, bulldoze);
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar;C:\Users\cloon\Desktop  *.java
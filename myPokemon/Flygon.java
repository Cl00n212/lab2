package myPokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import myPokemon.myPokemonMove.RockTomb;
import myPokemon.myPokemonMove.Bulldoze;
import myPokemon.myPokemonMove.Boomburst;
import myPokemon.myPokemonMove.FireBlast;

public class Flygon extends Vibrava {
	//https://veekun.com/dex/pokemon/Flygon
	public Flygon(String name, int level) {
		super(name, level);
		
		super.setType(Type.GRASS,Type.DRAGON);
		
		super.setStats(80, 100, 80, 80, 80, 100);
		
		myAddMove();
	}
	protected void myAddMove(){
		super.myAddMove();
		
		FireBlast fireBlast = new FireBlast(110,85);
		
		super.addMove(fireBlast);
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar;C:\Users\cloon\Desktop  *.java
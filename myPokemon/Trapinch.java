package myPokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import myPokemon.myPokemonMove.RockTomb;
import myPokemon.myPokemonMove.Bulldoze;

public class Trapinch extends Pokemon {
	//https://veekun.com/dex/pokemon/trapinch
	public Trapinch(String name, int level) {
		super(name, level);
		
		super.setType(Type.GRASS);
		
		super.setStats(45, 100, 45, 45, 45, 10);
		
		myAddMove();
	}
	protected void myAddMove(){
		RockTomb rockTomb = new RockTomb(60,95);
		Bulldoze bulldoze = new Bulldoze(60,100);
		
		super.setMove(rockTomb, bulldoze);
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar;C:\Users\cloon\Desktop  *.java
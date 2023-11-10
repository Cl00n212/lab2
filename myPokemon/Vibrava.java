package myPokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import myPokemon.myPokemonMove.RockTomb;
import myPokemon.myPokemonMove.Bulldoze;
import myPokemon.myPokemonMove.Boomburst;

public class Vibrava extends Trapinch {
	//https://veekun.com/dex/pokemon/Vibrava
	public Vibrava(String name, int level) {
		super(name, level);
		
		super.setType(Type.GRASS,Type.DRAGON);
		
		super.setStats(50, 70, 50, 50, 50, 70);
		
		Boomburst boomburst = new Boomburst(90,100);
		
		myAddMove();
	}
	protected void myAddMove(){
		super.myAddMove();
		
		Boomburst boomburst = new Boomburst(90,100);
		
		super.addMove(boomburst);
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar;C:\Users\cloon\Desktop\lab2  *.java
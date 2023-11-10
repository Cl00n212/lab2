package myPokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import myPokemon.myPokemonMove.Present;
import myPokemon.myPokemonMove.Growl;
import myPokemon.myPokemonMove.SeismicToss;
import myPokemon.myPokemonMove.FocusBlast;

public class Miltank extends Pokemon {
	//https://veekun.com/dex/pokemon/Miltank
	public Miltank(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		
		super.setStats(95, 80, 105, 40, 70, 100);
		
		myAddMove();
	}
	protected void myAddMove(){
		Present present = new Present(1,90,this);
		Growl growl = new Growl(1,100);
		SeismicToss seismicToss = new SeismicToss(1,100);
		FocusBlast focusBlast = new FocusBlast(120,70);
		
		super.setMove(present, growl, seismicToss, focusBlast);
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar;C:\Users\cloon\Desktop  *.java
package myPokemon.myPokemonMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Boomburst extends SpecialMove {

	public Boomburst(double power, double acc) {
		super(Type.NORMAL, power, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "применияет " + pieces[pieces.length-1];
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar *.java
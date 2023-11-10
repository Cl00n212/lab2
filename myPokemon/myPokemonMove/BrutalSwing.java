package myPokemon.myPokemonMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class BrutalSwing extends PhysicalMove {

	public BrutalSwing(double power, double acc) {
		super(Type.DARK, power, acc);
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
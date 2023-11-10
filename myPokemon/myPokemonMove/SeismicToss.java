package myPokemon.myPokemonMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class SeismicToss extends PhysicalMove {

	public SeismicToss(double power, double acc) {
		super(Type.FIGHTING, power, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, def.getLevel());
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "применияет " + pieces[pieces.length-1];
	}
	
}
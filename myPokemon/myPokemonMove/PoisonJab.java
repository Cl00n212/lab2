package myPokemon.myPokemonMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PoisonJab extends PhysicalMove {

	public PoisonJab(double power, double acc) {
		super(Type.POISON, power, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);
		
		Effect e = new Effect().chance(0.3);
		if (e.success() == true){
			Effect.poison(def);
		}
	}
	
	@Override
	protected void applyOppEffects(Pokemon def) {

		Effect e = new Effect().chance(0.3);
		if (e.success() == true){
			Effect.poison(def);
		}
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "применияет " + pieces[pieces.length-1];
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar *.java
package myPokemon.myPokemonMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Growl extends StatusMove {

	public Growl(double power, double acc) {
		super(Type.NORMAL, power, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon def) {

		Effect e = new Effect().turns(-1).stat(Stat.ATTACK, -1);
		def.addEffect(e);
		
		System.out.println("у " + def.toString() + " скорость уменьшилась на 1");
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "применияет " + pieces[pieces.length-1];
	}
	
}
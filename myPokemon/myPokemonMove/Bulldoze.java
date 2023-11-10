package myPokemon.myPokemonMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Bulldoze extends PhysicalMove {

	public Bulldoze(double power, double acc) {
		super(Type.GROUND, power, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);

	}
	
	@Override
	protected void applyOppEffects(Pokemon def){
		Effect e = new Effect().turns(-1).stat(Stat.SPEED, -1);
		def.addEffect(e);
		
		System.out.println("у " + def.toString() + " скорость уменьшилась на 1");
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "применияет " + pieces[pieces.length-1];
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar *.java
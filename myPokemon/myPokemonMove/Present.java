package myPokemon.myPokemonMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import java.lang.Math;

public class Present extends PhysicalMove {
	protected Pokemon attPokemon;
	public Present(double power, double acc, Pokemon myattPokemon) {
		super(Type.NORMAL, power, acc);
		attPokemon = myattPokemon;
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		double random_value = Math.random();
		double E = Math.pow(10, -7);
		if (random_value - 0.4 < E) {
			power = 40;
			super.applyOppDamage(def, super.calcBaseDamage(attPokemon, def));
		}
		else if (random_value - 0.7 < E) {
			power = 80;
			super.applyOppDamage(def, super.calcBaseDamage(attPokemon, def));
		}
		else if (random_value - 0.8 < E) {
			power = 120;
			super.applyOppDamage(def, super.calcBaseDamage(attPokemon, def));
		}
		else {
			double hp = def.getStat(Stat.HP);
			def.setMod(Stat.HP, (int) (hp + hp / 4));
			System.out.println("Четверть HP протвника востановленно");
		}
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "применияет " + pieces[pieces.length-1];
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar *.java
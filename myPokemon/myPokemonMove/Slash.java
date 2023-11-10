package myPokemon.myPokemonMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Slash extends PhysicalMove {

	protected double criticalChence = 1.0;
	
	public Slash(double power, double acc) {
		super(Type.NORMAL, power, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
		criticalChence++;
		System.out.println("Критический щанс увеличен на 1");
	}
	
	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def) {		
		if(att.getStat(Stat.SPEED) / (512.0D / criticalChence) > Math.random()) {
			System.out.println("Критический удар!");
			return 2.0D;
		} else {
			return 1.0D;
		}
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "применияет " + pieces[pieces.length-1];
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar *.java
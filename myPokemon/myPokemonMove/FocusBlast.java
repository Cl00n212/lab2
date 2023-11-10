package myPokemon.myPokemonMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends SpecialMove {

	public FocusBlast(double power, double acc) {
		super(Type.FIGHTING, power, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        
        Effect e = new Effect().chance(0.1);
        if (e.success() == true) {
            e.stat(Stat.SPECIAL_DEFENSE, -1);
            def.addEffect(e);
			System.out.println("у " + def.toString() + " специальная защита уменьшилась на 1");
        }
	}
	@Override
	protected void applyOppEffects(Pokemon def){
		Effect e = new Effect().chance(0.1);
		if (e.success() == true){
			Effect.burn(def);
		}
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "применияет " + pieces[pieces.length-1];
	}
	
}
//javac -cp C:\Users\cloon\Desktop\lab2\Pokemon.jar *.java

import ru.ifmo.se.pokemon.*;
import myPokemon.*;

public class Lab2{
    public static void main(String[] args){
		
		Battle b = new Battle();
		Miltank p1 = new Miltank("1.1", 1);
		Drilbur p2 = new Drilbur("1.2", 1);
		Excadrill p3 = new Excadrill("1.3", 1);
		Trapinch p4 = new Trapinch("2.1", 1);
		Vibrava p5 = new Vibrava("2.2", 1);
		Flygon p6 = new Flygon("2.3", 1);
		b.addAlly(p1);
		b.addAlly(p2);
		b.addAlly(p3);
		b.addFoe(p4);
		b.addFoe(p5);
		b.addFoe(p6);
		b.go();
    }
}

//java -cp Pokemon.jar;C:\Users\cloon\Desktop\lab2  Lab2.java\


//javac -cp lab2_p/Pokemon.jar lab2_p/myPokemon/myPokemonMove/*.java
//javac -cp "lab2_p/Pokemon.jar:lab2_p" lab2_p/myPokemon/*.java 
//javac -cp "lab2_p/Pokemon.jar:lab2_p" lab2_p/*.java
//java -cp "lab2_p/Pokemon.jar:lab2_p" Lab2
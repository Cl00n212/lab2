package MyObj;
import Enums.Action;
import java.util.Objects;

public class Entity extends Obj{
	public Obj clone(){
		Entity entity = new Entity(name);
		for (int i = 0; i < countPrefProperty; i++){
			entity.addPrefProperty(prefPropertys[i]);
		}
		for (int i = 0; i < countPostProperty; i++){
			entity.addPostProperty(prefPropertys[i]);
		}
		return entity;
	}
	public Entity(String name) {
		super(name);
	}
	
	public void doSomething(Action act){
		if (act == Action.PUT){
			getAllPrefProperty();
			System.out.print(super.name + " "); 
			getAllPostProperty();
			System.out.print("сложил ");
		}
		else if (act == Action.EAT){
			System.out.print("есть ");
		}
		else if (act == Action.NOTWANT){
			getAllPostProperty();
			System.out.print(super.name + " ");
			getAllPostProperty();
			System.out.print("не хотелось ");
		}
		else if (act == Action.SEE){
			getAllPrefProperty();
			System.out.print(super.name + " ");
			getAllPostProperty();
			System.out.print("увидел ");
		}
		else if (act == Action.CREAT){
			System.out.print("сделала ");
		}
		else if (act == Action.WRITE){
			getAllPrefProperty();
			System.out.print(super.name + " "); 
			getAllPostProperty();
			System.out.print("написала ");
		}
		else if (act == Action.SAVE){
			getAllPrefProperty();
			System.out.print(super.name + " "); 
			getAllPostProperty();
			System.out.print("берёг ");
		}
	}
	
	public void doSomething(Action act, Obj obj){
		doSomething(act);
		
		obj.getAllPrefProperty();
		System.out.print(obj + " ");
		obj.getAllPostProperty();
	}
	
	
	
}
package MyObj;
import Enums.Action;
import java.util.Objects;

public class Item extends Obj{
	public Obj clone(){
		Item item = new Item(name);
		for (int i = 0; i < countPrefProperty; i++){
			item.addPrefProperty(prefPropertys[i]);
		}
		for (int i = 0; i < countPostProperty; i++){
			item.addPostProperty(prefPropertys[i]);
		}
		return item;
	}
	public Item(String name) {
		super(name);
	}
	
	public void doSomething(Action act){
		if (act == Action.BEFILLED){
			getAllPrefProperty();
			System.out.print(super.name + " ");
			getAllPostProperty();
			System.out.print("был наполнен ");
		}
		else if (act == Action.WRAPPED){
			System.out.print("завернутым в ");
		}
		else if (act == Action.CREAT){
			getAllPrefProperty();
			System.out.print(super.name + " ");
			getAllPostProperty();
			System.out.print("сделала ");
		}
		else if (act == Action.WRITTEN){
			getAllPrefProperty();
			System.out.print(super.name + " стояло ");
			getAllPostProperty();
		}
		else if (act == Action.BE){
			getAllPrefProperty();
			System.out.print(super.name + " ");
			getAllPostProperty();
			System.out.print("оказалась ");
		}
	}
	
	public void doSomething(Action act, Obj obj){
		doSomething(act);
		
		obj.getAllPrefProperty();
		System.out.print(obj + " ");
		obj.getAllPostProperty();
	}
	
	
	
	
}
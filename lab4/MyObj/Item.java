package MyObj;
import Enums.Action;
import java.util.Objects;
import Exceptions.ActionNotFound;

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
	public Item(String name){
		super(name);
	}
	class DoSomethingAction{ // Вложенный внутренний класс
		static String getAction(Action act) throws ActionNotFound{
			String realAction;
			if (act == Action.BEFILLED){
				realAction = "был наполнен ";
			}
			else if (act == Action.WRAPPED){
				realAction = "завернутым в ";
			}
			else if (act == Action.CREAT){
				realAction = "сделала ";
			}
			else if (act == Action.WRITTEN){
				realAction = "стояло ";
			}
			else if (act == Action.BE){
				realAction = "оказалась ";
			}
			else if (act == Action.CAME){
				realAction = "наступил уже ";
			}
			else if (act == Action.GLOW){
				realAction = "просвечивает ";
			}
			else if (act == Action.RISE){
				realAction = "постепенно поднимался ";
			}
			else if (act == Action.COVER){
				realAction = "покрывал ";
			}
			else{	
				throw new ActionNotFound(act);
			}
			return realAction;
		}
	}
	public void doSomething(Action act){
		getAllPrefProperty();
		System.out.print(super.name + " ");
		getAllPostProperty();
		try {
			System.out.print(DoSomethingAction.getAction(act));
		} catch (ActionNotFound e) {
		}
	}
	
	public void doSomething(Action act, Obj obj){
		doSomething(act);
		
		obj.getAllPrefProperty();
		System.out.print(obj + " ");
		obj.getAllPostProperty();
	}
	
	public void doSomethingNotName(Action act){
		try {
			System.out.print(DoSomethingAction.getAction(act));
		} catch (ActionNotFound e) {
		}
	}
	
	public void doSomethingNotName(Action act, Obj obj){
		doSomethingNotName(act);
		
		obj.getAllPrefProperty();
		System.out.print(obj + " ");
		obj.getAllPostProperty();
	}
	
}
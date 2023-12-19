package MyObj;
import Interfaces.Qwe;
import Enums.Action;
import java.util.Objects;
import Exceptions.ActionNotFound;

public class Entity extends Obj implements Qwe{
	
	public void pq(int number){
		System.out.print(number);
	}
	
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
	public Entity(String name){
		super(name);
	}
	class DoSomethingAction{ // Вложенный внутренний класс
		static String getAction(Action act) throws ActionNotFound{
			String realAction;
			if (act == Action.PUT){
				realAction = "сложил ";
			}
			else if (act == Action.EATN){
				realAction = "есть ";
			}
			else if (act == Action.NOTWANT){
				realAction = "не хотелось ";
			}
			else if (act == Action.SEEN){
				realAction = "увидел ";
			}
			else if (act == Action.CREAT){
				realAction = "сделала ";
			}
			else if (act == Action.WRITE){
				realAction = "написала ";
			}
			else if (act == Action.SAVE){
				realAction = "берёг ";
			}
			else if (act == Action.UNDERSTAND){
				realAction = "понял ";
			}
			else if (act == Action.EAT){
				realAction = "есть ";
			}
			else if (act == Action.GO){
				realAction = "пробираться ";
			}
			else if (act == Action.COMB){
				realAction = "расчеши "; 
			}
			else if (act == Action.LIKELOOKON){
				realAction = "нравится смотреть на "; 
			}
			else if (act == Action.SEE){
				realAction = "увидели "; 
			}
			else if (act == Action.MOVEOVER){
				realAction = "перебирались с дерева на дерево"; 
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
	
	public void detour(String property){
		System.out.print("ты " + property + " ");
	}
}
package Exceptions;
import MyObj.Obj;

public class EntityDrop extends RuntimeException{
    public EntityDrop(Obj e){
        System.err.print("\"");
		e.getName();
        System.err.print("упал\" ");
    }
}
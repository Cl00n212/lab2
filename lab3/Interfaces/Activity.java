package Interfaces;
import Enums.Action;
import MyObj.Obj;

public interface Activity{
	public abstract void doSomething(Action act);
	
	public abstract void doSomething(Action act, Obj obj);	
	
	public String toString();	
	
	public boolean equals(Obj o);	
	
	public int hashCode();	
}
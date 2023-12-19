package Exceptions;
import Enums.Action;

public class ActionNotFound extends Exception{
    public ActionNotFound(Action act){
        System.err.println("\nДля этого объекта действия " + act.toString() + " нет!!!! \n");
    }
}
package Exceptions;

public class PropertyNotFound extends RuntimeException{
    public PropertyNotFound(){
		System.out.print("\nУ объекта нет такого свойства\n");
    }
}
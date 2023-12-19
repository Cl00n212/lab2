package Interfaces;
import Exceptions.PropertyNotFound;

public interface Property{
	// максимальное количество свойств
	final int maxProperty = 10;
	
	public void delAllProperty();
	
	// добавить свойство перед объектом
	public void addPrefProperty(String property);
	
	// удалить все свойства перед объектом
	public void delAllPrefProperty();
	
	// вывести все свойства перед объектом
	public void getAllPrefProperty();
	
	// вывести свойства по номеру с 1 перед объектом
	public void getPrefProperty(int Number) throws PropertyNotFound;
	
	
	
	// добавить свойство после объектом
	public void addPostProperty(String property);
	
	// удалить все свойства после объектом
	public void delAllPostProperty();
	
	// вывести все свойства после объектом
	public void getAllPostProperty();
	
	// вывести свойства по номеру с 1 после объектом
	public void getPostProperty(int Number) throws PropertyNotFound;
}
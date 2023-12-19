package MyObj;
import Interfaces.Property;
import Interfaces.Activity;
import java.util.Objects;
import Exceptions.PropertyNotFound;

public abstract class Obj implements Property, Activity{
	public abstract Obj clone();
	@Override
	public int hashCode() {
		int sumhash = Objects.hash(countPrefProperty + countPostProperty);
		for (int i = 0; i < countPrefProperty; i++){
			sumhash += Objects.hash(prefPropertys[i]);
		}
		for (int i = 0; i < countPostProperty; i++){
			sumhash += Objects.hash(postPropertys[i]);
		}
		sumhash += Objects.hash(name);
        return sumhash + Objects.hash(this.getClass());
    }
	public boolean equals(Obj o) {
		for (int i = 0; i < countPrefProperty; i++){
			if (prefPropertys[i] != o.prefPropertys[i]){
				return false;
			}
		}
		for (int i = 0; i < countPostProperty; i++){
			if (postPropertys[i] != o.postPropertys[i]){
				return false;
			}
		}
		return ((countPrefProperty == o.countPrefProperty) && Objects.equals(name, o.name) && Objects.equals(this.getClass(), o.getClass()));
    }
	
	protected String[] prefPropertys = new String[maxProperty];
	protected String[] postPropertys = new String[maxProperty];
	protected int countPrefProperty = 0;
	protected int countPostProperty = 0;
	
	protected String name;
	
	@Override
	public String toString(){
		return name;
	}
	
	public Obj(String name) {
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void startDiolog(){
		System.out.print("- ");
	}
	
	public void endDiolog(){
		System.out.print("- сказал ");
		getName();
	}
	
	public static class DopMessage{ // Вложенный статический класс
        public static void about(){
			System.out.print("что это ");
		}
		public static void stop(){
			System.out.print("Ну хватит ");
		}
		public static void get(){
			System.out.print("давай лучше ");
		}
		public static void will(){
			System.out.print("Будем ");
		}
		public static void farther(){
			System.out.print("дальше через ");
		}
		public static void and(){
			System.out.print("и ");
		}
		public static void ved(){
			System.out.print("ведь ");
		}
		public static void when(){
			System.out.print("когда ");
		}
		public static void how(){
			System.out.print("как ");
		}
		public static void to(){
			System.out.print("к ");
		}
		public static void andNow(){
			System.out.print("и вот уже ");
		}
		public static void but(){
			System.out.print("но ");
		}
		
		public static void unexpectedly(){
			System.out.print("Вдруг ");
		}
		public static void on(){
			System.out.print("на ");
		}
    }
	
	public void getName(){
		getAllPrefProperty();
		System.out.print(name + " ");
		getAllPostProperty();
	}
	
	public void getAllPrefProperty(){
		for (int i = 0; i < countPrefProperty; i++){
			System.out.print(prefPropertys[i] + " ");
		}
	}
	
	public void getAllPostProperty(){
		for (int i = 0; i < countPostProperty; i++){
			System.out.print(postPropertys[i] + " ");
		}
	}
	
	public void getPrefProperty(int Number) throws PropertyNotFound{
		if (Number > countPrefProperty){
			throw new PropertyNotFound();
		}
		else{
			System.out.print(prefPropertys[Number - 1] + " ");
		}
	}
	
	public void getPostProperty(int Number) throws PropertyNotFound{
		if (Number > countPostProperty){
			throw new PropertyNotFound();
		}
		else{
			System.out.print(postPropertys[Number - 1] + " ");
		}
	}
	
	public void addPrefProperty(String property){
		prefPropertys[countPrefProperty] = property;
		countPrefProperty++;
	}
	
	public void addPostProperty(String property){
		postPropertys[countPostProperty] = property;
		countPostProperty++;
	}
	
	public void delAllProperty(){
		delAllPrefProperty();
		delAllPostProperty();
	}
	
	public void delAllPrefProperty(){
		countPrefProperty = 0;
	}
	
	public void delAllPostProperty(){
		countPostProperty = 0;
	}
}
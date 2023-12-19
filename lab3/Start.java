
import MyObj.*;
import Enums.*;

public class Start{
    public static void main(String[] args){
		Obj b1 = new Item("она");
		Obj b2 = new Item("бутербродикaми");
		b2.addPrefProperty("маленькими");
		b2.addPrefProperty("аккуратными");
		
		b1.doSomething(Action.BEFILLED,b2);
		b2.delAllPrefProperty();
		
		
		Obj b3 = new Item("бумагу");
		
		b3.addPrefProperty("шелковистую");
		
		b2.doSomething(Action.WRAPPED,b3);
		
		Obj b4 = new Item("свертке");
		
		b4.addPrefProperty("в каждом");
		b4.addPostProperty("по два");
		
		b4.getName();
		
		Obj b5 = new Item("содержимым");
		
		b5.addPrefProperty("с самым разным");
		
		b5.getName();
		
		System.out.print('\n');
		
		Obj p1 = new Entity("Муми-тролль");
		b2.setName("бутербродики");
		b2.addPostProperty("рядом один к одному");
		
		p1.doSomething(Action.PUT,b2);
		
		p1.but();
		
		p1.doSomething(Action.EAT);
		
		p1.setName("Муми-троллю");
		p1.doSomething(Action.NOTWANT);
		
		System.out.print('\n');
		p1.setName("Муми-тролль");
		Obj b6 = new Item("надписи");
		
		Obj p2 = new Entity("мама");
		
		b4.setName("свертах");
		b4.delAllPrefProperty();
		b4.delAllPostProperty();
		
		p1.unexpectedly();
		
		p1.doSomething(Action.SEE, b6);
		
		b6.on();
		
		b4.getName();
		
		b4.setName("свёртки");
		
		b4.doSomething(Action.CREAT,p2);
		
		System.out.print('\n');
		
		b4.addPrefProperty("На каждом из");
		b4.setName("свёртков");
		b4.addPostProperty("либо \"Сыр\"");
		b4.addPostProperty("либо \"Только с маслом\"");
		b4.addPostProperty("либо \"Дорогая колбаса\"");
		b4.addPostProperty("либо \"С добрым утром!\"");
		
		b4.doSomething(Action.WRITTEN);
		
		b4.delAllPrefProperty();
		b4.delAllPostProperty();
		
		System.out.print('\n');
		
		b4.addPrefProperty("На последнем");
		b4.setName("свёртке");
		b4.getName();
		
		b4.delAllPrefProperty();
		
		b4.setName("свёрток");
		b4.addPostProperty("от папы");
		p2.doSomething(Action.WRITE, b4);
		
		b4.delAllPostProperty();
		System.out.print('\n');
		
		b4.addPrefProperty("В");
		b4.setName("свёрте");
		Obj b7 = new Item("банка");
		b7.addPostProperty("крабов");
		
		b4.doSomething(Action.BE, b7);
		
		Obj p3 = new Entity("папа");
		p3.addPrefProperty("которую");
		p3.addPostProperty("с весны");
		
		p3.doSomething(Action.SAVE);
		System.out.print('\n');
		
		Obj qwe1 = new Item("qwe");
		qwe1.addPrefProperty("которую");
		Obj qwe2 = qwe1.clone();
		qwe2.getName();
    }
}
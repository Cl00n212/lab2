
import MyObj.*;
import Enums.*;
import Exceptions.*;
import Interfaces.*;

public class Start{
    public static void main(String[] args) {
		Obj b1 = new Item("она");
		Obj b2 = new Item("бутербродикaми");
		Obj b3 = new Item("бумагу");
		Obj b4 = new Item("свертке");
		Obj b5 = new Item("содержимым");
		Obj b6 = new Item("надписи");
		Obj b7 = new Item("банка");
		
		Obj p1 = new Entity("Муми-тролль");
		Obj p2 = new Entity("мама");
		Obj p3 = new Entity("папа");
		
		System.out.println(p1.getClass().getInterfaces()[0].getSimpleName());
		
		
		Entity mumetrol = new Entity("Муми-тролль"){ // анонимный класс
			public void detour(String property){
				if (Math.random() < 0.2){
					try {
						throw new EntityDrop(this);
					} catch (EntityDrop e) {
					}
				}
				System.out.print("ты " + property + " ");
			}
		};
		Entity snork = new Entity("Снорк");
		Entity they = new Entity("они");
		 
		Item pricluchenie = new Item("приключение");
		Item slezi = new Item("слёз");
		Item buter = new Item("бутерброды");
		Item les = new Item("лес");
		Item chelka = new Item("челку");
		Item day = new Item("день");
		Item vecher = new Item("вечер");
		Item voda = new Item("водой");
		Item mox = new Item("мох");
		Item poverhnost = new Item("поверхности");
		Item zemlia = new Item("землю");
		
		class Story{ // локальный класс
			public void Start1(){
				b2.addPrefProperty("маленькими");
				b2.addPrefProperty("аккуратными");
				
				b1.doSomething(Action.BEFILLED,b2);
				b2.delAllPrefProperty();
				
				
				
				b3.addPrefProperty("шелковистую");
				
				b2.doSomethingNotName(Action.WRAPPED,b3);
				
				
				b4.addPrefProperty("в каждом");
				b4.addPostProperty("по два");
				
				b4.getName();
				
				
				b5.addPrefProperty("с самым разным");
				
				b5.getName();
				
				System.out.print('\n');
				
				b2.setName("бутербродики");
				b2.addPostProperty("рядом один к одному");
				
				p1.doSomething(Action.PUT,b2);
				
				Obj.DopMessage.but();
				
				p1.doSomethingNotName(Action.EATN);
				
				p1.setName("Муми-троллю");
				p1.doSomething(Action.NOTWANT);
				
				System.out.print('\n');
				p1.setName("Муми-тролль");
				
				b4.setName("свертах");
				b4.delAllPrefProperty();
				b4.delAllPostProperty();
				
				Obj.DopMessage.unexpectedly();
				
				p1.doSomething(Action.SEEN, b6);
				
				Obj.DopMessage.on();
				
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
				
				//b4.doSomething(Action.WRITTEN);
				b4.getName();
				
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
				b7.addPostProperty("крабов");
				
				b4.doSomething(Action.BE, b7);
				
				p3.addPrefProperty("которую");
				p3.addPostProperty("с весны");
				
				p3.doSomething(Action.SAVE);
				System.out.print('\n');
			}
			public void Start2(){
				mumetrol.addPostProperty("сразу");
				
				mumetrol.doSomething(Action.UNDERSTAND);
				Obj.DopMessage.about();
				
				pricluchenie.addPostProperty("не такое уж опасное");
				
				pricluchenie.getName();
				
				
				
				mumetrol.delAllProperty();
				pricluchenie.delAllProperty();
				System.out.print("\n");
				
				mumetrol.startDiolog();
				
				Obj.DopMessage.stop();
				
				slezi.getName();
				
				Obj.DopMessage.get();
				
				mumetrol.doSomethingNotName(Action.EAT, buter);
				
				mumetrol.endDiolog();
				
				
				System.out.print("\n");
				
				mumetrol.startDiolog();
				
				Obj.DopMessage.will();
				
				mumetrol.doSomethingNotName(Action.GO);
				
				Obj.DopMessage.farther();
				
				les.getName();
				
				Obj.DopMessage.and();
				
				mumetrol.doSomethingNotName(Action.COMB,chelka);
				
				Obj.DopMessage.ved();
				
				mumetrol.detour("такая красивая");
				
				mumetrol.setName("мне");
				snork.setName("тебя");
				
				mumetrol.doSomething(Action.LIKELOOKON, snork);
				
				
				mumetrol.setName("Муми-тролль");
				snork.setName("Снорк");
				System.out.print("\n");
				
				day.addPrefProperty("Весь");
				
				day.getName();
				
				mumetrol.getName();
				
				Obj.DopMessage.and();
				
				snork.addPrefProperty("фрекен");
				
				snork.getName();
				
				they.doSomethingNotName(Action.MOVEOVER);
				
				
				snork.delAllProperty();
				day.delAllProperty();
				System.out.print("\n");
				
				vecher.doSomethingNotName(Action.CAME, vecher);
				
				Obj.DopMessage.when();
				
				they.addPostProperty("наконец");
				
				they.doSomething(Action.SEE);
				
				Obj.DopMessage.how();
				
				voda.addPrefProperty("под");
				mox.addPrefProperty("зелёный");
				
				voda.doSomething(Action.GLOW, mox);
				
				
				they.delAllProperty();
				voda.delAllProperty();
				mox.delAllProperty();
				System.out.print("\n");
				
				mox.doSomething(Action.RISE);
				
				Obj.DopMessage.to();
				
				poverhnost.addPostProperty("воды");
				poverhnost.getName();
				
				Obj.DopMessage.andNow();
				
				zemlia.addPrefProperty("твердую");
				
				mox.doSomethingNotName(Action.COVER, zemlia);
			}
		}
		
		Story story = new Story();
        story.Start1();
		
		System.out.print("\n");
		
		story.Start2();
		/*
		Obj qwe = new Entity("папа");
		qwe.addPrefProperty("которую");
		int numberTest = 3;
		qwe.getPrefProperty(numberTest);
		*/
		/*
		Obj qwe = new Entity("папа");
		qwe.addPrefProperty("которую");
		int numberTest = 3;
		try {
			qwe.getPrefProperty(numberTest);
		} catch (PropertyNotFound e) {
		}
		*/
	
    }
}

/*
SOURCE
CLASS
RUNTIME

@Override
@Deprecated
@SuppressWarnings
@Retention
@FunctionalInterface
*/
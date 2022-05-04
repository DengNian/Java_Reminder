package assignment.Action.sec302;
import java.lang.reflect.Field;

/**
 * Program to test OccasinalAction class and RareAction class. In this program mainly test the
 * super class, declared field and instantiate instances to test the occursOn() and toString() 
 * functions.
 * In the main() method instantiate a OccasionalAction() object and RareAction() method, use 
 * reflection test its superclass matches action. Then use getDecaredFields() test is there  any 
 * extra fields in the class. At last instantiate another two objects use toString() method output 
 * the descriptions and test occursOn() with specific date, check the output matches the expect output.
 * @author Nian Deng
 *
 */
public class ActionDriver2 {
	/**
	 * main() method Instantiate instance and test the superclass, declared fields, toString() method
	 * and occursOn() method. 
	 * @param args main args
	 */

	public static void main(String[] args) {
		OccasionalAction occasionalAction = new OccasionalAction();
		Class c1 = occasionalAction.getClass();
		Class occasinalfatherclass = c1.getSuperclass();
		Class superclass = Action.class;	
		
		System.out.println("OccasionalAction is just a subclass of Action: " + (occasinalfatherclass == superclass));
		System.out.println("Expected: true");
		
		RareAction rareAction = new RareAction();
		Class c2 = rareAction.getClass();
		Class rarefatherclass = c2.getSuperclass();
		System.out.println("OccasionalAction is just a subclass of Action: " + (rarefatherclass == superclass));
		System.out.println("Expected: true");
		
		
		//OccasinalAction has one declared field which is day
		Field[] r1=c1.getDeclaredFields();
		System.out.println("OccasionalAction activities have one extra fields:"+(r1.length==1));
		System.out.println("Expected: true");
		
		//RareAction class has three declared fields day, month and year
		Field[] r2=c2.getDeclaredFields();
		System.out.println("RareAction activities have three extra fields:"+(r2.length==3));
		System.out.println("Expected: true");
		
		OccasionalAction OccasionalAction2=new OccasionalAction(1,"Take a PCR test.");
		System.out.println("Looking at the rare actions:" + OccasionalAction2.toString());
		System.out.println("Expected: Take a PCR test.");
		//Occasional action only happens on the first day of every month; 
		System.out.println(OccasionalAction2.occursOn(2022, 9, 01)); 
		System.out.println("Expected: true");
		
		RareAction rareAction2=new RareAction(01,06,2022,"Get a booster shot.");
		System.out.println("Looking at the rare actions:" + rareAction2.toString());
		System.out.println("Expected: Get a booster shot.");
		//rare action only happens on 2022-06-01; 
		System.out.println(rareAction2.occursOn(2022, 06, 01)); 
		System.out.println("Expected: true");
		
		
		
		
		
	}

}

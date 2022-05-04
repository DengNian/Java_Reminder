package assignment.Action.sec302;
import java.lang.reflect.Field;


/**
 * Program to test RegularAction class. In this program mainly test the
 * super class, declared field and instantiate instances to test the 
 * occursOn() and toString() functions.
 * In the main() method instantiate a RegularAction() object, use reflection test its superclass
 * matches action. Then use getDecaredFields() test there's no extra fields in the RegularAction()
 * class. At last instantiate another RegularAction() use toString() method output the descriptions
 * and test occursOn() with an random date, check the output matches the expect output. 
 * @author Nian Deng
 *
 */
public class ActionDriver {

	/**
	 * main() method Instantiate instance and test the superclass, declared fields, toString() method
	 * and occursOn() method. 
	 * @param args main args
	 */
	public static void main(String[] args) {
		RegularAction regularAction = new RegularAction();
		Class c1 = regularAction.getClass();
		Class fatherclass = c1.getSuperclass();
		Class superclass = Action.class;
		System.out.println("RegularAction is just a subclass of Action: " + (fatherclass == superclass));
		System.out.println("Expected: true");
		
		Field[] r=c1.getDeclaredFields();
		System.out.println("RegularAction activities have no extra fields:"+(r.length==0));
		System.out.println("Expected: true");
		
		RegularAction regularAction2=new RegularAction("Wash your hands");
		System.out.println("Looking at the regular actions:" + regularAction2.toString());
		System.out.println("Expected: Wash your hands");
		
		//regular action happens everyday, it doesn't matter what date it is, 
		//the action will occurs everyday.
		System.out.println(regularAction2.occursOn(0, 0, 0)); 
		System.out.println("Expected: true");
		
		
	}

}

package assignment.Action.sec302;
/**
 * This class is a subclass of Action. it defines a regular action which need to be reported everyday.
 * The abstract method occursOn() has been override, as this class inherited as a regular
 * action which will happen everyday, it doesn't matter what date the user input, occursOn() will return true. 
 * when initialized the instance, user need define the field of description by the one parameter constructor at
 * the beginning or use setDescription() later. 
 * 
   @author Nian Deng
   @see Action
*/

public class RegularAction extends Action
{
	/**
	 *  Constructs an action without a description.
	*/
	public RegularAction() {
		super();
	}
	
	/**
	 * Constructs an action with a description
	 * @param description Action description tell people what to do
	 */	
	public RegularAction(String description) {
		super(description);
	}
	
	 /**
	  *  Override abstract method from class action. it always return true. as the object will occurs everyday     
	  *  @param year the year when the action happens
	  *  @param month the month when the action happens
	  *  @param day the day when the action happens
	  *  @return true it does not matter what the date is the action happens everyday.
	  */
	@Override
	public boolean occursOn(int year, int month, int day) {
		return true;
	}
	
	
}



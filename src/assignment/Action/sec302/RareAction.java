package assignment.Action.sec302;
/**
 * The class RareAction is a subclass of Action, it will initialize a action which 
 * will happen in a specific date.it contains a method occursOn() to determines
 * any tasks to report for the day. 
 * Four fields in this class:the field integer 'day','month','year' will store the specific date when the
 * action will happen; the field String 'description' inherited from Action will store the description of 
 * the action.
 * User use four-arguments constructor to initialize the instance.
   @author Nian Deng
   @see Action
*/
public class RareAction extends Action
{
	private int day;
	private int month;
	private int year;
	
	/**
	 *  Constructs an action without a description.
	*/
	public RareAction() {
		super();
		this.day=0;
		this.month=0;
		this.year=0;
	}
	
	  /**
	    * Constructs an action with a description, day, month and year
	    * user need use a string to describe the action, and a specific date(day, month, year) to 
	    * define when the activity will occurs.
	    * 
	    * @param description  the text description of the action
	    * @param day  day of action occurs
	    * @param month month of action occurs
	    * @param year year of action occurs
	    */
	public RareAction(int day, int month, int year,String description) {
		super(description);
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	 /**
	  *  This method has override the abstract method occursOn() from Action.
	  *  User provide int year, month and day to determine if this action occurs on the specified date, 
	  *  when the day, month and year exactly matched with the object it will return true,otherwise return false
	  *  match.   
	  *  @param year the year when the action happens
	  *  @param month the month when the action happens 
	  *  @param day the day when the action happens
	  *  @return true if the action activity occurs on the specified date the day, month and year all exactly
	  *  match,otherwise return false.
	  */
	@Override
	public boolean occursOn(int year, int month, int day) {
		if(this.day == day && this.month == month && this.year == year) {
			return true;
		}else {
			return false;
		}
	}
   
}

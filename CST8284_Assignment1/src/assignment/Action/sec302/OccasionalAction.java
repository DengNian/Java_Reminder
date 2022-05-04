package assignment.Action.sec302;
/**
 * The class OccasionalAction is a subclass of Action, it will initialize a action which 
 * will happen in a specific day of the month.it contains a method occursOn() to determines
 * any tasks to report for the day. 
 * Two fields in this class:the field integer 'day' will store the day of the month when the
 * action will happen; the field String 'description' inherited from Action will store the description of the action
 * User use two-arguments constructor to initialize the instance, or use non-argument constructor and use setter to
 * to initialize the two fields later.
   @author Nian Deng
   @see Action
*/
public class OccasionalAction extends Action
{
   private int day;
   
   /**
    *  Constructs OccasinalAction without argument.day will be set to 0 and description set to null
   */
   public OccasionalAction() {
	   super();
	   this.day=0;
   }
   
   /**
    * Constructs OccasinalAction with a description and day
    * user use a string to describe the action and use the day to store which day of the month
    * the activity will occur. 
    * @param description The text description of the action
    * @param day Specific day every month the action occurs
    */
   public OccasionalAction(int day,String description) {
	   super(description);
	   this.day = day;
   }
   
 /**
  *  Determines if this action occurs on the specified date.the month and year is not essential
  *  here because the occasinalAction only happens on the same day of every month.if the input day 
  *  matches the method return true, otherwise false.
  *  @param year the year when the action happens
  *  @param month the month when the action happens 
  *  @param day the day when the action happens
  *  @return true if the action activity occurs on the same day of every month.
  */
   @Override
   public boolean occursOn(int year, int month, int day) {
	if(this.day == day) {
		return true;
	}else {
		return false;
	}
	
}
















}

package assignment.Action.sec302;

/**
 * 
 * This is the Action Superclass class that provides a catalog of actions to be carried out in 
 * view of COVID-19 OPH protocols.
 * it's an abstract class, users need to override occursOn() method with a concrete implementation in order 
 * to inherent their own subclass.occursOn() determines if there are any tasks to report for this day,
 * depending on the type of subclass.Also the class contains a toString() method which will return the action 
 * description. When initialize instance use constructor with one argument to define the description of the 
 * action. Also, setDesctiption() has provided to set the action description.
 * 
 * @author Nian Deng
*/
public abstract class Action
{	
	private String description;

/**
 *  Constructs an action.
*/

public Action()
{
   description = "";
}

/**
 * Constructs an action with a description
 * @param description action description
 */
public Action(String description) {
	this.description = description;
}

/**
   Sets the description of the object. when call this method will save the action description
   in filed 'description' and when get this field will tell the user what action needs to be done.
   @param description the text description of the action
*/
public void setDescription(String description)
{
   this.description = description;
}

/**
  * User need override this method with a concrete implementation. 
  * occursOn() need take three parameters: int day, month and year to determines if this action occurs 
  * on the specified date. when the provided date matches objects' defined date, it will return true,
  * otherwise false.
  * 
  * @param year the year when the action happens
  * @param month the month when the action happens
  * @param day the day when the action happens
  * @return true if the action activity occurs on the specified date.
*/
public abstract boolean occursOn(int year, int month, int day);


/**
   Converts action activity to string description.
*/
public String toString()
{
   return description;
}
}


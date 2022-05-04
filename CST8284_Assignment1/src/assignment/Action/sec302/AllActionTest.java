package assignment.Action.sec302;
import java.util.Scanner;
/**
  * Program to test RegularAction class, OccasionalAction class and RareAction class.
  * In this program instantiate four action objects and loaded into an array. it will prompt user to
  * input the current date like(2018 01 30) in order to test the occursOn() method. if the occursOn return
  * true then the object will call toString() to output the specific action need to be done. 
   @author Nian Deng
*/
public class AllActionTest
{
	/**
	 * main() method Instantiate instance if the user input an right date, it will make a report to the user
	 * about what action need to be done on that specific day.
	 * @param args main args()
	 */
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
	   Action[] action = new Action[5];
      action[0]=new RegularAction("Wash your hands.");
      action[1]=new OccasionalAction(1,"Take a PCR test.");
      action[2]=new RareAction(01,06,2022,"Get a booster shot.");
      action[3] =new RareAction(15,12,2022,"Get a boosteer shot.");
      action[4]=new RegularAction("Sit two meters apart.");
      
      while(true) {
      System.out.println("\nEnter a date(like 2018 01 30):");
      String input = scanner.nextLine();
      String year = input.substring(0, 4);
      String month = input.substring(5, 7);
      String day = input.substring(8, 10);
      
      System.out.println("These are your actions on "+month+"/"+day+"/"+year+":");
      for(int i =0;i<action.length;i++) {
    	  if(action[i].occursOn(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day))) {
    		  System.out.println(action[i].toString());
    	  }
      }
      
      }












   }
}

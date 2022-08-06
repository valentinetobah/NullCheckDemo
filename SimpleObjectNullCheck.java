 /* 
 * Author: V Tobah
 * Student No: 35968060
 * Module: CMPG 323 homework 1
 * Description: Simple null checker tests
 * 
 */

public class SimpleObjectNullCheck {

	private static final String MY_NAME = "Valentine";

	public static void main (String[] args) {

		String name = null;

	    //This statement executes coz equals() method acts a null check
	    System.out.print("\n\nIs MY_NAME equals name: ");
	    System.out.print(MY_NAME.equals(name));

		try{
			//This statement throws a nullpointer exception as the name object is null
			System.out.print("\n\nIs name equals MY_NAME: ");
			System.out.print(name.equals(MY_NAME));
		} catch(NullPointerException e){
			System.out.print("Null Pointer Exception was thrown");
		}
						
	}	
}
	
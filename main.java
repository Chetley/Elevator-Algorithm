import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int call_location;
		boolean door_status;
		int destination;
		
		Elevator elevator1 = new Elevator();
		
		//elevator is called
		Scanner scan = new Scanner(System.in);
	    System.out.println("What floor are you on? ");
	    call_location = scan.nextInt();
	    System.out.println("Your current floor is " + call_location);
		
	    System.out.println("Select floor destination: ");
		destination = scan.nextInt();
	    
		elevator1.Call_elevator(call_location, destination);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class

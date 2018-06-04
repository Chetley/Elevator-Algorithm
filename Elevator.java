
import java.util.Scanner;

public class Elevator {
	

	int [] floor_number = {0, 1, 2};
	
	private int default_elevator_location = 0;//at end of algorithm, elevator returns to default location
	private boolean default_elevator_door_open = false; //default elevator state = doors closed
	private int current_elevator_location;
	private boolean elevator_door_open;
	private int user_location;
	private int destination;
	private int floors;
	
	public Elevator()
	{
		setCurrent_elevator_location(default_elevator_location);
		setDoor_status(default_elevator_door_open);
	}// Elevator constructor
	
	//set user location
	public void Call_elevator(int user_location, int destination)
	{

		setUser_location(user_location);
		display_current_floor();
		System.out.println("-----------------"); //ascetic
		if (this.user_location == current_elevator_location)
		{
			setCurrent_elevator_location(user_location);
			setDoor_status(true);
			display_door_status();
			System.out.println("*Person boards elevator*");
			setDoor_status(false);
			display_door_status();
		}
		if (this.user_location != current_elevator_location)
		{
			if (user_location > current_elevator_location)
			{
				floors = (user_location - current_elevator_location);
				System.out.println("Elevator is going UP " + floors + " floor(s)");
			}//nested if
			else if (user_location < current_elevator_location)
			{ 
				floors = (current_elevator_location + user_location);
				System.out.println("Elevator is going DOWN" + floors + " floor(s)");
			}//else if
			
			setCurrent_elevator_location(user_location);
			System.out.println("-----------------"); //ascetic
			setDoor_status(true);
			display_door_status();
			System.out.println("*Person boards elevator*");
			setDoor_status(false);
			display_door_status();
			
		}//first if
		
		//set user destination
		setDestination_location(destination);
		System.out.println("-----------------"); //ascetic
		if (current_elevator_location != destination)
		{
			if (destination < current_elevator_location)
			{
				floors = (current_elevator_location - destination);
				System.out.println("Elevator is going DOWN " + floors + " floor(s)");
			}//nested if
			else if (destination > current_elevator_location)
			{ 
				floors = (destination - user_location);
				System.out.println("Elevator is going UP " +  floors + " floor(s)");
			}//else
			
			setCurrent_elevator_location(destination);
			System.out.println("-----------------"); //ascetic
			display_current_floor();
			setDoor_status(true);
			display_door_status();
			System.out.println("*Person exits elevator*");
			setDoor_status(false);
			display_door_status();
			System.out.println("-----------------"); //ascetic
		}//first if
	}// call elevator
	
	private void display_current_floor()
	{
		System.out.println("Elevator's current floor is: " + current_elevator_location);
	}
	
	private void setDoor_status(boolean p_doorstatus)
	{
	 elevator_door_open = p_doorstatus;
	}
//	
    private void display_door_status()
    {
    	if (elevator_door_open == true)
    	{
    	System.out.println("Elevator doors open");
    	}//if
    	else if (elevator_door_open == false)
    	{
    	System.out.println("Elevator doors close");
    	}//else if
    }//display
	
	//create getters and setters
	private void setDestination_location(int p_destination)
	{
	 destination = p_destination;
	}
	private void setUser_location(int p_calllocation)
	{
	 user_location = p_calllocation;
	}
	private int getCall_location()
	{
	 return user_location;
	}
	
	
	public void setDefault_location(int p_default)
	{
	 default_elevator_location = p_default;
	}
	public int getDefault_location()
	{
	 return default_elevator_location;
	}
	private void setCurrent_elevator_location(int p_currentlocation)
	{
	 current_elevator_location = p_currentlocation;
	}
	private int getCurrent_location()
	{
	System.out.println(current_elevator_location);
	 return current_elevator_location;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class

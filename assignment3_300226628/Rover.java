
// Name: Yannick Vaillancourt
// ID: 300226628
// Commands:
// javac Rover.java
// java Rover
import java.util.Scanner;

public class Rover{


	static StateList next;
	static StateList current = StateList.IDLE;

	static StateList nextState(StateList before, String action){
		StateList after = null;
		switch(before){

		case FORWARD_SPEED_1:
			switch(action){
			case "R2":
				after = StateList.IDLE;
				return after;
			case "RS5":
				after = StateList.FORWARD_SPEED_1_FIXED;
				return after;
			default:
				after = StateList.FORWARD_SPEED_2_MAX;
				return after;
			}
		case FORWARD_SPEED_2_MAX:
			switch(action){
			case "R1":
				after = StateList.FORWARD_SPEED_1;
				return after;
			default:
				after = StateList.FORWARD_SPEED_2_MAX;
				return after;
			}

		return after;
	}
	static String availableActions(StateList before){
		String actions = null;
		switch(before){

		case FORWARD_SPEED_2_MAX:
			actions = "N: Keep current speed\nR1: Decelerate";
			return actions;
		case FORWARD_SPEED_1_FIXED:
			actions = "N: Keep current speed\nL1: Exit Fixed Speed";
			return actions;
		}
		return actions;
		fwdspd = "Available actions:\nN: Continue accelerating forwards\nR2: Decelerate\nRS5: Keep current speed"
	}

	 
	
	public static void main(String[] args){
		Scanner scanner;
		String input;
		System.out.println("Welcome to the cruise on the Lunar Rover! As the driver, "
				+ "you can select which \naction to take by inputting the corresponding code, representing the pedals."
				+ " \nEx: 'R1' means Right pedal once, 'LS5' means Left pedal for 5 seconds, and 'N' means no pedals, as in nothing."
				+ " If your input \ndoes not match any of the ones listed, it will default to the action of 'N'.");
		while (true){
			System.out.println("\nCurrent state: " + current.toString());
			
			System.out.println("Available actions:\n" + availableActions(current));
			System.out.print("Enter action: ");
			scanner = new Scanner(System.in);
			input = scanner.nextLine();
			current = nextState(current, input);
			if(current == StateList.END) {break;}
		}
		scanner.close();
		System.out.println("Goodbye!");


	}


}
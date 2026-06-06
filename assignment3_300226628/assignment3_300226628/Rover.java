
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
		case IDLE:
			switch(action){
			case "L1":
				after = StateList.FORWARD_SPEED_1;
				return after;
			case "LS5":
				after = StateList.BACKWARD_SPEED_1;
				return after;
			case "R1":
				after = StateList.END;
				return after;
			default:
				after = StateList.IDLE;
				return after;
			}
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
		case FORWARD_SPEED_1_FIXED:
			switch(action){
			case "L1":
				after = StateList.FORWARD_SPEED_1;
				return after;
			default:
				after = StateList.FORWARD_SPEED_1_FIXED;
				return after;
			}
		case BACKWARD_SPEED_1:
            switch(action){
            case "R1":
                after = StateList.IDLE;
                return after;
            case "RS5":
                after = StateList.BACKWARD_SPEED_1_FIXED;
                return after;
            default:
                after = StateList.BACKWARD_SPEED_2_MAX;
                return after;
            }
        case BACKWARD_SPEED_2_MAX:
            switch(action){
            case "R1":
                after = StateList.BACKWARD_SPEED_1;
                return after;
            default:
                after = StateList.BACKWARD_SPEED_2_MAX;
                return after;
            }
        case BACKWARD_SPEED_1_FIXED:
            switch(action){
            case "L1":
                after = StateList.BACKWARD_SPEED_1;
                return after;
            default:
                after = StateList.BACKWARD_SPEED_1_FIXED;
                return after;
            }

		}
		return after;
	}
	static String availableActions(StateList before){
		String actions = null;
		switch(before){
		case IDLE:
			actions = "N: Stay idle\nL1: Accelerate forwards\nLS5: Accelerate backwards\nR1: End Cruise";
			return actions;
		case FORWARD_SPEED_1:
			actions = "N: Continue accelerating forwards\nR2: Decelerate\nRS5: Keep current speed";
			return actions;
		case FORWARD_SPEED_2_MAX:
			actions = "N: Keep current speed\nR1: Decelerate";
			return actions;
		case FORWARD_SPEED_1_FIXED:
			actions = "N: Keep current speed\nL1: Exit Fixed Speed";
			return actions;
		case BACKWARD_SPEED_1:
			actions = "N: Continue accelerating backwards\nR1: Decelerate\nRS5: Keep current speed";
			return actions;
		case BACKWARD_SPEED_2_MAX:
			actions = "N: Keep current speed\nR1: Decelerate";
			return actions;
		case BACKWARD_SPEED_1_FIXED:
			actions = "N: Keep current speed\nL1: Exit Fixed Speed";
			return actions;
		}
		return actions;
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
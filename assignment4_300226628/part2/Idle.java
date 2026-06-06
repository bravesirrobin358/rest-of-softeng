import java.util.Scanner;
public class Idle implements State{
	private static Idle instance = new Idle();
 
    private Idle() {}
 
    public static Idle instance() {
        return instance;
    }

	public void doAction(Context context){
		Scanner scanner;
		String input;
		System.out.println(this.toString());
		System.out.println("Available actions:\nN: Stay idle\nL1: Accelerate forwards\nLS5: Accelerate backwards\nR1: End Cruise");
		System.out.print("Enter action: ");
		input = "";
		scanner = new Scanner(System.in);
		input = scanner.nextLine();

		switch(input){
			case "L1":
				context.setState(ForwardSpeed1.instance());
				break;
			case "LS5":
				context.setState(BackwardSpeed1.instance());
				break;
			case "R1":
				context.setState(End.instance());
				break;
			default:
				break;
		}
	}

	public String toString(){
		return "\nCurrent state: Idle";
	}
}
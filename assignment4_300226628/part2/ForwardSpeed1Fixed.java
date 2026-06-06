import java.util.Scanner;
public class ForwardSpeed1Fixed implements State{
	private static ForwardSpeed1Fixed instance = new ForwardSpeed1Fixed();
 
    private ForwardSpeed1Fixed() {}
 
    public static ForwardSpeed1Fixed instance() {
        return instance;
    }

	public void doAction(Context context){
		Scanner scanner;
		String input;
		System.out.println(this.toString());
		System.out.println("Available actions:\nN: Keep current speed\nL1: Exit Fixed Speed");
		System.out.print("Enter action: ");
		
		scanner = new Scanner(System.in);
		input = scanner.nextLine();

		switch(input){
			case "L1":
				context.setState(ForwardSpeed1.instance());
				break;
			default:
				context.setState(ForwardSpeed1Fixed.instance());
				break;
            }
	}
	public String toString(){
		return "\nCurrent state: ForwardSpeed1Fixed";
	}
}
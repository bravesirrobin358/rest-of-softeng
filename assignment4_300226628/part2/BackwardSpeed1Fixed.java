import java.util.Scanner;
public class BackwardSpeed1Fixed implements State{
	private static BackwardSpeed1Fixed instance = new BackwardSpeed1Fixed();
 
    private BackwardSpeed1Fixed() {}
 
    public static BackwardSpeed1Fixed instance() {
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
				context.setState(BackwardSpeed1.instance());
				break;
			default:
				context.setState(BackwardSpeed1Fixed.instance());
				break;
            }

	}
	public String toString(){
		return "\nCurrent state: BackwardSpeed1Fixed";
	}
}
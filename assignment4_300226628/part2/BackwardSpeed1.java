import java.util.Scanner;
public class BackwardSpeed1 implements State{
	private static BackwardSpeed1 instance = new BackwardSpeed1();
 
    private BackwardSpeed1() {}
 
    public static BackwardSpeed1 instance() {
        return instance;
    }

	public void doAction(Context context){
		Scanner scanner;
		String input;
		System.out.println(this.toString());
		System.out.println("Available actions:\nN: Continue accelerating backwards\nR1: Decelerate\nRS5: Keep current speed");
		System.out.print("Enter action: ");
		
		scanner = new Scanner(System.in);
		input = scanner.nextLine();

		switch(input){
			case "R1":
				context.setState(Idle.instance());
				break;
			case "RS5":
				context.setState(BackwardSpeed1Fixed.instance());
				break;
			default:
				context.setState(BackwardSpeed2Max.instance());
				break;
            }

	}
	public String toString(){
		return "\nCurrent state: BackwardSpeed1";
	}
}
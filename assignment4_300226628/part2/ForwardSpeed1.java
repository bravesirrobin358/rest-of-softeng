import java.util.Scanner;
public class ForwardSpeed1 implements State{
	private static ForwardSpeed1 instance = new ForwardSpeed1();
 
    private ForwardSpeed1() {}
 
    public static ForwardSpeed1 instance() {
        return instance;
    }

	public void doAction(Context context){
		Scanner scanner;
		String input;
		System.out.println(this.toString());
		System.out.println("Available actions:\nN: Continue accelerating forwards\nR2: Decelerate\nRS5: Keep current speed");
		System.out.print("Enter action: ");
		
		scanner = new Scanner(System.in);
		input = scanner.nextLine();

		switch(input){
			case "R2":
				context.setState(Idle.instance());
				break;
			case "RS5":
				context.setState(ForwardSpeed1Fixed.instance());
				break;
			default:
				context.setState(ForwardSpeed2Max.instance());
				break;
            }

	}
	public String toString(){
		return "\nCurrent state: ForwardSpeed1";
	}
}
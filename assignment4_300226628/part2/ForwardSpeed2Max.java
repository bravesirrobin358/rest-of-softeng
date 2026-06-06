import java.util.Scanner;
public class ForwardSpeed2Max implements State{
	private static ForwardSpeed2Max instance = new ForwardSpeed2Max();
 
    private ForwardSpeed2Max() {}
 
    public static ForwardSpeed2Max instance() {
        return instance;
    }

	public void doAction(Context context){
		Scanner scanner;
		String input;
		System.out.println(this.toString());
		System.out.println("Available actions:\nN: Keep current speed\nR1: Decelerate");
		System.out.print("Enter action: ");
		
		scanner = new Scanner(System.in);
		input = scanner.nextLine();

		switch(input){
			case "R1":
				context.setState(ForwardSpeed1.instance());
				break;
			default:
				context.setState(ForwardSpeed2Max.instance());
				break;
            }


	}
	public String toString(){
		return "\nCurrent state: ForwardSpeed2Max";
	}
}
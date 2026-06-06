import java.util.Scanner;
public class BackwardSpeed2Max implements State{
	private static BackwardSpeed2Max instance = new BackwardSpeed2Max();
 
    private BackwardSpeed2Max() {}
 
    public static BackwardSpeed2Max instance() {
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
				context.setState(BackwardSpeed1.instance());
				break;
			default:
				context.setState(BackwardSpeed2Max.instance());
				break;
            }

	}
	public String toString(){
		return "\nCurrent state: BackwardSpeed2Max";
	}
}
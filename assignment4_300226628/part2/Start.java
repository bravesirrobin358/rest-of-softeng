import java.util.Scanner;
public class Start implements State{
	private static Start instance = new Start();
 
    private Start() {}
 
    public static Start instance() {
        return instance;
    }

	public void doAction(Context context){
		System.out.println("Welcome to the cruise on the Lunar Rover! As the driver, "
				+ "you can select which \naction to take by inputting the corresponding code, representing the pedals."
				+ " \nEx: 'R1' means Right pedal once, 'LS5' means Left pedal for 5 seconds, and 'N' means no pedals, as in nothing."
				+ " If your input \ndoes not match any of the ones listed, it will default to the action of 'N'.");
		context.setState(Idle.instance());
	}
	public String toString(){
		return "\nCurrent state: Start";
	}
}
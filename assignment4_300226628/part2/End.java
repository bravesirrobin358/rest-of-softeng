import java.util.Scanner;
public class End implements State{
	private static End instance = new End();
 
    private End() {}
 
    public static End instance() {
        return instance;
    }

	public void doAction(Context context){
		System.out.println("Goodbye!");
	}
	public String toString(){
		return "\nCurrent state: End";
	}
}
public class RoverMain{
	public static void main(String[] args){
		Context context = new Context();
		State currentState = Start.instance();

		while (true){
			currentState = context.getState();
			currentState.doAction(context);
			if(context.getState().equals(End.instance())){
				break;
			}
		}
		currentState = context.getState();
		currentState.doAction(context);

	}
}
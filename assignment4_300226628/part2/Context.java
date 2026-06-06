public class Context {
	private State state;

	public Context(){
		state = Start.instance();
	}

	public void setState(State state){
		this.state = state;
	}

	public State getState(){
		return state;
	}
}
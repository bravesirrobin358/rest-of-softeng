// Name: Yannick Vaillancourt
// ID: 300226628
// Commands:
// javac *.java
// java MusicThreads
public class MusicThreads{
	FilePlayer music = new FilePlayer();
	static int index = 0;
	boolean thread1 = true;
	static String[] parts = new String[]{"do", "re", "mi", "fa", "sol", "la", "si", "do-octave", "do-octave"};
	public static void main(String[] args){
		Thread t1=new Thread1();
		Thread t2=new Thread2();
		t1.start();
		t2.start();

	}
	private static MusicThreads instance = new MusicThreads();

	public static MusicThreads getInstance(){
		return instance;
	}

	public synchronized void thread1Notes() {
		if(!thread1) {
			try {
				wait();
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(index<parts.length) {
			System.out.println("thread1: "+parts[index]);
			FilePlayer.play("Sounds\\"+parts[index]+".wav");
			index++;
			thread1=false;
			notifyAll();
		}
	}
	
    public synchronized void thread2Notes() {
		if(thread1) {
			try {
				wait();
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(index<parts.length) {
			System.out.println("thread2: "+parts[index]);
			FilePlayer.play("Sounds\\"+parts[index]+".wav");
			index++;
			thread1=true;
			notifyAll();
		}
	}
	
}
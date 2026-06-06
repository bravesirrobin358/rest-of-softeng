public class MusicThreads{
	FilePlayer music = new FilePlayer();
	int index = 0;
	static String[] parts = new String[]{"do", "re", "mi", "fa", "sol", "la", "si", "do-octave", "do-octave"};
	public static void main(String[] args){
		
		Thread1 t1 = new Thread1();
		
		t1.start();
		Thread2 t2 = new Thread2();

		t2.start();

	}

	public void thread1Notes() {
		synchronized (this) {
			while(index<9) {
				while(index%2==1) {
					try {
						System.out.println("4");
						wait();
						System.out.println("5");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("1");
				//music.play("Sounds\\"+parts[index]+".wav");
				System.out.println("2");
				index++;
				notifyAll();
				System.out.println("3");
			}
		}
	}
	
    public void thread2Notes() {
		synchronized (this) {
			while(index<9) {
				while(index%2==0) {
					try {
						System.out.println("6");
						wait();
						System.out.println("7");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("8");
				//music.play("Sounds\\"+parts[index]+".wav");
				System.out.println("9");
				index++;
				notifyAll();
			}
		}
	}
}
public class PrintOddEvenUsingTwoThread {
	
	int counter=0;
	static String[] n;
	
	public static void main(String[] args) {
		n=new String[]{"do", "re", "mi", "fa", "sol", "la", "si", "do-octave", "do-octave"};
		PrintOddEvenUsingTwoThread poe=new PrintOddEvenUsingTwoThread();
		
		Thread1 t1=new Thread1();
		Thread tOne = new Thread(t1);
		Thread2 t2=new Thread2();
		Thread tTwo = new Thread(t2);
		
		
		tOne.start();
		tTwo.start();
		 
	}
	
	public void printOddNumber() {
		synchronized (this) {
		while(counter <n.length) {
			 while(counter%2==0) {
				 try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			 System.out.println(Thread.currentThread().getName()+"   "+counter);
			 counter++;
			 notify();
		}
		}
	}
	
    public void printEvenNumber() {
    	synchronized (this) {
    	while(counter <n.length) {
			 while(counter%2!=0) {
				 try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			 System.out.println(Thread.currentThread().getName()+"   "+counter);
			 counter++;
			 notify();
		}
    	}
	}
    
}
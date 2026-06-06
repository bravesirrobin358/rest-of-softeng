class Thread1 implements Runnable{
	PrintOddEvenUsingTwoThread poe=new PrintOddEvenUsingTwoThread();
	public void run() {
		while(true){
			poe.printOddNumber();
		}
	}
}
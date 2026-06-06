class Thread2 implements Runnable{
	PrintOddEvenUsingTwoThread poe=new PrintOddEvenUsingTwoThread();
	public void run() {
		while(true){
			poe.printEvenNumber();
		}
	}
}
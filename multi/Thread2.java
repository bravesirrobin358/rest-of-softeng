class Thread2 extends Thread{
	public void run(){
		for(int i=101; i<201; i++){
			System.out.println(i);
		}
	}
}
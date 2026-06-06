class Thread1 extends Thread{
	public void run(){
		while(MusicThreads.index<MusicThreads.parts.length) {
			MusicThreads.getInstance().thread1Notes();
		}
	}
}
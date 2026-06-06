class Thread2 extends Thread{
	public void run() {
		while(MusicThreads.index<MusicThreads.parts.length) {
			MusicThreads.getInstance().thread2Notes();
		}
	}
}
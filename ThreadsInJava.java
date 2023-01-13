package BasicsJava;

public class ThreadsInJava extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Video Reference: https://www.youtube.com/watch?v=2HN__CDik_s
		
		// Thread is a smallest unit of a give process.
		ThreadsInJava thread1 = new ThreadsInJava();
		ThreadsInJava thread2 = new ThreadsInJava();
		ThreadsInJava thread3 = new ThreadsInJava();
		thread1.start();
		thread2.start();
		thread3.start();
	}
	// We cant give static in thread function.
	// Objects need to be created.
	public void run() {
		System.out.println(" Thread is executing");
	}

}

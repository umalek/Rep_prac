package threadexample;

public class MyThread {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Thread firstThread = new Client1();
		firstThread.setName("firstThread");
		//firstThread.setDaemon(true);
		firstThread.start();
		
		
		
		Runnable irun = new ClientRunnable();
		
		Thread t = new Thread(irun, "MyRunnableThread");
		t.start();
		
		
		/*firstThread.join();
		t.join();*/
		
		
		for(int cnt = 0 ; cnt<50 ; cnt++){
			System.out.println("cnt value = " + cnt + "Current thread name --->" + Thread.currentThread().getName() );
		}
		
		System.out.println("Main is finished");
	}

}

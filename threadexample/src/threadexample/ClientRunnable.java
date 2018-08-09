package threadexample;

public class ClientRunnable implements Runnable{

	@Override
	public void run() {
		for(int myRun = 0 ; myRun < 1000 ; myRun++)
		System.out.println(" myRun [ " + myRun + " ] the Current Runnable thread is " + Thread.currentThread().getName());
		
	}

}

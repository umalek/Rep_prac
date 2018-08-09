package threadexample;

public class Client1 extends Thread{
	
	@Override
	public void run(){
		for(int i =0 ; i< 2000 ; i++){
			System.out.println("value is [ " + i +  " ] The current thread " + Thread.currentThread().getName() );
		}
	}

}

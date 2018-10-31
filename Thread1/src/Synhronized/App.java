package Synhronized;

public class App {
	private int count=0;
	//syncronizira nishkite wtorata 4aka dokato pyrwata oswobodi locka
	public synchronized void increment() {
		count++;
	}
	
	public static void main (String[] args) {
		App ap=new App();
		ap.doWork();
		
	}

	private void doWork() {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new Runnable(){
			public void run()
			    {
				  for (int i=0;i<10000;i++){
			    
			    	increment();
			      }
				}
		});
		Thread t2=new Thread(new Runnable(){
			public void run()
			    {
				  for (int i=0;i<10000;i++){
			    
			    	increment();
			      }
				}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count is: "+ count);
		
	}

}

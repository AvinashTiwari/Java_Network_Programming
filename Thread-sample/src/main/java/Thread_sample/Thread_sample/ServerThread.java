package Thread_sample.Thread_sample;

public class ServerThread extends Thread {

	
	public ServerThread(String threadName)
	{
		this.setName(threadName);
	}
	
	@Override
	public void run() {
		int clinent = 1;
		while (clinent != 100) {
			System.out.println(this.getName() + " send data to client" + clinent);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clinent = clinent +1;
		}
	}
}

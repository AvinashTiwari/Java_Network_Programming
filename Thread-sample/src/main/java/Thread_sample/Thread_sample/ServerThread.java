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
			
			clinent = clinent +1;
		}
	}
}

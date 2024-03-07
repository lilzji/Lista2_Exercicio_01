package controller;

public class ThreadTID extends Thread {

	private int tidThread;

	public ThreadTID(int tidThread) {
		this.tidThread = tidThread;
	}

	public void run() {
		int tid = (int) getId();
		System.out.println(tid);
	}

}

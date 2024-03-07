package view;

import controller.ThreadTID;

public class Main {

	public static void main(String[] args) {
		for(int tidThread = 0; tidThread < 5; tidThread++) {
			Thread threadTID = new ThreadTID(tidThread);
			threadTID.start();
		}
	}

}

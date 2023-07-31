package com.technoelevate.methodreference;

public class StartTime {
	public static void main(String[] args) {
		Runnable run = StopWatch::stopWatch;
		Thread th = new Thread(run);
			th.start();
	}
}

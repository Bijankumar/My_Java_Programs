package com.technoelevate.methodreference;

public class StopWatch {
	static int i=0,j;
	public static void stopWatch() {
		while(i<=5) {
			j=0;
			while(j<=60) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i+":"+j++);
			}
			i++;
		}
		
	}
}

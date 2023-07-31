package com.technoelevate.collections30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ListType implements Runnable {	
	static	Lock lock = new ReentrantLock();
	public void run() {
		List list = new ArrayList();
		list.add(50);
		list.add(10);
		list.add(20);
		list.add(60);
		list.add(30);
		list.add(40);
		
//		Collections.synchronizedList(list);	// not working
		
//		synchronized (this) {
		ListType.lock.lock();
			Thread th = Thread.currentThread();
			for (Object o : list) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println(th.getName() + ": " + o);
			}
		ListType.lock.unlock();
//		}
	}
}

public class Synchronized_Arraylist extends Thread {
	public static void main(String[] args) {
		ListType li = new ListType();
		Thread th = new Thread(li);
		th.setName("Thraed 1");

		Thread th1 = new Thread(li);
		th1.setName("Thraed 2");

		th.start();
		th1.start();
	}
}

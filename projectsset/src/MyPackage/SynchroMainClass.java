package MyPackage;

class SharedResource {
	//synchronized public void res1() {
	public void res1() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//synchronized public void res2() {
	 public void res2() {
		for (int i = 101; i <= 110; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Sample extends Thread {
	SharedResource s1;

	public Sample(SharedResource s1) {
		this.s1 = s1;
	}

	public void run() {
		s1.res1();
	}

}

class Demo extends Thread {
	SharedResource s2;

	public Demo(SharedResource s2) {
		this.s2 = s2;
	}

	public void run() {
		s2.res2();
	}

}

public class SynchroMainClass {
	public static void main(String[] args) {
		SharedResource sr = new SharedResource();
		Sample s = new Sample(sr);
		Thread th1 = new Thread(s);
		th1.start();
		Demo d = new Demo(sr);
		Thread th2 = new Thread(d);
		th2.start();
	}
}

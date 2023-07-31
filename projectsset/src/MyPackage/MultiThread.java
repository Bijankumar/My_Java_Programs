package MyPackage;
class Sanu implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
class Sanu2 extends Thread{
	public void run() {
		for (int i = 101; i < 110; i++) {
			System.out.println(i);
		}
	}
}
public class MultiThread {
	public static void main(String[] args) throws InterruptedException {
		Sanu s1 = new Sanu();
		Thread th1= new Thread(s1);
		th1.start();
		Sanu2 s2 = new Sanu2();
		Thread th2= new Thread(s2);
		th2.start();
	}
}

package Thread;

public class Synchronize {
	synchronized void res1()  {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	synchronized void res2()  {
		for (int i = 101; i < 110; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Sanu extends Thread
{	
	Synchronize s1;
	public Sanu(Synchronize s1) {
		this.s1=s1;
	}
	public void run(){
		s1.res1();
	}
}
class Demo extends Thread
{	
	Synchronize s2;
	public Demo(Synchronize s2) {
		this.s2=s2;
	}
	public void run(){
		s2.res2();
	}
}
class MainClass
{
	public static void main(String[]args) 
		{
			Synchronize sn = new Synchronize();
			Sanu s1= new Sanu(sn);
			Thread th1= new Thread(s1);
				th1.start();
				
			Demo d1= new Demo(sn);
			Thread th2= new Thread(d1);
				th1.start();
		}
	
}
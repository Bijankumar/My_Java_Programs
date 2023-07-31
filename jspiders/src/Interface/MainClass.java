package Interface;

import java.util.Scanner;

interface Sample{
	void add();
	void sub();
}
class Sample1 implements Sample{
	Scanner sc = new Scanner(System.in);

	
	int x ,y = sc.nextInt();
//	int x= 10,y = 20;
    public void add() {
		System.out.println(x+y);
	} 
    public void sub() {
		System.out.println(x-y);
	}
}
public class MainClass{
    public static void main(String[] args) {
       Sample1 s1 = new Sample1();
       s1.sub();
       s1.add();
    }
}
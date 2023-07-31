package com.technoelevate.interfacework;
interface MainInteface{
	void m1();void m2();void m3();
	void m4();void m5();void m6();
	void m7();void m8();void m9();
	void m10();
}
abstract class Adapter implements MainInteface{

	@Override
	public void m1() {}

	@Override
	public void m2() {}

	@Override
	public void m3() {}

	@Override
	public void m4() {}
	
	@Override
	public void m5() {}

	@Override
	public void m6() {}

	@Override
	public void m7() {}
	
	@Override
	public void m8() {}

	@Override
	public void m9() { }
	
	@Override
	public void m10() {}
	
}
public class TestInteface extends Adapter{
	@Override
	public void m5() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hii..Good Morning...");
		}
	}
	public static void main(String[] args) {
		TestInteface test = new TestInteface();
		test.m5();
	}
}

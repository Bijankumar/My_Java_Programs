package com.technoelevate.interfacework;
interface Sam{
	 void ram();
}
interface Ram  {
	void ram();
}
public class TestClass implements Ram,Sam {
	@Override
	public void ram() {
		System.out.println("byyyyy....!!");
	}
	
// providing implementation Through Lambda Expression without implementing those interface.
	static Ram s = ()->System.out.println("Hii All....!!");
	
		public static void main(String[] args) {
			new TestClass().ram();
		}
}

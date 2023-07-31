package com.technoelivate.functionalitr;

public interface Bijan {
	void bKumar();
}

interface Sak{
	void bKumar();
}
class Kumar implements Sak,Bijan{

	@Override
	public void bKumar() {
		// TODO Auto-generated method stub
		System.out.println("Hii all...");
	}
	
	
}
 class MainClass{
	 public static void main(String[] args) {
	
//		Bijan bijan = new Bijan() {		
//			@Override
//			public void bKumar() {
//				System.out.println("Hii all...!!");
//			}
//		};
//		Sak sak = new Sak() {		
//			@Override
//			public void bKumar() {
//				System.out.println("Hello all...");
//			}
//		};
		 Kumar kumar = new Kumar();
		 kumar.bKumar();
	}
 }
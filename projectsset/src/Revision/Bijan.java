package Revision;

public class Bijan {
	public static void main(String[] args) {
		int no1 = 1;
		int no2 = no1 + 1, no3;
		System.out.println(no1);
		System.out.println(no2);
		while (no2 >= 0){
			System.out.println(no3 = no1 + no2);
			no1 = no1 + no2;
			no2 = no3;
		}
	}
}
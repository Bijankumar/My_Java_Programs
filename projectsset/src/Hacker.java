import java.util.Scanner;

public class Hacker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//        System.out.println("Enter all inputs ");
//        int i = sc.nextInt();
//        double d = sc.nextDouble();
//        sc.nextLine();
//        String r = sc.nextLine();
//        
//        System.out.println("String: " + r);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

//		System.out.println("================================");
//		System.out.println("Enter the values");
//		for (int i = 0; i < 3; i++) {
//			String s1 = sc.next();
//			int x = sc.nextInt();
//			
//			String y = String.format("%03d", x); // To get Output in three digits like i/p - 50 o/p- 050. 
//			String z = convertToDigits(s1);	 // To get Output in 15 digits like i/p - "java" o/p- "java           ". 
//            System.out.println(z+""+y);
//		}
//		System.out.println("================================");

		System.out.println("***********************************");
		System.out.println("Enter a number");
		int N = sc.nextInt();
		sc.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + (N * i));
		}

		System.out.println("***********************************");

	}

	private static String convertToDigits(String s1) {
		String d = "";
		if (s1.length() <= 15) {
			for (int i = 0; i < 15; i++) {
				if (i < s1.length())
					d += s1.charAt(i);
				else
					d += " ";
			}
		}
		return d;
	}
}
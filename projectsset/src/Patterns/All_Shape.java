package Patterns;

import java.util.Iterator;
import java.util.Scanner;

public class All_Shape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a odd num");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==1||j==1||i==n||j==n) 
					System.out.print("* ");
				 else 
					 System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****00****");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j==1||i==j||i==n) 
					System.out.print("* ");
				 else 
					 System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****01****");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j==n||i+j==n+1||i==n) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****02****");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==1||j==1||i==n||j==n||i+j==n+1||i==j) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****03****");
	
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==n/2+1||j==n/2+1) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****04****");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n+1||i==j) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****05****");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n+1||i==j||i==n/2+1||j==n/2+1) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****06****");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==1||i==j||j==n) 
					System.out.print("* ");
				 else 
					 System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****07****");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j==1||i==1||i+j==n+1) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****08****");
		
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n+1||i==j||i==n/2+1||j==n/2+1||i==1||j==1||i==n||j==n) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****09****");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n*1; j++) {
				if (i==1||j==1||i==n||j==n) 
					System.out.print("*  ");
				 else 
					 System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("  ****10****");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n/2+2||i-j==n/2||j-i==n/2||i+j==n+n/2+1) 
					System.out.print("*  ");
				 else 
					 System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****11****");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n+n/2+1||i-j==n/2||i==n/2+1) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ****12====");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n/2+2||j-i==n/2||i==n/2+1) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ====13====");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==1&&i+j<=n/2+2||j==n&&i+j<=n+n/2+1||j==1&&i+j>=n/2+2||i==n&&i+j>=n+n/2+1||i==n/2+1||j==n/2+1) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ====14====");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j==n&&i+j<=n+n/2+1||j==1&&i+j<=n/2+2||i==n/2+1||j==n/2+1) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ====15====");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n+1&&i-j<0||i==j&&i+j<n+1||j==n/2+1) 			
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ====16====");
		
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n+1&&i-j>0||i==j&&i+j>n+1||j==n/2+1||i==n/2+1) 			
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ====17====");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==2||j==n/2+1) 			
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ====18====");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==j&&i+j<=n+1||i+j==n+1&&i-j>=0||j==n/2+1||j==n/2+1||i==n/2+1) 			
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ====19====");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==j&&i+j>=n+1||i+j==n+1&&i-j<=0||j==n/2+1||j==n/2+1||i==n/2+1) 			
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("  ====20====");
		
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==1&&i+j<=n/2+2||j==n&&i+j<=n+n/2+1||j==1&&i+j>=n/2+2||i==n&&i+j>=n+n/2+1||i==j||i+j==n+1) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("   ====21====");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==1&&i+j<=n/2+2||j==n&&i+j<=n+n/2+1||j==1&&i+j>=n/2+2||i==n&&i+j>=n+n/2+1||i==j||i+j==n+1||i==n/2+1||j==n/2+1) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("    ====22====");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i%2==j%2) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("    ====23====");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i%2==j%2&&i>1&&i<n)||(i%2==j%2&&j>1&&j<n)) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("    ====24====");
	}
}

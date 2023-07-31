package Patterns;

import java.util.Scanner;

public class Letter_A_Z {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter an odd number");
//		int n = sc.nextInt();
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||j==1||j==n||i==n/2+1)			//A
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if((i==1&&i+j<n+1)||j==1||
						j==n||i==n/2+1||
						(i==n&&i+j<n*2))	//B
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||j==1||i==n)					//C
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if((i==1&&i+j<n+1)||j==1||
				   (i==n&&i+j<n*2)||
				   (j==n&&(i+j>n+1&&i+j<n*2)))			//D
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||j==1||i==n/2+1||i==n)			//E
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||j==1||i==n/2+1)				//F
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
			
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
			if(i==1||j==1||i==n||(j==n&&j+i>=n+n/2+1)
					||(i==n/2+1&&i+j>=n+1))				//G
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j==1||j==n||i==n/2+1)				//H
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||j==n/2+1||i==n)				//I
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||j==n/2+1||(i==n&&i+j<=n+n/2+1))  //J
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j==1||i+j==n/2+2||i-j==n/2)				//K
					System.out.print(" * ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j==1||i==n)								//L
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j==1||j==n||(i==j&&i+j<=n+1)
						||(i+j==n+1&&i-j<=0))				 //M
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j==1||j==n||i==j)						 //N
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if((i==1&&(i+j>n/2&&i+j<n+1))||
				   (j==1&&(i+j>n/2&&i+j<n+1))||				//O
				   (i==n&&(i+j>n+1&&i+j<n+n))||
				   (j==n&&(i+j>n+1&&i+j<n+n)))				
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||j==1||i==n/2+1||
						(j==n&&i+j<=n+n/2+1))				//P
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n+1; i++) {
			for (int j = 1; j <= n+1; j++) {
				if((i==1&&(i+j>n/2&&i+j<n+1))||
						(j==1&&(i+j>n/2&&i+j<n+1))||		//Q
						(i==n&&(i+j>n+1&&i+j<n+n))||
						(j==n&&(i+j>n+1&&i+j<n+n))||
						(i==j&&(i+j>n+1)))				
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||j==1||i==n/2+1||
						(j==n&&i+j<=n+n/2+1)||
						(i==j&&i+j>=n+1))			     	//R
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if((i==1&&i+j>n/2)||
				   (j==1&&(i+j>n/2&&i+j<=n/2+2))||			//S
				   (i==n&&i+j<n+n)||i==n/2+1||
				   (j==n&&(i+j>=n+n/2+1&&i+j<n+n)))				
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||j==n/2+1)  						//T
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(
				   (j==1&&(i+j<n+1))||						//U
				   (i==n&&(i+j>n+1&&i+j<n+n))||
				   (j==n&&(i+j<n+n)))				
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n+n/2+1||i-j==n/2)			    	//V 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n+1&&i-j>=0||
						i==j&&i+j>=n+1||
						j==1||j==n) 						//w
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n+1||i==j) 						//X
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n+1||i==j&&i+j<n+n/2+1) 			//y
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();		
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n+1||i==1||i==n) 					//Z
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

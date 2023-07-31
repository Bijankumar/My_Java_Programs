package com.technoelivate.Assignment;
	//	Find the value of i and j?

public class Test_Case {
	public static void main(String[] args) {
		int i=0;	// 1	0	0
		i++;
		--i;
		int j=i++  +  --i  +  ++i  +  i--; //	0 + 0 + 1 + 1
		System.out.println(j);	//*	2
		System.out.println(i);	//*	0
		
	//	What is output  println and value of x?
				int x=5;	// 4
				System.out.println(x>4&&x-->5);	//* false
				System.out.println(x);	//* 4
				
	//	Find the value of a,b,c,d?
						int a=10;	//	11	12
						int b=10;	//	11	12
						int c=a++  +  ++b;	//	10 + 11 = 22 
						int d=b++  + ++a  +  c++;	//	11 + 12 + 21 = 44
						System.out.println(d);	//*	44
						System.out.println(c);	//*	21
						System.out.println(b);	//*	12
						System.out.println(a);	//*	12
						
	//	Find out the value of a1 & b1?
						int a1=5;	//	6
							a1++;	
						int b1=a1>5?6:a1++;	//	6
						System.out.println(a1);	//*	6
						System.out.println(b1);	//*	6
						
	//	Find out the value of a11?
						int a11=4;
						a11<<=2; // given value 2 so shift 2 bits left side	
			//	16	8	4	2	1   Binary positions (2's power)
//========================================//
			//			1	0	0   Binary Value for '4'
			//	1	0	0	0	0	sifting 2 bits left side
//========================================//
// 				16						
						System.out.println(a11++);	//*	16
						
	// Find out the value of a&b and println?
							int a111=10;	// 11
							int b11=10;		//	9
							System.out.println(++a111>10&&(b11--<10));  // false
									//			11>10    && 10<10
							System.out.println(a111);	//*	11
							System.out.println(b11);	//*	9
							
	// Find out the value of i and j?
					int i1=5; // 6	7
					int j1=++i1>5?i1++:++i1;	// 6
					System.out.println(j1);	//*	6
					System.out.println(i1);	//*	7
					
	// Find the output of println and a value?
							int a2=4;	// 
							System.out.println((a2&=5)>5||(a2--<5));//* true
							System.out.println(a2); 	//* 3
							
	//Find the value of a and b?
							int a3=10;	//20	21
							a3<<=1;
			//	16	8	4	2	1   Binary positions (2's power)
			//========================================//
			//		1	0	1	0   Binary Value for '4'
			//	1	0	1	0	0	sifting 2 bits left side
			//========================================//
//				16	+	4		= 20					
								
							int b2=a3>20?a3++:++a3;	// 21
							System.out.println(a3);	//* 21
							System.out.println(b2);	//* 21
							
	// Find out the value of i2 and println?
							int i2=4;
							i2&=5;	// 4
							System.out.println(++i2);	//	5
							
	// Question 1.
							int i3=0; // 1	0	1	0	*-1
							i3++;
							--i3;
							int j2=i3++  +  --i3  +  ++i3  +  i3--; 
							//		0	+	0	+	1	+	1	=	2	1	*2
							j2--;
							System.out.println(++j2); 	//*	2
							System.out.println(i3--);	//* 0	

	// Question 2.
							int a4=5;	//	6
							System.out.println(++a4>4||a4-->5); //* true
							System.out.println(a4); 			//*	6
							
	// Question 3.
							int a6=10,b4=10,c1=10;
							a6=a6++  +  ++b4;
							//	10	+	11 = 21
							int d1=b4++  + ++a6  +  c1++;
							//		11	+ 22	+	10	= 43
							System.out.println(d1); //	*43
							System.out.println(c1); //	*11
							System.out.println(b4);	// 11 *12
							System.out.println(a6); // 11 *21
						
	// Question 4.
							int a7=5;	// 6 5	6
							a7++;
							int b5=--a7>5?6:a7++;
							System.out.println(a7);	// 6
							System.out.println(b5);	// 5
	// Question 5.
							int i4=4;
							i4&=5;
							System.out.println(i4<<1); //* 8
						
	// Question 6.
							int a8=4;
							a8<<=1;
		  //	16	8	4	2	1   Binary positions (2's power)
	//========================================//
			//			1	0	0   Binary Value for '4'
			//		1	0	0	0	sifting 2 bits left side
	//========================================//
	//				8				= 8	
							System.out.println(a8>>1);	//* 4
				
	// Question 7.
							int a9=10,b6=10;
							System.out.println(++a9>10&&(b6--<10));
							//			       11 > 10 && 10 < 10   false
							System.out.println(a9);  // 11
							System.out.println(b6);  // 9
						
	// Question 8.
							int i5=5;	// 6 7
							int j6=i5++>5 ? i5++ : ++i5 ;
							System.out.println(j6); //	7
							System.out.println(i5);	//	7
					
							
	// Question 9.
							int a12=4;
							System.out.println((a12&=5)>5||(a12--<5)); // true
							System.out.println(a12); // 3
						
	// Question 10.
							int a13=10;	// 5 6
							a13>>=1;
				 //	16	8	4	2	1   Binary positions (2's power)
		//========================================//
				//		1	0	1	0   Binary Value for '10'
				//			1	0	1	sifting 1 bits right side
		//========================================//
		//					4	+	1	= 5	
							int b12=a13++>5 ? a13++ : ++a13;	// 7
							System.out.println(a13); //		7
							System.out.println(b12); //		7				
	}
}

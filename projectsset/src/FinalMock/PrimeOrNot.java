package FinalMock;

public class PrimeOrNot {
	public static void main(String[]args)
   {
    int no =5;
    boolean flag=true;
    for(int i=2; i<=no/2;i++)
    {
     if (no%i==0)
     {
      flag=false;
      break;
     }
    }
    if(flag==true)
      System.out.println("Prime Number");
    else 
      System.out.println("Not a Prime Number");
     
   }
}
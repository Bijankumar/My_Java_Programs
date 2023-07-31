package NumbersPrograms;

public class PrimeOrNot
{
  public static void main(String[]args)
   {
    int no = 4;
    int count=0;
    for(int i=1; i<=no;i++)
    {
     if (no%i==0)
     {
      count++;
     }
    }
    if(count==2)
    { 
      System.out.println("Prime Number");
     } else {
      System.out.println("Not a Prime Number");
     }
   }
}
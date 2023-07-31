class Disarium
{
     public static void main(String args[])
      {
         int no =175,sum=0,copy=no;
        while(no!=0)
          {
                int base = no%10;
               sum+=power(base,count(no));
               no/=10;
          }
          if(copy==sum)
                System.out.println("Desarium");
        else
               System.out.println("not a Desarium");
   }
   public static int power(int base,int exp)
    {
      int ans =1;
      while(exp!=0)
       {
         ans*=base;
         exp--;
      }
     return ans;
   }
  public static int count(int no)
  {
  int count=0;
    while(no!=0)
    {
     no/=10;
      count++;
     }
    return count;
    }
}
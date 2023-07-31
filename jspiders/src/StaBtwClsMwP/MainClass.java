package StaBtwClsMwP;
class PrimeNumber
{
    static void num(int a)
    {
        //int Count =0;
        for (int i = 1;i<=a;i++)
        {
            int count = 0;
            for (int j = 1;j<=i;j++)
            {
                if (i%j==0)
                {
                    count++;
                }
            }
            System.out.println(count);
//            if (count==2)
//            {
//                Count++;
//            }
        }
       /* if (Count==10)
        {
            System.out.println();
        }*/
    }
}
public class MainClass {
    public static void main(String[] args) {
        PrimeNumber.num(10);
    }
}

package BesicPGMS;
public class HappyNumbers {
    static int  num(int no)
    {
        int sum = 0;
        while (no!=0)
        {
            int rem = no%10;
            sum+=rem*rem;
            no=no/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 247;
        int a= n;
        while (n>9)
        {
            n=num(n);
        }
        if (n==1||n==7)
        {
            System.out.println(a+" is a Happy number");
        }else {
            System.out.println(a+" is not a Happy number");
        }
    }
}

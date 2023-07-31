package BesicPGMS;
//WAP to get the sum of Given num till getting single num.
class Number
{
    static void num(int no)
    {
        int sum=0;
        while (no!=0)
        {
            int rem = no%10;
            sum+=rem;
            no = no/10;
        }
        System.out.println(sum);
    }
}
public class SumNumber {
    public static void main(String[] args) {
        int n =247;
        if(n>9)
        {
            Number.num(n);
        }
    }
}

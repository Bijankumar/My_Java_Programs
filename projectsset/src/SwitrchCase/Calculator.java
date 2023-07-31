package SwitrchCase;

import java.util.Scanner;
class Calculator
{
    static void add(int a,int b)
    {
        System.out.println("Addition of  these two number is : "+(a+b));
    }
    static void mul(int a,int b)
    {
        System.out.println("Multiplication of  these two number is : "+(a*b));
    }
    static void div(int a,int b)
    {
        System.out.println("Division of  these two number is : "+(a/b));
    }
    static void sub(int a,int b)
    {
        System.out.println("Substraction of  these two number is : "+(a-b));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer value : ");
        int x = sc.nextInt();
        String z = sc.next();
        System.out.print("Enter another Integer  value : ");
        int y = sc.nextInt();
        switch (z)
        {
            case "+" : add(x,y);
                break;
            case "*" : mul(x,y);
                break;
            case "/" : div(x,y);
                break;
            case "-": sub(x,y);
        }
    }
}

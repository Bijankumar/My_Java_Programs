package StringPrograms;

import java.util.Scanner;
public class Palindrome {
    static void word1(String x)
    {
        String str = "";
        for (int i =x.length()-1;i>=0;i--)
        {
            str+=x.charAt(i);
        }
        if (str.equals(x))
        {
            System.out.println( str+ " It is a palindrome!!");
        }else {
            System.out.println(str+ " It is not a palindrome!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        word1(sc.next());
    }
}

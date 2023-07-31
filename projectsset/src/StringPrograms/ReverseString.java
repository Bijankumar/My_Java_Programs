package StringPrograms;

import java.util.Scanner;
public class ReverseString {
    static void word(String x)
    {
        String str = "";
        for (int i =x.length()-1;i>=0;i--)
        {
            str+=x.charAt(i);
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        word(sc.next());
    }
}

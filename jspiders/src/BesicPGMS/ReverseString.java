package BesicPGMS;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter javamava to get aaaavvjm");
        String x = sc.next();
        String str1="",str2="",str3 ="";
        for (int i = 0;i<x.length();i++)
        {
            char ch = x.charAt(i);
            if (ch=='a')
                str1 = str1+ch;
            else if (ch=='v')
                str2 = str2+ch;
            else
                str3 = str3+ch;
        }
        System.out.println(str1+str2+str3);
    }
}

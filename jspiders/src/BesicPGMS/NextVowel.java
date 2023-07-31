package BesicPGMS;
import java.util.Scanner;
public class NextVowel{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a vowel character: ");
        char vowel = input.next().toLowerCase().charAt(0);
        char nextVowel = '\0';
        switch (vowel) {
            case 'a':
                nextVowel = 'e';
                break;
            case 'e':
                nextVowel = 'i';
                break;
            case 'i':
                nextVowel = 'o';
                break;
            case 'o':
                nextVowel = 'u';
                break;
            case 'u':
                nextVowel = 'a';
                break;
            default:
                System.out.println("Invalid input!");
        }
        System.out.println("The next vowel is: " + nextVowel);
    }
}
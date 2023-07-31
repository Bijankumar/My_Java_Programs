import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str ="silent",str1="listen";
		if(str.length()==str1.length()) {
		char []srr=str.toLowerCase().toCharArray(),sr2=str1.toLowerCase().toCharArray();
		Arrays.sort(srr);
		Arrays.sort(sr2);
		if(Arrays.equals(srr, sr2))
			System.out.println("It's a Anagram !!");
		else	
			System.out.println("It's not a Anagram !!");
		}else
			System.out.println("It's not a Anagram !!");
	}
}
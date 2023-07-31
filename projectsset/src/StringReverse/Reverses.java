package StringReverse;
import java.util.Arrays;
public class Reverses {
	public static void main(String[] args) {
		String str = "Rama is a Good Boy"; //Output--> Boy Good a is Rama yoB dooG a si amaR.
		String str1[]=str.split(" "),strr;int x=0,y=str1.length;
		String str2[]=new String[str1.length*2];
		for (int i = str1.length-1; i >=0 ;i--) {
			strr=str2[x];
			x++;
			String rev="";
			for (int j = strr.length()-1; j >=0; j--) {	
			rev+=strr.charAt(j);
			}
			str2[y]=rev;
			y++;	
			str2[x]=str1[i];
		}
		for (String s : str2) {
			System.out.print(s+" ");
		}
	}
}
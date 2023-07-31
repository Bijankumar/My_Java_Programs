import java.util.Arrays;
public class ReverseArray {
	public static void main(String[] args) {
		String []str ={"Bijan","Dinesh"};
		StringBuilder trr[]=new  StringBuilder[str.length];
		for (int i = 0; i < str.length; i++) {
		StringBuilder s1 =new StringBuilder(str[i]);
			trr[i]=s1.reverse();
		}
		System.out.println(Arrays.toString(trr));	
//		String strr;
//		for (int i = 0; i < str.length; i++) {
//			strr=str[i];
//			String rev = "";
//			for (int j = strr.length()-1; j >=0; j--) {
//				rev+=strr.charAt(j);
//			}
//			str[i]=rev;
//		}
//		System.out.println(Arrays.toString(str));
	}
}

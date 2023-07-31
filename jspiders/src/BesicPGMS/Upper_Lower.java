package BesicPGMS;
public class Upper_Lower {
    public static void main(String[] args) {
        String str= "BIJAN";
//        System.out.println(str.toLowerCase());
        for (int i = 0;i<str.length();i++) {
//            char ch = (char) (str.charAt(i) + 32);
//            System.out.print(ch);
            System.out.print((char)(str.charAt(i)+32));
        }
    }
}

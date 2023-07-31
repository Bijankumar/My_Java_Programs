class Remove_Vowel
{
    public static void  main(String args[])
     { 
//          String str = "lokeshsir", str1;
//          for(int i = 0;i<str.length();i++)
//           {
//        	  str1="";
//             char ch = str.charAt(i);
//              if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//            	  str1+=ch;
//                      str=str.replaceAll(str1,"");
//           }
//        System.out.println(str);
          
    	String str = "lokeshsir", str1="";
          for(int i = 0;i<str.length();i++)
          {
            char ch = str.charAt(i);
             if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
           	  str1+=ch;
          }
       System.out.println(str1);
     }
}
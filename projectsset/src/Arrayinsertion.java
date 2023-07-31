import java.util.Arrays;
class ArrayInsertion
{
 public static void main(String [] args)
    {
        int arr [] = {1,2,3,4,5};
        int element = 10;
         int res [] = new int [arr.length+1];
          for(int i = 0; i<arr.length;i++)
            { 
                 res[i]=arr[i];
             }
           res[res.length-1]=element;
     System.out.println(Arrays.toString(res));
    }
}
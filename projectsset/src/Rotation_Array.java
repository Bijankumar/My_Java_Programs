import java.util.Arrays;
class Rotation_Array
{
   public static void main(String [] args)
   {
       int arr [] = {1,2,3,4,5,6};
       int rotate =2,x=0;
       int res [] = new int[arr.length]; 
        for(int i=rotate;i<arr.length;i++)
        {
           res[x] = arr[i];
           x++;
        }
       for(int i = 0;i<rotate;i++)
        {
           res[x] = arr[i];
           x++;
        }
       System.out.println(Arrays.toString(res));
   }
}
package Arrays;

public class Even {
    static  void  num(int a,int b)
    {
        for (int i =a;i<=10;i++)
        {
            if (i%2==0)
            {
                int[]arr= {i};
                for (int j=0;j<arr.length-1;j++)
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        num(1,10);
    }
}

package Constructor;

class Sample
{
    int a;
    int b;
    Sample(int x,int y)
    {
        a=x;
        b=y;
    }
}
public class Constructor {
    public static void main(String[] args)
    {
        Sample s = new Sample(10,20);
        System.out.println(s.a);
        System.out.println(s.b);
    }
}

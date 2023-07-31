package StaBtwClsMwP;

class Circle
{
    static void  area(int r)
    {
        final double pi = 3.142;
        double res = pi*r*r;
        System.out.println(res);
    }
}
public class AreaOfCircle
{
    public static void main(String[] args)
    {
        Circle.area(5);
    }
}

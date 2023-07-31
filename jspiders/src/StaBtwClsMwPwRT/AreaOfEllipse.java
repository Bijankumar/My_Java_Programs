package StaBtwClsMwPwRT;
class Ellipse
{
    static double area(int a,int b)
    {
        final double pi = 3.142;
        double res = pi*a*b;
        return res;
    }
}
public class AreaOfEllipse {
    public static void main(String[] args)
    {
        double x= Ellipse.area(5,6);
        System.out.println(x);
    }
}

package NonStaBtwClsMwPwRT;
class Trapezoid
{
    int area(int a,int b,int h)
    {
        int r = (a+b)*h/2;
        return r;
    }
}
public class AreaOfTrapezoid {
    public static void main(String[] args)
    {
        Trapezoid t = new Trapezoid();
        int x = t.area(5,6,8);
        System.out.println(x);
    }
}

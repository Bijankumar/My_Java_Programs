package NonStaBtwClsMwP;
class Triangle
{
    void area(int a ,int b)
    {
        int r =(a*b)/2;
        System.out.println(r);
    }
}
public class AreaOfTriangle {
    public static void main(String[] args) {
        Triangle a = new Triangle();
        a.area(5,6);
    }
}

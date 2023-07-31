package NonStaBtwClsMwPwDIP;

import java.util.Scanner;

class Rectangle
{
    int area(int a, int b)
    {
        int r =a*b;
        return r;
    }
}
public class AreaOfRectangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        int x = sc.nextInt(); int y = sc.nextInt();
        int g= r.area(x,y);
        System.out.println(g);
    }
}

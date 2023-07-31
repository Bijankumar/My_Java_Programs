package StaBtwClsMwPwDIP;

import java.util.Scanner;

class Sector
{
    static void  area(int r)
    {
        double t= 30.5;
        double res = ((r*r)*t)/2;
        System.out.println(res);
    }
}

public class AreaOfSector
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        Sector.area(x);
    }
}

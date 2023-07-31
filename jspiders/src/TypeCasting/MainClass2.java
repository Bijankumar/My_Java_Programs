package TypeCasting;
class Demo
{
    void disp()
    {
        System.out.println(20*5);
    }
}
class Ammu extends Demo
{
    void tata()
    {
        System.out.println(20+5);
    }
}
public class MainClass2 {
    public static void main(String[] args) {
        Demo d1= new Ammu();
        d1.disp();
        Ammu a1=(Ammu) d1;
        a1.disp();
        a1.tata();
    }
}

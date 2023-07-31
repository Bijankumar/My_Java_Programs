package TypeCasting;

class Sample
{
    int x=10;
}
class Pemo extends Sample
{
    void ho()
    {
        System.out.println(10*2);
    }
}
public class MainClass {
    public static void main(String[] args) {
        Sample s1= new Pemo();
        System.out.println(s1.x);
        Pemo p1 = (Pemo) s1;
        p1.ho();
        System.out.println(p1.x);
    }
}

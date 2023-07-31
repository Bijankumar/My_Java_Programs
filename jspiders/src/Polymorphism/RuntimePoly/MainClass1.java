package Polymorphism.RuntimePoly;
class Youtube
{
    void watch()
    {
        System.out.println("Movies,Studies,Technologies");
    }
}
class Movies extends Youtube
{
    void watch()
    {
        System.out.println("Watching Movies");
    }
}
class Studies extends Youtube
{
    void watch()
    {
        System.out.println("Watching Study Related");
    }
}
class Tech extends Youtube
{
    void watch()
    {
        System.out.println("Watching Tech Videos");
    }
}
class User
{
    static void access(Youtube y1)
    {
        if (y1 instanceof Youtube)
        {
            y1.watch();
        }
    }
}
public class MainClass1 {
    public static void main(String[] args) {
        Movies m1 = new Movies();
        Studies s1 = new Studies();
        Tech t1 = new Tech();
        User.access(m1);
        User.access(s1);
        User.access(t1);
    }
}

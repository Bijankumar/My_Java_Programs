package Polymorphism.RuntimePoly;
class Farmer
{
    void grow()
    {
        System.out.println("Does his Farming");
    }
}
class Adams extends Farmer
{
    void grow()
    {
        System.out.println("Grows Rice");
    }
}
class Allen extends Farmer
{
    void grow()
    {
        System.out.println("Grows Corn");
    }
}
class Martine extends Farmer
{
    void grow()
    {
        System.out.println("Grows Vegetables");
    }
}
class Customer
{
    static void need(Farmer f1)
    {
        if (f1 instanceof Farmer)
        {
            f1.grow();
        }
    }
}
public class MainClass {
    public static void main(String[] args) {
        Adams a1 = new Adams();
        Allen a2 = new Allen();
        Martine m1 = new Martine();
        Customer.need(m1);
        Customer.need(a1);
        Customer.need(a2);
    }
}

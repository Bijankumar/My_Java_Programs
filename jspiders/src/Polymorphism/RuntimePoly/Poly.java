package Polymorphism.RuntimePoly;
class Animal
{
    void noise()
    {
        System.out.println("Make Some noise");
    }
}
class Dog extends Animal
{
     void noise()
    {
        System.out.println("bow bow bow noise");
    }
}
class Cat extends Animal
{
     void noise()
    {
        System.out.println("miow miow noise");
    }
}
class Snake extends Animal
{
    void noise()
    {
        System.out.println("buss buss noise");
    }
}
class Stimulator
{
    static void ansim(Animal a1)
    {
        if (a1 instanceof Animal) {
            a1.noise();
        }
    }
}
public class Poly {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Snake s1 = new Snake();
        Stimulator.ansim(s1);
        Stimulator.ansim(null);
        Stimulator.ansim(c1);
        Stimulator.ansim(d1);
    }
}

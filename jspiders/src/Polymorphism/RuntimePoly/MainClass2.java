package Polymorphism.RuntimePoly;
class Hospital
{
    void treat()
    {
        System.out.println("All Treatment Done here");
    }
}
class Cardiology extends Hospital
{
    void treat()
    {
        System.out.println("Heart Specialist");
    }
}
class Orthopadic extends Hospital
{
    void treat()
    {
        System.out.println("Bone Specialist");
    }
}
class Nerology extends Hospital
{
    void treat()
    {
        System.out.println("Nerologist");
    }
}

public class MainClass2 {
    public static void main(String[] args) {
        Cardiology c1 = new Cardiology();
    }
}

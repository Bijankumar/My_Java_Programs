package Revision;

class Animal
{
	void noise()
	{
		System.out.println("Make Some Noise");
	}
}
class Dog extends Animal
{
	void noise()
	{
		System.out.println("Bow Bow");
	}
}
class Cat extends Animal
{
	void noise()
	{
		System.out.println("Miow Miow");
	}
}
class Stimulator
{
	static void ansim(Animal a)
	{
		if(a instanceof Animal)
		a.noise();
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		Stimulator.ansim(c1);
		Stimulator.ansim(d1);
		
	}
}

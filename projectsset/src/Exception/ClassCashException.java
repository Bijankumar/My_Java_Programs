package Exception;
class Animal
{
	 void noise(){
		System.out.println("Make Some Noise");
	}
	int x = 12;
}
class Dog extends Animal
{
	void noise(){
		System.out.println("Bow Bow...");
	}
}
class Cat extends Animal
{
	void noise(){
		System.out.println("Miow Miow...");
	}
}
class Stimulator
{
	static void anisim(Animal a1){
		if (a1 instanceof Animal) {
			a1.noise();
		}
	}
}

public class ClassCashException {
	public static void main(String[] args) {
		// Runtime Polymorphism
		Dog d = new Dog();
		Cat c = new Cat();
		Stimulator.anisim(d);
		Stimulator.anisim(c);
		// Upcasting...
		Animal a=new Dog();
		System.out.println(a.x);
		a.noise();
		//Without upcast Downcasting(ClassCashException)
//		Dog d = (Dog)new Animal();
//		d.noise();
	}
}

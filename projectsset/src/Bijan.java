
abstract interface Bijan1 {
void disp();
}
class Bijan implements Bijan1{
	public static void main(String[] args) {
		Bijan b = new Bijan();
		b.disp();
	}
	@Override
	public void disp() {
		System.out.println(10+20);
		
	}
}

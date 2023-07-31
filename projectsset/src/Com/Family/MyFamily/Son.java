package Com.Family.MyFamily;

public class Son {
    public static void main(String[] args) {
        Father f1= new Father();
        f1.bike();
        f1.car();
        f1.cycle();
       // f1.atm(); We cannot call private members outside the class.
    }
}

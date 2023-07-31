package Encapsulation;
class IciciBank{
    private String psw="Dinga";
    public String getPsw(){
        return psw;
    }
    public void setPsw(String psw)
    {
        this.psw=psw;
    }
}
public class Coustomer {
    public static void main(String[] args) {
        IciciBank a1 = new IciciBank();
        System.out.println(a1.getPsw());
        a1.setPsw("Dingi");
        System.out.println(a1.getPsw());
    }
}

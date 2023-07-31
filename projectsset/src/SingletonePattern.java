class Sample{
	static Sample s1;
	int psw=1235;
	private Sample(){
	}
	public static Sample get(){
			s1=new Sample();
		return s1;		
	}
}
public class SingletonePattern {
	public static void main(String[] args) {
		Sample s2=Sample.get();
		System.out.println(s2.psw);
//		Sample s1 =new Sample();
		
	}
}
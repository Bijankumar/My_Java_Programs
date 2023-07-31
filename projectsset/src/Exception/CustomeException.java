package Exception;

public class CustomeException {
	public static void main(String[] args) {
		try {
			submit(15);
		}catch(MarriageException e) {
			System.out.println(e.getMsg());
		}
	}
	private static void submit(int age)throws MarriageException {
		if(age>25)
			System.out.println("Happy Married Life");
		else
			throw new MarriageException("Invalid Age !!");
	}
}
class MarriageException extends Exception
{
	String Msg;
	MarriageException(String Msg){
		this.Msg=Msg;
	}
	public String getMsg() {
		
		return Msg;
	}
}

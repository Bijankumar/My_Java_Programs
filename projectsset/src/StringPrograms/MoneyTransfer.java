package StringPrograms;
class Account
{
	 int Balance;
	public Account(int i) {
		Balance=i;
	}
	public  void widraw(int amt) {
		Balance-=amt;
	}
	public  void diposite(int amt) {
		Balance+=amt;
	}
	
}
public class MoneyTransfer {
	public static void main(String[] args) {
		Account sender = new Account(1000);
		Account recever = new Account(500);
		
		System.out.println("Sender Acc. Previous Balance :"+sender.Balance);
		System.out.println("Sender Acc. Previous Balance :"+recever.Balance);
		
		sender.widraw(500);
		recever.diposite(500);
		
		System.out.println("Sender Acc. current Balance :"+sender.Balance);
		System.out.println("Sender Acc. current Balance :"+recever.Balance);
		
	}
}

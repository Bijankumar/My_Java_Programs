class Account {
    int balance;

    public Account(int initialBalance) {
        balance = initialBalance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}

public class TransferMoney {
    public static void main(String[] args) {
        Account sender = new Account(1000);
        Account receiver = new Account(500);
        

        System.out.println("Sender's initial balance: " + sender.balance);
        System.out.println("Receiver's initial balance: " + receiver.balance);

        // Transfer 500 amount from sender's account to receiver's account
        sender.withdraw(500);
        receiver.deposit(500);

        System.out.println("Sender's new balance: " + sender.balance);
        System.out.println("Receiver's new balance: " + receiver.balance);
    }
}

package classAndObject;

class BankAccount{
	int accountNo = 0;
	float accountBalance = 0;
    public BankAccount() {};
    public BankAccount(int accountNo, float balance) {
    	this.accountNo = accountNo;
    	accountBalance = balance;
    }
    void setAccountNumber(int num) {
    	accountNo = num;
    }
    
    void withdraw(float amount) {
    	accountBalance -=amount; 
    }
    
    void deposit(float amount) {
    	accountBalance+=amount;
    }
    
    void status() {
    	System.out.println("Account number: "+ accountNo );
    	System.out.println("Account Balance: "+ accountBalance);
    }

}

public class Bank {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		account1.setAccountNumber(820);
		account1.deposit(3000000);
		account1.status();
		
		BankAccount account2 = new BankAccount(819,3000000);
		account2.withdraw(50000);
		account2.status();

	}

}

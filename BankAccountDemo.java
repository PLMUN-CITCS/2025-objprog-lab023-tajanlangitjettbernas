class BankAccount {
    public String accountHolder;
    private double balance;
    protected String accountType;

    
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount. Either the amount is greater than the balance or less than/equal to 0.");
        }
    }

    
    public double getBalance() {
        return balance;
    }
}


public class BankAccountDemo {
    public static void main(String[] args) {
        
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        
        myAccount.deposit(250.0);
        myAccount.withdraw(100.0);

        
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
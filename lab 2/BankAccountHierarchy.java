// Account class (parent class)
class Account {
    String accountNumber;
    double balance;

    // Constructor to initialize account number and balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account balance
    public void displayBalance() {
        System.out.println("Account " + accountNumber + " balance: " + balance);
    }
}

// SavingsAccount class (child class of Account)
class SavingsAccount extends Account {
    double interestRate;

    // Constructor to initialize account number, balance, and interest rate
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);  // Call the constructor of the parent class (Account)
        this.interestRate = interestRate;
    }

    // Method to add interest to the account balance
    public void addInterest() {
        balance += balance * interestRate;
        System.out.println("Interest added to account " + accountNumber);
    }
}

// CheckingAccount class (child class of Account)
class CheckingAccount extends Account {
    double overdraftLimit;

    // Constructor to initialize account number, balance, and overdraft limit
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);  // Call the constructor of the parent class (Account)
        this.overdraftLimit = overdraftLimit;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from checking account " + accountNumber);
        } else {
            System.out.println("Insufficient funds for withdrawal from account " + accountNumber);
        }
    }
}

// Main class to run the program
public class BankAccountHierarchy {
    public static void main(String[] args) {
        // Create a SavingsAccount object with account number "SA001", balance 1000.0, and interest rate 0.05
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000.0, 0.05);

        // Create a CheckingAccount object with account number "CA001", balance 500.0, and overdraft limit 200.0
        CheckingAccount checkingAccount = new CheckingAccount("CA001", 500.0, 200.0);

        // Display the initial balance of the savings account
        savingsAccount.displayBalance();

        // Add interest to the savings account
        savingsAccount.addInterest();

        // Display the balance of the savings account after interest is added
        savingsAccount.displayBalance();

        // Display the initial balance of the checking account
        checkingAccount.displayBalance();

        // Withdraw money from the checking account
        checkingAccount.withdraw(700.0);

        // Display the balance of the checking account after withdrawal
        checkingAccount.displayBalance();
    }
}

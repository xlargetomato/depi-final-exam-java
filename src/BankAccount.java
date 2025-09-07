public class BankAccount {

    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void Deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("The amount available now is : " + this.balance);
        } else {
            System.out.println("Enter valid amount to deposit");
        }
    }

    public void Withdraw(double amount)
    {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("The amount available now is : " + balance);
        }
    }

    public void CheckBalance()
    {
        System.out.println("The amount available now is : " + balance);
    }
}

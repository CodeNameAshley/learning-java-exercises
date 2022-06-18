import java.util.UUID;

public class BankAccount {
    private UUID accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void setAccountNumber () {
        final UUID uniqueAccountNumber = UUID.randomUUID();
        this.accountNumber = uniqueAccountNumber;
    }

    public UUID getAccountNumber () {
        System.out.println("Account number " + this.accountNumber);
        return this.accountNumber;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName () {
        System.out.println("Welcome " + this.customerName);
        return this.customerName;
    }

    public void setBalance(int balance) {
        System.out.println("You have opened an account with the balance of £" + balance);
        this.balance = balance;
    }
    public int getBalance() {
        System.out.println("Your current balance is £" + this.balance);
        return this.balance;
    }


    public void welcomeMessage () {
        getAccountNumber();
        getCustomerName();
    }

    public void depositMoney(int depositedMoney) {
        balance = this.balance + depositedMoney;
        System.out.println("You added £" + depositedMoney + " to your account");
        getBalance();
    }

    public void withdrawMoney(int withdrawnMoney) {
        if (this.balance < withdrawnMoney) {
            System.out.println("You have insufficient funds to withdraw " + withdrawnMoney);
            getBalance();
        } else {
            balance = this.balance - withdrawnMoney;
            System.out.println("You have withdrawn £" + withdrawnMoney);
            getBalance();
        }
    }
}


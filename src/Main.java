public class Main {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount();

        accountOne.setCustomerName("Ashley");
        accountOne.getCustomerName();
        accountOne.setAccountNumber();
        accountOne.getAccountNumber();
        accountOne.setBalance(1000);
        accountOne.getBalance();
        accountOne.depositMoney(500);
        accountOne.withdrawMoney(250);
    }
}
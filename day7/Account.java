public abstract class Account {
    String accountNumber;
    String holderName;
    double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    abstract void showAccountType();
}

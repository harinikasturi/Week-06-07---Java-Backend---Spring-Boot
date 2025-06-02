public abstract class Bank {
    String bankName;
    String branchName;
    static final String BANK_CODE_PREFIX = "BANK-";
    static int counter = 1;

    public Bank(String bankName, String branchName) {
        this.bankName = bankName;
        this.branchName = branchName;
    }

    abstract void openAccount(Account account);
    abstract void displayBankInfo();

    public String generateBankCode(){
        return BANK_CODE_PREFIX + String.valueOf(counter++);
    }


}

public class CheckingsAccount extends Customer implements Interest {

    private long DebitCardNumber;
    private int pin;

//    public CheckingsAccount(String name, long ssnNumber, String accountType, double initialDeposit, long accountNumber, long debitCardNumber, int pin) {
//        super(name, ssnNumber, accountType, initialDeposit, accountNumber);
//        DebitCardNumber = debitCardNumber;
//        this.pin = pin;
//    }

    public CheckingsAccount(String name, long ssnNumber, String accountType, double initialDeposit, long accountNumber, double balance, long debitCardNumber, int pin) {
        super(name, ssnNumber, accountType, initialDeposit, accountNumber, balance);
        DebitCardNumber = debitCardNumber;
        this.pin = pin;
    }

    public CheckingsAccount(long debitCardNumber, int pin) {
        DebitCardNumber = debitCardNumber;
        this.pin = pin;
    }

    public long getDebitCardNumber() {
        return DebitCardNumber;
    }

    public void setDebitCardNumber(long debitCardNumber) {
        DebitCardNumber = debitCardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }


}

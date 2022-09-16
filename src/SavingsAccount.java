public class SavingsAccount extends Customer implements Interest {

    private long depositBoxNumber;
    private int accessingCode;

    public SavingsAccount() {

    }


    public SavingsAccount(String name, long ssnNumber, String accountType, double initialDeposit, long accountNumber, double balance, long depositBoxNumber, int accesingCode) {
        super(name, ssnNumber, accountType, initialDeposit, accountNumber, balance);
        this.depositBoxNumber = depositBoxNumber;
        this.accessingCode = accesingCode;
    }

    public SavingsAccount(long depositBoxNumber, int accesingCode) {
        this.depositBoxNumber = depositBoxNumber;
        this.accessingCode = accesingCode;
    }

    public void setDepositBoxNumber(long depositBoxNumber) {
        this.depositBoxNumber = depositBoxNumber;
    }

    public void setAccesingCode(int accesingCode) {
        this.accessingCode = accesingCode;
    }

    public long getDepositBoxNumber() {
        return depositBoxNumber;
    }

    public int getAccesingCode() {
        return accessingCode;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "name='" + getName() + '\'' +
                ", ssnNumber='" + getSsnNumber() + '\'' +
                ", accountType='" + getAccountType() + '\'' +
                ", initialDeposit='" + getInitialDeposit() + '\'' +
                ", accountNumber='" + getAccountNumber() + '\'' +
                "depositBoxNumber='" + getDepositBoxNumber() + '\'' +
                ", accessingCode='" + getAccesingCode() + '\'' +
                '}';
    }
}

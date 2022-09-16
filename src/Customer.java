import java.util.LinkedList;

public class Customer {
    private String name;
    private long ssnNumber;
    private String accountType;
    private double initialDeposit;
    private long accountNumber;
    private static LinkedList<Customer> linkedList = new LinkedList<>(ExtractionOfCustomers.method());

    private double balance;

    public Customer(String name, long ssnNumber, String accountType, double initialDeposit, long accountNumber, double balance) {
        this.name = name;
        this.ssnNumber = ssnNumber;
        this.accountType = accountType;
        this.initialDeposit = initialDeposit;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Customer() {

    }


    public String getName() {
        return name;
    }

    public long getSsnNumber() {
        return ssnNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsnNumber(long ssnNumber) {
        this.ssnNumber = ssnNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public LinkedList<Customer> getCustomers() {
        return linkedList;
    }

    public static void deposit(long ssnNumber, double amountDeposited) {

        int i;
        for (i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getSsnNumber() == ssnNumber) {
                break;
            }

        }

        double balance = linkedList.get(i).getBalance() + amountDeposited;

        linkedList.get(i).setBalance(balance);
        Customer c = new Customer(linkedList.get(i).getName(), linkedList.get(i).getSsnNumber(), linkedList.get(i).getAccountType(),
                linkedList.get(i).getInitialDeposit(), linkedList.get(i).getAccountNumber(), linkedList.get(i).getBalance());
        linkedList.set(i, c);


    }


        @Override
        public String toString () {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", ssnNumber=" + ssnNumber +
                    ", accountType='" + accountType + '\'' +
                    ", initialDeposit=" + initialDeposit +
                    ", accountNumber=" + accountNumber +
                    ", balance=" + balance +
                    '}';
        }


    public static String showInfo(long ssnNumber) {
        int i;
//       linkedList = new LinkedList(ExtractionOfCustomers.method());
        for (i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getSsnNumber() == ssnNumber) {
               break;
            }

        }

        return "NAME: " + linkedList.get(i).getName() + "\n" +
                "ACCOUNT TYPE: " + linkedList.get(i).getAccountType() + "\n" +
                "SOCIAL SECURITY No: " + linkedList.get(i).getSsnNumber() + "\n" +
                "INITIAL DEPOSIT: " + linkedList.get(i).getInitialDeposit() + "\n" +
                "BALANCE : " + linkedList.get(i).getBalance() + "\n" +
                "ACCOUNT No: " + linkedList.get(i).getAccountNumber();

    }

//    public void edit() {
//        linkedList.set(0, new Customer("Blessing", 456785678, "checkings", 5477, 2345678, 400));
//        System.out.println(getCustomers());
//
//    }

    public void withdraw(long ssnNumber, double amountWithdrawn) {
        int i;
        for (i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getSsnNumber() == ssnNumber) {
                break;
            }

        }

        double remainingBalance = linkedList.get(i).getBalance() - amountWithdrawn;
        System.out.println(remainingBalance);
        linkedList.get(i).setBalance(remainingBalance);
        Customer c = new Customer(linkedList.get(i).getName(), linkedList.get(i).getSsnNumber(), linkedList.get(i).getAccountType(),
                linkedList.get(i).getInitialDeposit(), linkedList.get(i).getAccountNumber(), linkedList.get(i).getBalance());
        linkedList.set(i, c);


    }

    public void transfer(long senderSsNumber, long recipientSsNumber, double amountTransfered) {
        int i, j;
        for (i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getSsnNumber() == senderSsNumber) {
                break;
            }

        }

        double senderNewBalance = linkedList.get(i).getBalance() - amountTransfered;
        System.out.println(senderNewBalance);
        linkedList.get(i).setBalance(senderNewBalance);
        Customer senderCustomer = new Customer(linkedList.get(i).getName(), linkedList.get(i).getSsnNumber(), linkedList.get(i).getAccountType(),
                linkedList.get(i).getInitialDeposit(), linkedList.get(i).getAccountNumber(), linkedList.get(i).getBalance());
        linkedList.set(i, senderCustomer);


        for (j = 0; j < linkedList.size(); j++) {
            if (linkedList.get(j).getSsnNumber() == recipientSsNumber) {
                break;
            }

        }

        double recipientNewBalance = linkedList.get(j).getBalance() + amountTransfered;

        linkedList.get(j).setBalance(recipientNewBalance);
        Customer recipientCustomer = new Customer(linkedList.get(j).getName(), linkedList.get(j).getSsnNumber(), linkedList.get(j).getAccountType(),
                linkedList.get(j).getInitialDeposit(), linkedList.get(j).getAccountNumber(), linkedList.get(j).getBalance());
        linkedList.set(j, recipientCustomer);


    }




}

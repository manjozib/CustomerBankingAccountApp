import java.util.LinkedList;

public class Customer {
    private String name;
    private long ssnNumber;
    private String accountType;
    private double initialDeposit;
    private long accountNumber;
    private static LinkedList<Customer> customers = new LinkedList<>(ExtractionOfCustomers.method());

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
        return customers;
    }

    public static void deposit(long ssnNumber, double amountDeposited) {

        int i;
        for (i = 0; i < customers.size(); i++) {
            if (customers.get(i).getSsnNumber() == ssnNumber) {
                break;
            }

        }

        double balance = customers.get(i).getBalance() + amountDeposited;

        customers.get(i).setBalance(balance);
        Customer c = new Customer(customers.get(i).getName(), customers.get(i).getSsnNumber(), customers.get(i).getAccountType(),
                customers.get(i).getInitialDeposit(), customers.get(i).getAccountNumber(), customers.get(i).getBalance());
        customers.set(i, c);


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
        for (i = 0; i < customers.size(); i++) {
            if (customers.get(i).getSsnNumber() == ssnNumber) {
               break;
            }

        }

        return "NAME: " + customers.get(i).getName() + "\n" +
                "ACCOUNT TYPE: " + customers.get(i).getAccountType() + "\n" +
                "SOCIAL SECURITY No: " + customers.get(i).getSsnNumber() + "\n" +
                "INITIAL DEPOSIT: " + customers.get(i).getInitialDeposit() + "\n" +
                "BALANCE : " + customers.get(i).getBalance() + "\n" +
                "ACCOUNT No: " + customers.get(i).getAccountNumber();

    }

//    public void edit() {
//        linkedList.set(0, new Customer("Blessing", 456785678, "checkings", 5477, 2345678, 400));
//        System.out.println(getCustomers());
//
//    }

    public void withdraw(long ssnNumber, double amountWithdrawn) {
        int i;
        for (i = 0; i < customers.size(); i++) {
            if (customers.get(i).getSsnNumber() == ssnNumber) {
                break;
            }

        }

        double remainingBalance = customers.get(i).getBalance() - amountWithdrawn;
        System.out.println(remainingBalance);
        customers.get(i).setBalance(remainingBalance);
        Customer c = new Customer(customers.get(i).getName(), customers.get(i).getSsnNumber(), customers.get(i).getAccountType(),
                customers.get(i).getInitialDeposit(), customers.get(i).getAccountNumber(), customers.get(i).getBalance());
        customers.set(i, c);


    }

    public void transfer(long senderSsNumber, long recipientSsNumber, double amountTransfered) {
        int i, j;
        for (i = 0; i < customers.size(); i++) {
            if (customers.get(i).getSsnNumber() == senderSsNumber) {
                break;
            }

        }

        double senderNewBalance = customers.get(i).getBalance() - amountTransfered;
        System.out.println(senderNewBalance);
        customers.get(i).setBalance(senderNewBalance);
        Customer senderCustomer = new Customer(customers.get(i).getName(), customers.get(i).getSsnNumber(), customers.get(i).getAccountType(),
                customers.get(i).getInitialDeposit(), customers.get(i).getAccountNumber(), customers.get(i).getBalance());
        customers.set(i, senderCustomer);


        for (j = 0; j < customers.size(); j++) {
            if (customers.get(j).getSsnNumber() == recipientSsNumber) {
                break;
            }

        }

        double recipientNewBalance = customers.get(j).getBalance() + amountTransfered;

        customers.get(j).setBalance(recipientNewBalance);
        Customer recipientCustomer = new Customer(customers.get(j).getName(), customers.get(j).getSsnNumber(), customers.get(j).getAccountType(),
                customers.get(j).getInitialDeposit(), customers.get(j).getAccountNumber(), customers.get(j).getBalance());
        customers.set(j, recipientCustomer);


    }




}

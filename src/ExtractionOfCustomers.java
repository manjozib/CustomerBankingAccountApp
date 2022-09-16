import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ExtractionOfCustomers {

    public static LinkedList<Customer> method() {
        String COMMA_DELIMITER = ",";
        LinkedList<Customer> customers = new LinkedList<>();
        Customer customer = new Customer();
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader("D:\\java\\practice\\CustomerBankingAccountApp\\src\\NewBankAccounts.csv"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                customer.setName(values[0]);
                long ssnNum = Long.parseLong(values[1]);
                customer.setSsnNumber(ssnNum);
                customer.setAccountType(values[2]);
                double initDepo = Double.parseDouble(values[3]);
                customer.setInitialDeposit(initDepo);
                customer.setBalance(customer.getInitialDeposit());

                long accountNumber = Long.parseLong(GenerateAccountNumber.accountNumber(values[2], values[1]));
                customer.setAccountNumber(accountNumber);

                Customer c = new Customer(customer.getName(), customer.getSsnNumber(),
                        customer.getAccountType(), customer.getInitialDeposit(), customer.getAccountNumber(), customer.getBalance());
                customers.add(c);

            }
        } catch (IOException io) {
            io.printStackTrace();
        }
        return customers;
    }

}

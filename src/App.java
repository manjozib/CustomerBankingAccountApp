import java.util.LinkedList;


public class App {
    public static void main(String[] args) {

        Customer customer = new Customer();
        System.out.println(customer.showInfo(444102638));
        System.out.println("After withdraw amount of 400");
        customer.withdraw(444102638, 400);
        System.out.println(customer.showInfo(444102638));
        customer.deposit(444102638, 1000);
        System.out.println("After deposi");
        System.out.println(customer.showInfo(444102638));



    }
}

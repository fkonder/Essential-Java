import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();


        customers.add(new Customer(1, "Ömer Faruk", "Küçükönder"));
        customers.add(new Customer(2,"Nagihan", "Küçükönder"));
        customers.add(new Customer(3, "Engin", "Demiroğ"));


        for(Customer customer:customers)
            System.out.println(customer.firstName);
    }
}
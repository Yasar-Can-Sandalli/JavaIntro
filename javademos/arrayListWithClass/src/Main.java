import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer engin = new Customer();
        engin.firstName = "Engin";
        engin.lastName = "Demirog";
        engin.id = 5;


        customers.add(new Customer(1,"Yasar Can","Sandalli"));
        customers.add(new Customer(2,"Emirhan","Cakmak"));
        customers.add(new Customer(3,"Hamza","Keles"));
        customers.add(engin);


        for (Customer customer : customers){
            System.out.println(customer.firstName);
        }

    }
}
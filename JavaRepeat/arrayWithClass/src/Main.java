import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer yasarCan = new Customer(1,"Yasar Can","Sandalli");
        customers.add(yasarCan);
        customers.add(new Customer(2,"Emirhan","Cakmak"));
        customers.add(new Customer(3,"Muhammet Ali","Terzi"));


        customers.remove(yasarCan);
        for (Customer customer : customers){
            System.out.println(customer.firstName + " " + customer.lastName);
        }
    }
}
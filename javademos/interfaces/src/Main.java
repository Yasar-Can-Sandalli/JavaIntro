public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal = new SqlServerCustomerDal();
        customerManager.add();
    }
}
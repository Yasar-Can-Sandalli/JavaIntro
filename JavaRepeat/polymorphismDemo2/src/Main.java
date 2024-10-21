public class Main {
    public static void main(String[] args) {
        //Plug and Play
        CustomerManager customerManager1 = new CustomerManager(new DatabaseLogger());
        customerManager1.Add();

        CustomerManager customerManager2 = new CustomerManager(new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger());
        customerManager2.Add();

        CustomerManager customerManager3 = new CustomerManager();
        customerManager3.Add();

    }
}

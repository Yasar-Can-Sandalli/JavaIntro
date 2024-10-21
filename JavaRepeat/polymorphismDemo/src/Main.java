public class Main {
    public static void main(String[] args) {
        //Plug and Play
//        BaseLogger[] loggers = new BaseLogger[] {new EmailLogger(), new FileLogger(), new DatabaseLogger(), new ConsoleLogger()};
//        for (BaseLogger logger : loggers){
//            logger.Log("Log Mesaji");
//        }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.Add();

    }
}
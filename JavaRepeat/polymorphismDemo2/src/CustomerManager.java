public class CustomerManager {

    public CustomerManager(BaseLogger logger){
        logger.Log("Log Mesaji");
    }

    public CustomerManager(BaseLogger... loggers){

        for (BaseLogger logger : loggers){
            logger.Log("Log Mesaji");
        }

    }

    public void Add(){
        System.out.println("Musteri Eklendi");
    }
}

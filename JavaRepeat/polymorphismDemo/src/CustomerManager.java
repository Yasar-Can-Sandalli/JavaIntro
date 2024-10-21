public class CustomerManager{

    private final BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void Add(){
        System.out.println("Musteri Eklendi");
        this.logger.Log("Log Mesaji");
    }
}

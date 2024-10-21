import com.sun.jdi.BooleanValue;

public class BalanceInsufficentException extends Exception{
    private String exceptionMassage = "Default Exception Massage";

    public BalanceInsufficentException(String exceptionMassage){
        this.exceptionMassage = exceptionMassage;
    }

    public BalanceInsufficentException(){

    }

    @Override
    public String getMessage() {
        return this.exceptionMassage;
    }
}

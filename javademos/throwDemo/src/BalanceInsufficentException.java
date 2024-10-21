public class BalanceInsufficentException extends Exception {
    String massage;

    public BalanceInsufficentException(String massage){
        this.massage = massage;
    }

    public String getMassage() {
        return this.massage;
    }
}

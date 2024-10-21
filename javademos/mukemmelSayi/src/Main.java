public class Main {
    public static void main(String[] args) {
       int number =27;
       int mukemmelToplam = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                mukemmelToplam += i;
            }
        }
        if (mukemmelToplam == number) {
            System.out.println("Sayı mükemmeldir");
        }else{
            System.out.println("Sayı mükemmel değildir");
        }



    }
}
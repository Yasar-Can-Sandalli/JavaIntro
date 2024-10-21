public class Main {
    public static void main(String[] args) {
        //220-284 arkadaş sayılar

        int num1 = 1184;
        int num2 = 1210;
        int num1_çarpan_toplam = 0;
        int num2_çarpan_toplam = 0;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0){
                num1_çarpan_toplam += i;
            }
        }
        for (int i = 1; i < num2; i++) {
            if (num2%i == 0) {
                num2_çarpan_toplam += i;
            }
        }
        if (num1 == num2_çarpan_toplam && num2 == num1_çarpan_toplam){
            System.out.println("Bu sayılar arkadaştır");
        }else {
            System.out.println("Bu sayılar arkdaş değildir");
        }

    }
}
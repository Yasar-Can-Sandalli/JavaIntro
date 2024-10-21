public class Main {
    public static void main(String[] args) {
        int number =1003;

        //       boolean itsPrime = true;
        //
        //        for (int i = 2; i <number; i++) {
        //            if (number%i == 0){
        //                itsPrime = false;
        //                break;
        //            }else {
        //                itsPrime = true;
        //            }
        //        }
        //        if (number == 2) {
        //            itsPrime = true;
        //        }
        //        if (number == 1){
        //            itsPrime = false;
        //        }if (number == 0){
        //            itsPrime = false;
        //        }
        //
        //        System.out.println(number + " sayısı asalmı : " + itsPrime);

/*      boolean isPirime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                isPirime = false;
                break;
            }
        }
        //bug
        if (isPirime && number >=2){
            System.out.println("Sayı Asaldır");
        }else if (number < 0 ){
            System.out.println("Neg sayı girilemez !!");
        }else{
            System.out.println("Sayı Asal Değildir");
        }
*/
        String bölenler ="";
        boolean asaslMı = true;
        for (int i = 2; i < number; i++) {
            if (number%i == 0){
                asaslMı = false;
                bölenler = i + " " +  bölenler;
            }
        }

        if (number <2){
            asaslMı = false;
        }
        if (asaslMı) {
            System.out.println("Sayı Asaldır ");
        }else if ( number < 0){
            System.out.println("Neg Sayı Yazılamaz");
        }else {
            System.out.println("Sayı asal değildir ve Bölenleri : " + bölenler);
        }



    }
}

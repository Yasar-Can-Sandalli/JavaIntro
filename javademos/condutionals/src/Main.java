public class Main {
    public static void main(String[] args) {
        double dolarDun = 28.75;
        double dolarBugun = 28.89;

        System.out.println("Dolar : ");

        if (dolarBugun == dolarDun) {
            System.out.println("Sabit Eşitlik İşareti");
        } else if (dolarBugun > dolarDun) {
            System.out.println("Artış Oku ");
        } else if (dolarDun > dolarBugun) {
            System.out.println("Azalış Oku ");
        }

        char grade = 'K';

        switch (grade){
            case'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case  'B':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'C':
                System.out.println("Fena değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Kötü : Kaldınız");
                break;
            default:
                System.out.println("Geçerli Not Girilmedi");
                break;
        }




    }
}
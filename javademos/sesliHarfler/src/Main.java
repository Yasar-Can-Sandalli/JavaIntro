public class Main {
    public static void main(String[] args) {
        /*String harf = "a ";
        String harf2 = harf.toUpperCase();
        if (harf2 == "E " || harf2 == "Ö " || harf2 == "İ " || harf2 == "Ü "){
            System.out.println("İnce Sesli");
        } else if (harf2 == "A " || harf2 == "O " || harf2 == "I " || harf2 == "U ") {
            System.out.println("Kalın Sesli");
        }else{
            System.out.println("Sessiz Harf");
        }
        System.out.println(harf2);*/

        char harf = 'E';
        switch (harf){
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("Kalın Sesli");
                break;
            default:
                System.out.println("İnce Sesli");
        }


    }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String mesaj = "   Bugün hava çok güzel  ";


        /*
        String mesaj2 = " Have a good day";
        System.out.println("5.elaman : " + mesaj.charAt(6)); //index
        System.out.println(mesaj.concat(mesaj2)); // string toplama işlemi yapar
        System.out.println(mesaj.startsWith("A")); // A ile başlıyor  mu ??
        System.out.println(mesaj.endsWith("y")); // A ile bitiyor mu ??
        */

//        char[] chars = new char[5];
//        mesaj.getChars(0,5,chars,0); // destinetion Begin
//        System.out.println(chars);
//        System.out.println(mesaj.indexOf("at"));
//        System.out.println(mesaj.lastIndexOf("a"));

        String yeni_mesaj = mesaj.replace(" ","-");
        System.out.println(yeni_mesaj);
        System.out.println(mesaj.substring(2,4));//index tabanlı  (4 dahil değil)

        for (String word : mesaj.split(" ")){
            System.out.println(word);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        String mesaj2 = "Java11 \u2005";

        System.out.println(mesaj2.trim());
        System.out.println(mesaj2.strip());
    }
}
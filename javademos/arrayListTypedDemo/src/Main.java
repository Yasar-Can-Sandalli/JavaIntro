import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> citys = new ArrayList<String>();
        citys.add("Istanbul");
        citys.add("Izmir");
        citys.add("Aydin");
        citys.add("Ankara");

        citys.remove("Istanbul");//index numarasi yerine arana elamin degeri yazilip varsa silinebilir


        Collections.sort(citys);
        Collections.reverse(citys);
        for (String city :  citys){
            System.out.println(city);
        }
    }
}
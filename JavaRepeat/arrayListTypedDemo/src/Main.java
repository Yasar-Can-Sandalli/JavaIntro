import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Izmir");
        cities.add("Aydin");
        cities.add("Rize");
        cities.add("Erzurum");
        cities.add("Kocaeli");


        cities.remove("Ankara");
        Collections.sort(cities);
        for (String city : cities){
            System.out.println(city);
        }

    }
}
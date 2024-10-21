import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> dict = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
                String a = "deneme" + i; // Key her seferinde deneme1, deneme2 şeklinde değişir
                dict.put(a, i);
        }
        System.out.println(dict);
    }
}
//Yaşar:1 YapayZeka:0
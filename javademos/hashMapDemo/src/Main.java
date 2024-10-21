import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<String,String>();
        dictionary.put("Book","Kitap");
        dictionary.put("Table","Masa");
        dictionary.put("Computer","Bilgisayar");
        dictionary.put("Software","Yazilim");
        System.out.println(dictionary.size());

        for (String item : dictionary.keySet() ){
            System.out.println("Eleman= " + item + " " + "Deger= " + dictionary.get(item));
        }

        dictionary.remove("Table");//
        dictionary.clear();


    }
}
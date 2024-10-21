import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers  = new ArrayList();
        numbers.add(1);// Object olarak elaman eklemek icin
        numbers.add(10);
        numbers.add("Ankara");
        // System.out.println(numbers.size());//ArrayListin uzunlugu

        //numbers.set(2,100);//ArrayList teki bir elamini tekrar set etmek icin kullanilir

        //numbers.remove(0);
        //numbers.clear();
        //System.out.println(numbers.get(0)); // istenilen indexteki elamani getirir

        for (Object item : numbers){
            System.out.println(item);
        }

    }
}
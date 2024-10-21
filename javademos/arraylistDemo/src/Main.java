import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(10);
        numbers.add("Gebze");
        //numbers.set(2,"Darica");//istenilen indexteki elemani yeniden set edilmesi
        //numbers.remove(2); //arrayListteki istenilen bir elemani siler
        //System.out.println(numbers.get(1));//arrayList bir elemanin cagirilmasi
        //numbers.clear();
        //System.out.println(numbers.size()); // arrayList in uzunlugu

        for (Object object : numbers){
            System.out.println(object);
        }

    }

}
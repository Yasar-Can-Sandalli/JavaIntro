import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
    }
    public static void readFile(){
        File file = new File("C:\\Users\\sanda\\Desktop\\JavaRepeat\\files\\students.txt");
        try {
            Scanner scanner = new Scanner(file);
            String name = scanner.nextLine();



            boolean a = true;
            while (scanner.hasNextLine()){
                if (name ==  scanner.nextLine()){
                    a = false;
                    break;
                }else {
                    name = scanner.nextLine();
                }
            }

            if (a){
               System.out.println("Tum isimler birbirinden farklidir !");
            }else {
                System.out.println("Ayni anda birden fazla isim saptandi !");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
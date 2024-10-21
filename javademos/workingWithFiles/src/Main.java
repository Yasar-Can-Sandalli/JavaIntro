import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile(){
        File file = new File("C:\\Users\\sanda\\Desktop\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()){ //yoksa bu dosyayi uretir ve urettigi icin true dondurur eger varsa uretmez cunku zaten var ve  uretmedigi icin false dondurur
                System.out.println("Dosya olusturuldu");
            }else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\sanda\\Desktop\\javademos\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya Adi : " + file.getName());
            System.out.println("Dosya Yolu : " + file.getAbsolutePath());
            System.out.println("Dosya Yazilabilir mi : " + file.canWrite());
            System.out.println("Dosya okunabilir mi : " + file.canRead());
            System.out.println("Dosya boyutu : " + file.length());

        }
    }

    public static void readFile(){
        File file = new File("C:\\Users\\sanda\\Desktop\\javademos\\files\\students.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){ // Yeni satır var mı dıye bakar varsa true döner yoksa  false doner
                String line = scanner.nextLine();// Satırı okur ve okudugu degerı lıne degıskenıne atar
                System.out.println(line);// line degiskenıne atana  ifadeyi ekrana yazar
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\sanda\\Desktop\\javademos\\files\\students.txt",true));
            writer.newLine();// Yeni satira gecer
            writer.write("Hamza");
            System.out.println("Dosyaya yazildi");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //createFile();f
        //getFileInfo();
        readFile();
        System.out.println("============");
        writeFile("Muhammed Yusuf");
        readFile();
    }
    public static void createFile(){
        //Dosya Olusturma
        File file = new File("C:\\Users\\sanda\\Desktop\\JavaRepeat\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya uretildi");
            }else {
                System.out.println("Dosya zaten var !");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getFileInfo(){
        File file = new File("C:\\Users\\sanda\\Desktop\\JavaRepeat\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adi : " + file.getName());
            System.out.println("Dosya yolu : " + file.getAbsolutePath());
            System.out.println("Dosya yazilabilir mi ? : " + file.canWrite());
            System.out.println("Dosya okunabilir mi ? : "+ file.canRead());
            System.out.println("Dosya boyutu : "+ file.length());
        }
    }
    public static void readFile(){
        File file = new File("C:\\Users\\sanda\\Desktop\\JavaRepeat\\files\\students.txt");

        try {
            Scanner reader = new Scanner(file);
            int total = 0;
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(String str){

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\sanda\\Desktop\\JavaRepeat\\files\\students.txt",true));
            writer.newLine();
            writer.write(str);
            System.out.println("Dosyaya Yazildi");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
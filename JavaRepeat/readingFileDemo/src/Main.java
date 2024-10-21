import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\sanda\\Desktop\\JavaRepeat\\readingFileDemo\\src\\numbers.txt"));
            String line = null;
            while ((line = reader.readLine()) != null){
                total += Integer.valueOf(line);// Stringi int e cevirme
            }
            System.out.println("Sayilarin Toplami : " + total);

        } catch (FileNotFoundException e) {

            System.out.println(e);

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
import matematik.*;
//import matematik.DortIslem;
//import matematik.Logaritma;


import java.util.Scanner;
//built-in

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adinizi Giriniz : ");

        String  firstName = scanner.nextLine();

        System.out.println("Hosgeldin " + firstName);

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(23,3));

        Logaritma logaritma = new Logaritma();
        System.out.println(logaritma.logaritmaHesapla());
    }
}
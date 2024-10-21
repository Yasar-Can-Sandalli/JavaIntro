public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Kocaeli";
        sehirler[0][2] = "Bursa";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Eskişehir";
        sehirler[2][0] = "Rize";
        sehirler[2][1] = "Trabzon";
        sehirler[2][2] = "Artvin";
        // nested loop
        for (int i = 0; i < sehirler.length; i++) {
            if (i == 0) {
                System.out.println("----Marmara Bölgesi----");
            } else if (i == 1) {
                System.out.println("----İç Anadalu Bölgesi----");
            }else {
                System.out.println("----Karadeniz Bölgesi----");
            }

            for (int j = 0; j < sehirler.length; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
        
    }
}
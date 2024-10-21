public class DatabaseHelper {

    public static class Crud{ //! Create Read Update Delete
        public static void Create(){
            System.out.println("Urun olusturuldu");
        }
        public static void Update(){
            System.out.println("Urun Guncellendi");
        }
    }//inner class

    public static class Connectin{
        public static void oracle(){
            System.out.println("Baglanti Acildi : Oracle");
        }
        public static void sqlServer(){
            System.out.println("Oracle Baglanti Acildi : Sql Server");
        }
    }

    public static class Disconnectin{
        public static void oracle(){
            System.out.println("Baglanti Kapatildi : Oracle");
        }
        public static void sqlServer(){
            System.out.println("Baglanti Kapatildi : Sql Server");
        }
    }

}

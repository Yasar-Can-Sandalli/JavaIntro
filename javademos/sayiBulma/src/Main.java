public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};

        int find = 0;
        boolean varMı = false;

        for(int number : numbers){
            if (number == find){
                varMı = true;
                break;
            }
        }

        if (varMı == true) {
            System.out.println("Sayı var");
        } else if (varMı ==false ) {
            System.err.println("Sayı yok");
        }
        //DRY Do not repeat your self

    }
}
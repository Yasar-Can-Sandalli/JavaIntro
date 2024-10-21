public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3};

        try {
            System.out.println(numbers[45]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Loglandi : " + e);
        }finally {
            System.out.println("Ben her turlu calisiirm");
        }



    }
}
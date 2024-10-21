public class Main {
    public static void main(String[] args) {


        try {
            int[] numbers = {1,2,3};
            System.out.println(numbers[5]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (Exception exception){
            System.out.println("Loglandi : " + exception);
        }
        finally {
            System.out.println("Ben her turlu calisirim");
        }

    }
}
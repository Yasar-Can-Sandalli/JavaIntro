public class Main {
    public static void main(String[] args) {

        //For loop
        for (int i = 2; i <=10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Loop is Finished");

        //While loop
        int i = 0 ;
        while (i <= 10){
            System.out.println(i); //ınfinite loop
            i++;
        }
        System.out.println("While Loop is Finished ");
        System.out.println("The value of 'i' is  : " + i);

        //Do-While loop
        int a = 15;
        do {
            System.out.println(a);
            a++;
        }while (a <= 10);
        System.out.println("The value of 'a' is  : " + a);
        System.out.println("Do-While Loop is Finished");
    }

}

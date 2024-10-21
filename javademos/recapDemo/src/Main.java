public class Main {
    public static void main(String[] args) {

        double[] MyList = { 1.3 , 2.5 , 3.7 , 0.001};
        double sum = 0;
        double max = MyList[0];

        for (double number : MyList) {
            if (number > max) {
                max = number;
            } else {
                continue;
            }
            sum += number;
            System.out.println(number);
        }


        System.out.println("En Büyük Değer : " + max);
        System.out.println("Toplam : " + sum);

    }
}
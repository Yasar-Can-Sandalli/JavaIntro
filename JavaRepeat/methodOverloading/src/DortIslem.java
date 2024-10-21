public class DortIslem {

    public int toplaSonsuz(int... numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int topla(int num1, int num2){
        return num1 + num2;
    }

    public int topla(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

}

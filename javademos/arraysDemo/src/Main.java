public class Main {
    public static void main(String[] args) {


        String student1 = "Yaşar Can";
        String student2 = "Emirhan";
        String student3 = "Muhammet Ali";
        String student4 = "Veli";
        // Control + Shift + Alt + L
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("--------------------");

        String[] students  = new String[3];
        students[0] = "Ali";
        students[1] = "Emirhan";
        students[2] = "Muhammet Ali";
        //students[3] = "Ahmet";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("--------------------");

        for (String student : students) {
            System.out.println(student);
        }


    }
}
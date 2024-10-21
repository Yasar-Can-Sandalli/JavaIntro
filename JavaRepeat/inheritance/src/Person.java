public class Person {
    int id;
    String firstName;
    String lastName;
    private String fullName = firstName + " " + lastName;
    int age;

    public String getFullName(){
        return fullName;
    }

}

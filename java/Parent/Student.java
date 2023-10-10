package Parent;

public class Student extends Person{
    String regNo;


    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getAge());
    }
}

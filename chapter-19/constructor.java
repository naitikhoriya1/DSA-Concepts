public class constructor {

    public static void main(String[] args) {
        Student s1 = new Student("Naitik");
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int rollNo;

    Student(String name) {
        this.name = name;
    }
}

public class typesOfConstructor {

    public static void main(String[] args) {
        Student s1 = new Student();// Write your code here
        // Student s2 = new Student("Naitik");// Write your code here
        // Student s3 = new Student(19);// Write your code here

        s1.age = 19;
        s1.name = "khushi";
        s1.password = "titititi";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "lalala";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    int age;
    String name;
    String password;
    int marks[];

    // Copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        System.arraycopy(s1.marks, 0, marks, 0, s1.marks.length);
    }

    Student() {
        marks = new int[3];
        System.out.println("Cnstructor is called");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int age) {
        marks = new int[3];
        this.age = age;
    }
}

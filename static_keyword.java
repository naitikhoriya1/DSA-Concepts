public class static_keyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.SchoolName = "JNV";

        Students s2 = new Students();
        System.out.println(s2.SchoolName);
    }
}

class Students{
    String name;
    int rollNo;

    static String SchoolName;

    void SetName(String name ){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
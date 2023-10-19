public class heirarchial_inheritance {

    public static void main(String[] args) {
        // creating object of child class and calling the method
        fish ff = new fish();
        ff.eat();
        ff.swim();

    }
}

class Animal {
    String name;
    int age;
    void eat(){
        System.out.println("Animal is eating");
    }
}
class fish extends Animal{
    String type;
    int age;
    void swim() {
        System.out.println("Fish is swimming");
    }
}
class bird extends Animal{
    String type;
    int age;
    void fly(){
        System.out.println("Bird is flying");
    }
}
class mammals{
    String type;
    int age;
    void walk(){
        System.out.println("Mammal is walking");
    }
}
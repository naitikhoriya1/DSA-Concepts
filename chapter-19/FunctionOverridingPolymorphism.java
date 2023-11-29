public class FunctionOverridingPolymorphism {
    public static void main(String[] args) {
        Animal deer = new Deer();
        deer.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer is eating");
    }
}
